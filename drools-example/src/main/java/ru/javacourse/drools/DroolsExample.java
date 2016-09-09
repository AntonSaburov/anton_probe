package ru.javacourse.drools;

import org.apache.commons.io.IOUtils;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

/**
 * Created by S.Anton on 9/9/16.
 */
public class DroolsExample
{
    private static final Logger log = LoggerFactory.getLogger(DroolsExample.class);

    public void executeRules() {
        KieContainer container = prepareRules();
        KieSession session = container.newKieSession();
        session.fireAllRules();
    }

    private KieContainer prepareRules() {
        try {
            InputStream drlStream = new FileInputStream("src/main/resources/ru/javacourse/drools/example.drl");
            byte[] drlContent = IOUtils.toByteArray(drlStream);
            KieFileSystem kfs = prepareKieFileSystem(drlContent);
            KieServices kieServices = KieServices.Factory.get();
            KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
            KieContainer kContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
            log.info("KIE-BASE is built");
            return kContainer;
        } catch (Exception e) {
            log.error("", e);
        }
        return null;
    }

    private KieFileSystem prepareKieFileSystem(byte[] ruleFiles) {
        KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kfs = kieServices.newKieFileSystem();

        String resourceId = "test1234";
        kfs.write(resourceId, ruleFiles);
        log.info("ResourceID:{}", resourceId);
        return kfs;
    }

}
