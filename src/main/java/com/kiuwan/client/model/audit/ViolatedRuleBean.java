/**
 * 
 */
package com.kiuwan.client.model.audit;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.kiuwan.client.model.HrefBean;
import com.kiuwan.client.utils.ClassToStringConverter;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViolatedRuleBean {
	
    private String ruleCode;
    private Long modelId;
    private Integer defectsCount;
    private Integer filesCount;
    private String effort;
    private String characteristic;
    private String priority;
    private String language;
    private HrefBean files;
    
	/**
	 * @return the ruleCode
	 */
	public String getRuleCode() {
		return ruleCode;
	}
	/**
	 * @param ruleCode the ruleCode to set
	 */
	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
	}
	/**
	 * @return the modelId
	 */
	public Long getModelId() {
		return modelId;
	}
	/**
	 * @param modelId the modelId to set
	 */
	public void setModelId(Long modelId) {
		this.modelId = modelId;
	}
	/**
	 * @return the defectsCount
	 */
	public Integer getDefectsCount() {
		return defectsCount;
	}
	/**
	 * @param defectsCount the defectsCount to set
	 */
	public void setDefectsCount(Integer defectsCount) {
		this.defectsCount = defectsCount;
	}
	/**
	 * @return the filesCount
	 */
	public Integer getFilesCount() {
		return filesCount;
	}
	/**
	 * @param filesCount the filesCount to set
	 */
	public void setFilesCount(Integer filesCount) {
		this.filesCount = filesCount;
	}
	/**
	 * @return the effort
	 */
	public String getEffort() {
		return effort;
	}
	/**
	 * @param effort the effort to set
	 */
	public void setEffort(String effort) {
		this.effort = effort;
	}
	/**
	 * @return the characteristic
	 */
	public String getCharacteristic() {
		return characteristic;
	}
	/**
	 * @param characteristic the characteristic to set
	 */
	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the files
	 */
	public HrefBean getFiles() {
		return files;
	}
	/**
	 * @param files the files to set
	 */
	public void setFiles(HrefBean files) {
		this.files = files;
	}
    
	@Override
	public String toString() {
		return  ClassToStringConverter.toString("Violated rule", this);
	}
}
