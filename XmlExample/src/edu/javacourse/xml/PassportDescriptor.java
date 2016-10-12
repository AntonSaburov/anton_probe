package edu.javacourse.xml;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class PassportDescriptor
{
    @XmlElement
    private String opsClassName;
    @XmlElement
    private String schemaClassName;
    @XmlElement
    private String ruleFlowConfigFile;
    @XmlElement
    private RuleFiles ruleFiles;

    public String getOpsClassName() {
        return opsClassName;
    }

    public void setOpsClassName(String opsClassName) {
        this.opsClassName = opsClassName;
    }

    public String getSchemaClassName() {
        return schemaClassName;
    }

    public void setSchemaClassName(String schemaClassName) {
        this.schemaClassName = schemaClassName;
    }

    public String getRuleFlowConfigFile() {
        return ruleFlowConfigFile;
    }

    public void setRuleFlowConfigFile(String ruleFlowConfigFile) {
        this.ruleFlowConfigFile = ruleFlowConfigFile;
    }
    
    public RuleFiles getRuleFiles() {
        return ruleFiles;
    }

    public void setRuleFiles(RuleFiles ruleFiles) {
        this.ruleFiles = ruleFiles;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class RuleFiles
    {
        @XmlElement
        private List<String> ruleFile;

        public List<String> getRuleFile() {
            return ruleFile;
        }

        public void setRuleFile(List<String> ruleFile) {
            this.ruleFile = ruleFile;
        }
    }

}
