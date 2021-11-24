/**
 * 
 */
package com.bharathi.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author bharathidasan
 *
 */
@Entity
@Table(name = "jobseeker_details")
public class JobSeeker implements Serializable {
	
	@Id
	private Long id;
	
	
	@Column(name="jobseeker_name")
	private String jobseekerName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private Long phone;
	
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="cv_url")
	private String curriculumVitae;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@Column(name="github_url")
	private String githubURL;
	
	@Column(name="linkeIn_url")
	private String linkeInURL;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the jobseekerName
	 */
	public String getJobseekerName() {
		return jobseekerName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the phone
	 */
	public Long getPhone() {
		return phone;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @return the curriculumVitae
	 */
	public String getCurriculumVitae() {
		return curriculumVitae;
	}

	/**
	 * @return the coverLetter
	 */
	public String getCoverLetter() {
		return coverLetter;
	}

	/**
	 * @return the githubURL
	 */
	public String getGithubURL() {
		return githubURL;
	}

	/**
	 * @return the linkeInURL
	 */
	public String getLinkeInURL() {
		return linkeInURL;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param jobseekerName the jobseekerName to set
	 */
	public void setJobseekerName(String jobseekerName) {
		this.jobseekerName = jobseekerName;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @param curriculumVitae the curriculumVitae to set
	 */
	public void setCurriculumVitae(String curriculumVitae) {
		this.curriculumVitae = curriculumVitae;
	}

	/**
	 * @param coverLetter the coverLetter to set
	 */
	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}

	/**
	 * @param githubURL the githubURL to set
	 */
	public void setGithubURL(String githubURL) {
		this.githubURL = githubURL;
	}

	/**
	 * @param linkeInURL the linkeInURL to set
	 */
	public void setLinkeInURL(String linkeInURL) {
		this.linkeInURL = linkeInURL;
	}

	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", jobseekerName=" + jobseekerName + ", email=" + email + ", phone=" + phone
				+ ", countryName=" + countryName + ", curriculumVitae=" + curriculumVitae + ", coverLetter="
				+ coverLetter + ", githubURL=" + githubURL + ", linkeInURL=" + linkeInURL + "]";
	}

	/**
	 * @param jobseekerName
	 * @param email
	 * @param phone
	 * @param countryName
	 * @param curriculumVitae
	 * @param coverLetter
	 * @param githubURL
	 * @param linkeInURL
	 */
	public JobSeeker(String jobseekerName, String email, Long phone, String countryName, String curriculumVitae,
			String coverLetter, String githubURL, String linkeInURL) {
		this.jobseekerName = jobseekerName;
		this.email = email;
		this.phone = phone;
		this.countryName = countryName;
		this.curriculumVitae = curriculumVitae;
		this.coverLetter = coverLetter;
		this.githubURL = githubURL;
		this.linkeInURL = linkeInURL;
	}

	/**
	 * @param id
	 * @param jobseekerName
	 * @param email
	 * @param phone
	 * @param countryName
	 * @param curriculumVitae
	 * @param coverLetter
	 * @param githubURL
	 * @param linkeInURL
	 */
	public JobSeeker(Long id, String jobseekerName, String email, Long phone, String countryName,
			String curriculumVitae, String coverLetter, String githubURL, String linkeInURL) {
		this.id = id;
		this.jobseekerName = jobseekerName;
		this.email = email;
		this.phone = phone;
		this.countryName = countryName;
		this.curriculumVitae = curriculumVitae;
		this.coverLetter = coverLetter;
		this.githubURL = githubURL;
		this.linkeInURL = linkeInURL;
	}

	/**
	 * 
	 */
	public JobSeeker() {
	}
		

}
