/**
 * 
 */
package com.bharathi.app.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bharathi.app.dao.JobPortalDao;
import com.bharathi.app.entity.Job;

/**
 * @author aadhirabharathidasan
 *
 */
@Transactional
@Repository
public class JobPortalDaoImpl implements JobPortalDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Job> findAll() {
		
		return (List<Job>) entityManager.createQuery("from Job",Job.class).getResultList();
	}


}
