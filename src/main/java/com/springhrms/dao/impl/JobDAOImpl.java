package com.springhrms.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhrms.dao.JobDAO;
import com.springhrms.model.Job;
import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class JobDAOImpl implements JobDAO {
    
        private static final Logger logger = LoggerFactory.getLogger(JobDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public long createJob(Job job) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Job updateJob(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteJob(String jobId) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Job> getAllJobs() {
                logger.info("JobDAOImpl getAllJobs method executed");
                Query allJobQuery =  sessionFactory.getCurrentSession().createQuery("from Job");
                allJobQuery.setCacheable(true);
		return (List<Job>) allJobQuery.list();
	}

	@Override
	public Job getJob(String jobId) {
                logger.info("JobDAOImpl getJob method executed");
		return (Job) sessionFactory.getCurrentSession().get(Job.class, jobId);
	}

}
