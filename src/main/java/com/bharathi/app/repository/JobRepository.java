package com.bharathi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharathi.app.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
	

}
