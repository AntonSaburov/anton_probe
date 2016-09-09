package se.test;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.core.command.runtime.rule.AgendaGroupSetFocusCommand;
import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.command.Command;
import org.kie.api.definition.type.FactType;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.AgendaGroupPoppedEvent;
import org.kie.api.event.rule.AgendaGroupPushedEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.event.rule.RuleFlowGroupActivatedEvent;
import org.kie.api.event.rule.RuleFlowGroupDeactivatedEvent;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.ExecutionResults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.process.ProcessInstance;
import org.kie.api.runtime.rule.Agenda;
import org.kie.api.runtime.rule.AgendaFilter;
import org.kie.api.runtime.rule.EntryPoint;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.Match;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.command.CommandFactory;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.utils.KieHelper;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DroolsTest
{
    private static final int COUNT = 10;
    private static final int ALL = 1;

    private double withBuilder = 0.0;
    private double withConfig = 0.0;
    private double withHelper = 0.0;

    public static void main(String[] args) throws IntrospectionException {

        DroolsTest dt = new DroolsTest();
        try {
            for(int j=0; j<ALL; j++) {
                dt.testWithHelper(false);
//                dt.testWithConfigFile(false);
//                dt.testWithBuilder(false);
            }
            for(int j=0; j<ALL; j++) {
                dt.testWithHelper(false);
//                System.out.println();
//                System.out.println("------------------- DSL example");
//                dt.testWithConfigFile(false);
//                dt.testWithBuilder(false);
            }
//            dt.useDsl();
            System.out.println("---------->>>>>>>>>>>>>>>>>>>");
//            System.out.println("Use Builder:" + (dt.withBuilder/ALL));
//            System.out.println("Use Config:" + (dt.withConfig/ALL));
            System.out.println("Use Helper:" + (dt.withHelper/COUNT));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DroolsParserException e) {
            e.printStackTrace();
        }
    }

    public void testWithBuilder(boolean forHot) throws IOException, DroolsParserException {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kfs = kieServices.newKieFileSystem();
//        kfs.write(ResourceFactory.newClassPathResource("se/drools/test/helloWorld1.drl"));
        kfs.write(ResourceFactory.newClassPathResource("se/drools/test/helloWorld2.dsl"));
        kfs.write(ResourceFactory.newClassPathResource("se/drools/test/helloWorld2.drl"));
        KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
        KieContainer kContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
        KieBase kieBase = kContainer.getKieBase();

        long db1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            simpleTestForDrools(kieBase);
        }
        long db2 = System.currentTimeMillis();
        if(!forHot) {
            withBuilder += (db2 - db1);
        }
//        System.out.println("Use Builder:" + (db2 - db1));
    }

    public void testWithConfigFile(boolean forHot) throws IOException, DroolsParserException {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kContainer = kieServices.getKieClasspathContainer();
        KieBase kieBase = kContainer.getKieBase();

        long db1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            simpleTestForDrools(kieBase);
        }
        long db2 = System.currentTimeMillis();
        if(!forHot) {
            withConfig += (db2 - db1);
        }
//        System.out.println("Use Config:" + (db2 - db1));
    }

    public void testWithHelper(boolean forHot) throws IOException, DroolsParserException {
        KieHelper kieHelper = new KieHelper();
        KieBase kieBase = kieHelper
                .addResource(ResourceFactory.newClassPathResource("se/drools/test/helloWorld1.drl"), ResourceType.DRL)
                .build();

        long db1 = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
//            simpleTestForDrools(kieBase);
//            statelessTest(kieBase);
            personCheck(kieBase);
        }
        long db2 = System.currentTimeMillis();
        if(!forHot) {
            withHelper += (db2 - db1);
            System.out.println("HELPER TIME");
        }
//        System.out.println("Use Helper:" + (db2 - db1));
    }

    public void simpleTestForDrools(KieBase kieBase) throws IOException, DroolsParserException {

        final KieSession kieSession = kieBase.newKieSession();
//        final StatelessKieSession kieSession = kieBase.newStatelessKieSession();
//        kieSession.addEventListener(new DefaultAgendaEventListener() {
//            @Override
//            public void agendaGroupPopped(AgendaGroupPoppedEvent event) {
//                System.out.println("POP RULE AGENDA:" + event.getAgendaGroup().getName());
//            }
//
//        });


        List<String> list = new LinkedList<String>();
        kieSession.setGlobal("list", list);

        //EntryPoint atmStream = kieSession.getEntryPoint("ATM");

        Account ac = new Account();
        ac.setAccountNo(12345);
        ac.setBalance(100);
        AccountPeriod ap = new AccountPeriod();
        ap.setStart(new Date(System.currentTimeMillis() - 1000000));
        ap.setEnd(new Date(System.currentTimeMillis() + 1000000));
        CashFlow cf1 = new CashFlow();
        cf1.setAccountNo(12345);
        cf1.setAmount(49);
        cf1.setType(CashFlow.CREDIT);
        cf1.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf2 = new CashFlow();
        cf2.setAccountNo(12345);
        cf2.setAmount(42);
        cf2.setType(CashFlow.DEBIT);
        cf2.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf3 = new CashFlow();
        cf3.setAccountNo(12345);
        cf3.setAmount(0);
        cf3.setType(CashFlow.DEBIT);
        cf3.setDate(new Date(System.currentTimeMillis()));

//        FactHandle insert1 = atmStream.insert(ap);
//        FactHandle insert2 = atmStream.insert(ac);
//        FactHandle insert3 = atmStream.insert(cf1);
//        FactHandle insert4 = atmStream.insert(cf2);
//        FactHandle insert5 = atmStream.insert(cf3);

        FactHandle insert1 = kieSession.insert(ap);
        FactHandle insert2 = kieSession.insert(ac);
        FactHandle insert3 = kieSession.insert(cf1);
        FactHandle insert4 = kieSession.insert(cf2);
        FactHandle insert5 = kieSession.insert(cf3);

//        Agenda agenda = kieSession.getAgenda();
//        agenda.getAgendaGroup( "report" ).setFocus();
//        agenda.getAgendaGroup( "calculation" ).setFocus();

//        kieSession.fireAllRules();

        QueryResults results = kieSession.getQueryResults("Amount", new Object[] {0});
        for ( QueryResultsRow row : results ) {
            System.out.println("Query Result:--------------->>");
            CashFlow cf_1 = (CashFlow) row.get("cash1");
            System.out.println("Result1:" + cf_1.getAmount() + ":" + cf_1.getType());
//            CashFlow cf_2 = (CashFlow) row.get("cash2");
//            System.out.println("Result1:" + cf_2.getAmount() + ":" + cf_2.getType());
//            Account ac_01 = (Account) row.get("ac");
//            System.out.println("Result2:" + ac_01.getAccountNo());
//            AccountPeriod ap_01 = (AccountPeriod) row.get("ap");
//            System.out.println("Result3:" + ap_01.getStart());
//            CashFlow cf_2 = (CashFlow) row.get("cash2");
//            System.out.println("Result2:" + cf_2.getAmount() + ":" + cf_2.getType());
        }
//        System.out.println("TEST ----------->");
//        for(Object obj : kieSession.getObjects()) {
//            System.out.println(obj);
//        }
//        System.out.println("TEST ----------->");

        kieSession.dispose();
    }

    public void simpleTestForDrools2(KieBuilder kieBuilder) throws IOException, DroolsParserException {

        KieServices kieServices = KieServices.Factory.get();

        KieContainer kContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
        KieBase kieBase = kContainer.getKieBase();
//        KieContainer kContainer = kieServices.getKieClasspathContainer();
//        KieBase kieBase = kContainer.getKieBase("KBase");

//        System.out.println("------------------");
//        Collection<KiePackage> pkgs = kieBase.getKiePackages();
//        for(KiePackage pkg : pkgs) {
//            System.out.println("Package:" + pkg.getName());
//            Collection<Rule> rules = pkg.getRules();
//            for(Rule rule : rules) {
//                System.out.println(rule);
//            }
//        }
//        System.out.println("------------------");

        final KieSession kieSession = kieBase.newKieSession();
//        StatelessKieSession kieSession = kieBase.newStatelessKieSession();

//        kieSession.addEventListener(new org.kie.api.event.rule.DebugRuleRuntimeEventListener());
//        kieSession.addEventListener(new org.kie.api.event.rule.DebugAgendaEventListener());
//        kieSession.addEventListener(new DefaultAgendaEventListener() {
//            public void afterMatchFired(AfterMatchFiredEvent event) {
//                super.afterMatchFired(event);
//                System.out.println("EVENT:" + event);
//            }
//        });

//        KieRuntimeLogger logger = kieServices.getLoggers().newFileLogger(kieSession, "mylogfile");

//        final Message message1 = new Message();
//        message1.setMessage("Hello World 1");
//        message1.setStatus(Message.HELLO);
//        final Message message2 = new Message();
//        message2.setMessage("Hello World 2");
//        message2.setStatus(Message.GOOD_DAY);


        List<String> list = new ArrayList<String>();
        kieSession.setGlobal("list", list);
//        kieSession.setGlobal("result", true);
//        m.printMessage("1:" + list.toString());
//        m.printMessage("2:" + list.toString());


//        List<Command> cmds = new ArrayList<Command>();
//        cmds.add( CommandFactory.newSetGlobal( "list", list, true ) );
//        cmds.add( CommandFactory.newInsert( message, "m" ) );
//        ExecutionResults results = kieSession.execute( CommandFactory.newBatchExecution( cmds ) );

//        System.out.println("INSERT *********");
//        FactHandle insert1 = kieSession.insert(message1);
//        FactHandle insert2 = kieSession.insert(message2);

        Account ac = new Account();
        ac.setAccountNo(12345);
        ac.setBalance(100);
        AccountPeriod ap = new AccountPeriod();
        ap.setStart(new Date(System.currentTimeMillis() - 1000000));
        ap.setEnd(new Date(System.currentTimeMillis() + 1000000));
        CashFlow cf1 = new CashFlow();
        cf1.setAccountNo(12345);
        cf1.setAmount(49);
        cf1.setType(CashFlow.CREDIT);
        cf1.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf2 = new CashFlow();
        cf2.setAccountNo(12345);
        cf2.setAmount(42);
        cf2.setType(CashFlow.DEBIT);
        cf2.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf3 = new CashFlow();
        cf3.setAccountNo(12345);
        cf3.setAmount(0);
        cf3.setType(CashFlow.DEBIT);
        cf3.setDate(new Date(System.currentTimeMillis()));

        FactHandle insert3 = kieSession.insert(ap);
        FactHandle insert4 = kieSession.insert(ac);
        FactHandle insert5 = kieSession.insert(cf1);
        FactHandle insert6 = kieSession.insert(cf2);
        FactHandle insert7 = kieSession.insert(cf3);

        Agenda agenda = kieSession.getAgenda();
        agenda.getAgendaGroup( "report" ).setFocus();
        agenda.getAgendaGroup( "calculation" ).setFocus();
//        agenda.getAgendaGroup( "report2" ).setFocus();
        kieSession.fireAllRules();
//        System.out.println(ac.getBalance());

//        System.out.println("DELETE *********");
//        kieSession.delete(insert1);
//        kieSession.delete(insert2);
//        kieSession.fireAllRules();
//
//        System.out.println("*****************************");
//        System.out.println(message1);
//        System.out.println(message2);
//        logger.close();
        kieSession.dispose();

        for(String item : list) {
            System.out.println(item);
        }
    }

    public void statelessTest(KieBase kieBase) throws IOException, DroolsParserException {
        StatelessKieSession kieSession = kieBase.newStatelessKieSession();

        Account ac = new Account();
        ac.setAccountNo(12345);
        ac.setBalance(100);
        AccountPeriod ap = new AccountPeriod();
        ap.setStart(new Date(System.currentTimeMillis() - 1000000));
        ap.setEnd(new Date(System.currentTimeMillis() + 1000000));
        CashFlow cf1 = new CashFlow();
        cf1.setAccountNo(12345);
        cf1.setAmount(49);
        cf1.setType(CashFlow.CREDIT);
        cf1.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf2 = new CashFlow();
        cf2.setAccountNo(12345);
        cf2.setAmount(42);
        cf2.setType(CashFlow.DEBIT);
        cf2.setDate(new Date(System.currentTimeMillis()));
        CashFlow cf3 = new CashFlow();
        cf3.setAccountNo(12345);
        cf3.setAmount(0);
        cf3.setType(CashFlow.DEBIT);
        cf3.setDate(new Date(System.currentTimeMillis()));

//        RuleNameEndsWithAgendaFilter filter = new RuleNameEndsWithAgendaFilter("calculation");

        List<Command> cmds = new ArrayList<Command>();
        cmds.add( CommandFactory.newSetGlobal( "list", new ArrayList(), true ) );
//        cmds.add(new FireAllRulesCommand(filter));
        cmds.add( CommandFactory.newInsertElements(Arrays.asList(new Object[] {ac, ap, cf1, cf2, cf3 })));
        cmds.add( new AgendaGroupSetFocusCommand("report"));
        cmds.add( new AgendaGroupSetFocusCommand("calculation"));
        ExecutionResults results = kieSession.execute( CommandFactory.newBatchExecution( cmds ) );
//        kieSession.execute(Arrays.asList(new Object[]{ap, ac, cf1, cf2, cf3}) );

    }

    public void useDsl() {
        final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

        kbuilder.add( ResourceFactory.newClassPathResource("se/drools/test/helloWorld2.dsl"), ResourceType.DSL );
        kbuilder.add( ResourceFactory.newClassPathResource("se/drools/test/helloWorld2.drl"), ResourceType.DSLR );

        long d1 = System.currentTimeMillis();
        for(int j=0; j<1000; j++) {
            KieSession session = kbuilder.newKnowledgeBase().newKieSession();

            CashFlow cf1 = new CashFlow();
            cf1.setAccountNo(12345);
            cf1.setAmount(49);
            cf1.setType(CashFlow.CREDIT);
            cf1.setDate(new Date(System.currentTimeMillis()));
            session.insert(cf1);

            session.fireAllRules();
            session.dispose();
        }
        long d2 = System.currentTimeMillis();
        System.out.println("Time:" + (d2 - d1));
    }

    private void personCheck(KieBase kieBase) {
        final KieSession kieSession = kieBase.newKieSession();

        Map<String, Integer> orderRule = new HashMap<>();
        orderRule.put("Infer Child", 15);
        orderRule.put("Infer Adult", 15);
        orderRule.put("Issue Child Bus Pass", 10);
        orderRule.put("Issue Adult Bus Pass", 10);
        kieSession.setGlobal("map", orderRule);

        Person p1 = new Person("Peter", 21);
        Person p2 = new Person("Vlada", 11);
        Person p3 = new Person("Olga", 44);
        Person p4 = new Person("Anton", 48);
        Person p5 = new Person("Boris", 3);

        FactHandle insert1 = kieSession.insert(p1);
        FactHandle insert2 = kieSession.insert(p2);
        FactHandle insert3 = kieSession.insert(p3);
        FactHandle insert4 = kieSession.insert(p4);
        FactHandle insert5 = kieSession.insert(p5);
        kieSession.fireAllRules();

//        System.out.println("TEST ----------->");
//        for(Object obj : kieSession.getObjects()) {
//            System.out.println(obj);
//        }
//        System.out.println("TEST ----------->");

        kieSession.dispose();
    }

}


class RuleNameEndsWithAgendaFilter implements AgendaFilter
{
    private String name;

    public RuleNameEndsWithAgendaFilter(String name) {
        this.name = name;
    }

    @Override
    public boolean accept(Match match) {
        return true;
    }
}