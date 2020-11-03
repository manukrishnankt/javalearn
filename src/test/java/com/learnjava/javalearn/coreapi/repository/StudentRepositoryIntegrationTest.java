package com.learnjava.javalearn.coreapi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.learnjava.javalearn.coreapi.entity.StudentVO;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StudentRepositoryIntegrationTest {
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private StudentRepository studentRepository;
    
    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
    	StudentVO alex = new StudentVO();
    	alex.setStudentName("Alex");
    	alex.setStudentDob("16-07-1994");
    	
    	alex.setStudentAdmissionId(1L);
        entityManager.persist(alex);
        entityManager.flush();
     
        // when
        StudentVO found = studentRepository.findByStudentName(alex.getStudentName());
     
        // then
        assertThat(found.getStudentName())
          .isEqualTo(alex.getStudentName());
    }
}
