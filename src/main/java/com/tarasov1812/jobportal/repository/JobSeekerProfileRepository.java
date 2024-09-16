package com.tarasov1812.jobportal.repository;

import com.tarasov1812.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}
