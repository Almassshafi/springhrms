package com.springhrms.service;

import com.springhrms.model.Job;
import java.util.List;

/**
 *
 * @author Manish gour
 */
public interface JobService {

    public long createJob(Job job);

    public Job updateJob(Job job);

    public void deleteJob(long id);

    public List<Job> getAllJobs();

    public Job getJob(long id);
}