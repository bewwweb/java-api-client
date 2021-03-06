package com.kiuwan.client.model.delivery;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.kiuwan.client.utils.ClassToStringConverter;

@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryBean {
	
	/**
	 * Analysis status that indicates that the delivery is queued waiting for some analysis slot.
	 */
	public static final String INQUEUE_STATUS = "INQUEUE";
	
	/**
	 * Analysis status that indicates that the delivery has failed.
	 */
	public static final String FAIL_STATUS = "FAIL";
	
	/**
	 * Analysis status that indicates that the delivery has been completed successfully.
	 */
	public static final String SUCCESS_STATUS = "SUCCESS";
	
	/**
	 * Analysis status that indicates that the analysis is running.
	 */
	public static final String RUNNING_STATUS = "RUNNING";

	private String code;
	private String label;
	private String creationDate;
	private String qualityModel;
	private String encoding;
	private String invoker;
	private String status;
	private String errorCode;
	private String analysisScope;
	private String changeRequest;
	private String changeRequestStatus;
	private String branchName;
	private String auditResult;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the creationDate
	 */
	public String getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return the qualityModel
	 */
	public String getQualityModel() {
		return qualityModel;
	}

	/**
	 * @param qualityModel the qualityModel to set
	 */
	public void setQualityModel(String qualityModel) {
		this.qualityModel = qualityModel;
	}

	/**
	 * @return the encoding
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * @param encoding the encoding to set
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * @return the invoker
	 */
	public String getInvoker() {
		return invoker;
	}

	/**
	 * @param invoker the invoker to set
	 */
	public void setInvoker(String invoker) {
		this.invoker = invoker;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the analysisScope
	 */
	public String getAnalysisScope() {
		return analysisScope;
	}

	/**
	 * @param analysisScope the analysisScope to set
	 */
	public void setAnalysisScope(String analysisScope) {
		this.analysisScope = analysisScope;
	}

	/**
	 * @return the changeRequest
	 */
	public String getChangeRequest() {
		return changeRequest;
	}

	/**
	 * @param changeRequest the changeRequest to set
	 */
	public void setChangeRequest(String changeRequest) {
		this.changeRequest = changeRequest;
	}

	/**
	 * @return the changeRequestStatus
	 */
	public String getChangeRequestStatus() {
		return changeRequestStatus;
	}

	/**
	 * @param changeRequestStatus the changeRequestStatus to set
	 */
	public void setChangeRequestStatus(String changeRequestStatus) {
		this.changeRequestStatus = changeRequestStatus;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the auditResult
	 */
	public String getAuditResult() {
		return auditResult;
	}

	/**
	 * @param auditResult the auditResult to set
	 */
	public void setAuditResult(String auditResult) {
		this.auditResult = auditResult;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  ClassToStringConverter.toString("Delivery", this);
	}
	
}
