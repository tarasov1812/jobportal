package com.tarasov1812.jobportal.repository;

import com.tarasov1812.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
