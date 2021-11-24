/**
 * 
 */
package com.bharathi.app.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bharathi.app.dao.JobPortalDao;
import com.bharathi.app.entity.Job;
import com.bharathi.app.repository.JobRepository;
import com.bharathi.app.services.JobPortalService;

/**
 * @author bharathidasan
 *
 */
@Service
public class JobPortalServiceImpl implements JobPortalService {
	
	@Autowired
	JobPortalDao jobPortalDao;
	
	@Autowired
	private JobRepository jobRepository;

	@Override
	public List<Job> findAll() {
		
		return jobPortalDao.findAll();
	}
	
	@Override
	public ResponseEntity<Job> getJobDetailById(Long id) {		
		
		return new ResponseEntity<Job>(jobRepository.findById(id).get(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> createNewJob(Job job) {
		
		jobRepository.save(job);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@Override
	public ResponseEntity<String> updateJobDetail(Job job, Long id) {
		
		Optional<Job> fetchedJob=jobRepository.findById(id);
		if(fetchedJob.isPresent()) {
			jobRepository.save(job);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}	

	@Override
	public ResponseEntity<String> deleteJobDetail(Long id) {
		jobRepository.deleteById(id);
		 return new ResponseEntity<>(HttpStatus.OK);
	}



}
