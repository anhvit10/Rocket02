//
package com.vti.template.form;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: NVAnh
 * @create_date: Mar 25, 2020
 * @version: 1.0
 * @modifer: NVAnh
 * @modifer_date: Mar 25, 2020
 */
public class EmplyeeInput {
	private String projectName, proSkill;
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}/**
	 * @param projectName the projectName to set
	 * @return 
	 */
	public EmplyeeInput setProjectName(String projectName) {
		this.projectName = projectName;
		return this;
	}
	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}/**
	 * @param proSkill the proSkill to set
	 * @return 
	 */
	public EmplyeeInput setProSkill(String proSkill) {
		this.proSkill = proSkill;
		return this;
	}
}
