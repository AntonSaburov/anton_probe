package se.test;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.definitions.rule.impl.RuleImpl;
import org.kie.api.KieBase;
import org.kie.api.definition.rule.Rule;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

public class DroolsTest
{
    private static final int COUNT = 10;
    private static final int ALL = 1;

    public static void main(String[] args) throws IntrospectionException {
        DroolsTest dt = new DroolsTest();
        try {
            dt.testWithHelper(false);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DroolsParserException e) {
            e.printStackTrace();
        }
    }

    public void testWithHelper(boolean forHot) throws IOException, DroolsParserException {
        KieHelper kieHelper = new KieHelper();  
        KieBase kieBase = kieHelper
                .addResource(ResourceFactory.newClassPathResource("se/drools/test/functionTest.drl"), ResourceType.DRL)
                .addResource(ResourceFactory.newClassPathResource("se/drools/test/functionTestCommon.drl"), ResourceType.DRL)
                .build();

        RuleImpl rule = (RuleImpl) kieBase.getRule("", "");

        personCheck(kieBase);
    }

    private void personCheck(KieBase kieBase) {
        URLClassLoader ucl;
        final KieSession kieSession = kieBase.newKieSession();

        List oldList = new ArrayList<>();
        List newList = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            Person oldP = new Person("" + i, i);
            oldList.add(oldP);
            Person newP = new Person("" + i, i * 10);
            newList.add(newP);

            Message oldM = new Message("m_" + i, i*100);
            oldList.add(oldM);
            Message newM = new Message("m_" + i, i*200);
            newList.add(newM);

            kieSession.insert(oldP);
            kieSession.insert(newP);

            kieSession.insert(oldM);
            kieSession.insert(newM);
        }
        kieSession.insert(oldList);
        kieSession.insert(newList);
        kieSession.setGlobal("newList", newList);
        kieSession.setGlobal("oldList", oldList);

        kieSession.fireAllRules();

        kieSession.dispose();
    }
}
