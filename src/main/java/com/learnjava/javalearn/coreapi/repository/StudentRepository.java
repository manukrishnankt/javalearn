package com.learnjava.javalearn.coreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnjava.javalearn.coreapi.entity.StudentVO;

@Repository
public interface StudentRepository extends JpaRepository<StudentVO, Long> {
	public StudentVO findByStudentName(String name);
}
