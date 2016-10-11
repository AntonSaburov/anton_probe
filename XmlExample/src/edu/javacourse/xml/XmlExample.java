package edu.javacourse.xml;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlExample
{
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(MessagePassportDescriptor.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        MessagePassportDescriptor desc = (MessagePassportDescriptor) jaxbUnmarshaller.unmarshal(getXml());
        System.out.println("RuleFlow:" + desc.getRuleFlowConfigFile());
        desc.getRuleFiles().getRuleFile().stream().forEach(s -> System.out.println("File:" + s) );
    }
    
    private static InputStream getXml() throws Exception {
        FileInputStream fis = new FileInputStream("file.xml");
        byte[] file = new byte[fis.available()];
        fis.read(file);
        ByteArrayInputStream bais = new ByteArrayInputStream(file);
        return bais;
    }
}
