package com.naastech.firstspringmvcorm.dao;

import com.naastech.firstspringmvcorm.model.Student;

public interface StudentDao {

	public void saveStudent(Student st) throws Exception;
	public void updateStudent(Student st);
	public void deleteStudent(Integer stuId);
	public Student getStudent(Integer stuId);
}
