/**
 * 
 */
package com.bharathi.app.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bharathi.app.common.constant.JobPortalConstant;
import com.bharathi.app.entity.Job;
import com.bharathi.app.services.JobPortalService;


/**
 * @author bharathidasan
 *
 */
@RestController 
@RequestMapping("/portal/api/v1")
public class JobPortalController {	
	
 @Autowired
 JobPortalService jobPortalService;
	
 @GetMapping(value=JobPortalConstant.LIST_ACCTION_REQ)
 public Map<String,List<Job>> getAllJobDetails(){
		
     List<Job> listofJobs=jobPortalService.findAll();		
	 Map<String,List<Job>> map=new HashMap<String,List<Job>>();
	 map.put(JobPortalConstant.JOB_LIST, listofJobs);
	 return map;
	}
	
 @GetMapping(value ="/jobs/{jobId}")
 public ResponseEntity<Job> getJobDetailById(@PathVariable("jobId") Long jobId){
	 
	 return jobPortalService.getJobDetailById(jobId);
 }
 
  @PostMapping(value = "/jobs")
   public ResponseEntity<String> createNewJob(@RequestBody Job job){
	   
	   return jobPortalService.createNewJob(job);
   }
  
  @PutMapping(value ="/jobs/{jobId}")
  public ResponseEntity<String> updateJobDetail(@RequestBody Job job,
  @PathVariable("jobId") Long jobId){
	  
	  return jobPortalService.updateJobDetail(job, jobId);
	  
  }
  
  @PatchMapping(value ="/jobs/{jobId}")
  public ResponseEntity<?> updateJobDetail(@RequestBody Map<String, Object> updates,
  @PathVariable("jobId") Long jobId){
	  
	  return new ResponseEntity<String>(HttpStatus.OK);
	  
  }
  
  @DeleteMapping(value = "/jobs/{jobId}")
  public ResponseEntity<String> deleteJobDetail(@PathVariable("jobId") Long jobId){
	  
	return jobPortalService.deleteJobDetail(jobId);
	  
  }
	

}
