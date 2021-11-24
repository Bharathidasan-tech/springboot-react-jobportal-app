/**
 * 
 */
package com.bharathi.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author bharathidasan
 *
 */
@Entity
@Table(name = "job_details")
public class Job implements Serializable{
	
	@Id
    @GeneratedValue
	private Long id;
	
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="company_url")
	private String companyURL;
	
	@Column(name="contact_email")
	private String contactEmail;
	
	@Column(name="job_role")
	private String jobRole;
	
	@Column(name="job_location")
	private String jobLocation;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="post_date")
	private String postDate;
	
	@Column(name="close_date")
	private String closeDate;

	/**
	 * 
	 */
	public Job() {
	}

	/**
	 * @param id
	 * @param companyName
	 * @param companyURL
	 * @param contactEmail
	 * @param jobRole
	 * @param jobLocation
	 * @param jobDescription
	 * @param postDate
	 * @param closeDate
	 */
	public Job(Long id,String companyName, String companyURL, String contactEmail, String jobRole,
			String jobLocation, String jobDescription, String postDate, String closeDate) {
		this.id = id;
		this.companyName = companyName;
		this.companyURL = companyURL;
		this.contactEmail = contactEmail;
		this.jobRole = jobRole;
		this.jobLocation = jobLocation;
		this.jobDescription = jobDescription;
		this.postDate = postDate;
		this.closeDate = closeDate;
	}

	/**
	 * @param companyName
	 * @param companyURL
	 * @param contactEmail
	 * @param jobRole
	 * @param jobLocation
	 * @param jobDescription
	 * @param postDate
	 * @param closeDate
	 */
	public Job( String companyName, String companyURL, String contactEmail, String jobRole, String jobLocation,
			String jobDescription, String postDate, String closeDate) {
		this.companyName = companyName;
		this.companyURL = companyURL;
		this.contactEmail = contactEmail;
		this.jobRole = jobRole;
		this.jobLocation = jobLocation;
		this.jobDescription = jobDescription;
		this.postDate = postDate;
		this.closeDate = closeDate;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @return the companyURL
	 */
	public String getCompanyURL() {
		return companyURL;
	}

	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * @return the jobRole
	 */
	public String getJobRole() {
		return jobRole;
	}

	/**
	 * @return the jobLocation
	 */
	public String getJobLocation() {
		return jobLocation;
	}

	/**
	 * @return the jobDescription
	 */
	public String getJobDescription() {
		return jobDescription;
	}

	/**
	 * @return the postDate
	 */
	public String getPostDate() {
		return postDate;
	}

	/**
	 * @return the closeDate
	 */
	public String getCloseDate() {
		return closeDate;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @param companyURL the companyURL to set
	 */
	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * @param jobRole the jobRole to set
	 */
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	/**
	 * @param jobLocation the jobLocation to set
	 */
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	/**
	 * @param jobDescription the jobDescription to set
	 */
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	/**
	 * @param postDate the postDate to set
	 */
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	/**
	 * @param closeDate the closeDate to set
	 */
	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}
		

}
