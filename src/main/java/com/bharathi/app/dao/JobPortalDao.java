/**
 * 
 */
package com.bharathi.app.dao;

import java.util.List;

import com.bharathi.app.entity.Job;

/**
 * @author bharathidasan
 *
 */
public interface JobPortalDao {
	
	public List<Job> findAll();
	
}
