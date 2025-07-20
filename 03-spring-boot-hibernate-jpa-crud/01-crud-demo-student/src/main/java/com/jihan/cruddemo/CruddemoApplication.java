package com.jihan.cruddemo;

import com.jihan.cruddemo.dao.StudentDAO;
import com.jihan.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			findByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
			deleteAllStudents(studentDAO);
		};

		
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}
	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student ...");
		myStudent.setFirstName("John");

		studentDAO.update(myStudent);

		System.out.println("Updated student: " + myStudent);
	}

	private void findByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Rock");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object");
		Student tempStudent = new Student("setyrt", "argsth", "pdrgdh@domain.com");
		System.out.println("Saving new student object");

		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();

		System.out.println("Saved genrated ID:  " + theId);

		System.out.println("retrieving student for ID:  " + theId);

		Student myStudent = studentDAO.findById(theId);
		System.out.println(myStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object");
		Student tempStudent = new Student("paulkhyguyhj", "Rock", "pauljiuy@domain.com");
		System.out.println("Saving new student object");
		
		studentDAO.save(tempStudent);
		
		System.out.println("Saved genrated ID:  " + tempStudent.getId());
	}

}
