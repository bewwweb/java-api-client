package com.kiuwan.client.model.actionplan;

import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.kiuwan.client.utils.ClassToStringConverter;

/**
 * Bean containing the action plan defect information.
 */
@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DefectFileBean {

	private String name;

	private Integer line;
	
	private String lineText;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the line
	 */
	public Integer getLine() {
		return line;
	}

	/**
	 * @param line the line to set
	 */
	public void setLine(Integer line) {
		this.line = line;
	}

	/**
	 * @return the lineText
	 */
	public String getLineText() {
		return lineText;
	}

	/**
	 * @param lineText the lineText to set
	 */
	public void setLineText(String lineText) {
		this.lineText = lineText;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ClassToStringConverter.toString("File", this);
	}
	
}