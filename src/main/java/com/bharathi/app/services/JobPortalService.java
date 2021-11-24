/**
 * 
 */
package com.bharathi.app.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bharathi.app.entity.Job;

/**
 * @author bharathidasan
 *
 */
public interface JobPortalService {
	
	public List<Job> findAll();
	
	public ResponseEntity<String> createNewJob(Job job);
	
	public ResponseEntity<String> updateJobDetail(Job job,Long id);
	
	public ResponseEntity<String> deleteJobDetail(Long id);
	
	public ResponseEntity<Job> getJobDetailById(Long id);
	

}
