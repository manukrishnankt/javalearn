package com.learnjava.javalearn.coreapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnjava.javalearn.coreapi.entity.StudentVO;
import com.learnjava.javalearn.coreapi.repository.StudentRepository;
import com.learnjava.javalearn.coreapi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    
    @Override
    public StudentVO getStudentByName(String name) {
        return studentRepository.findByStudentName(name);
    }
}
