package com.naastech.firstspringmvcorm.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.naastech.firstspringmvcorm.model.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	@Override
	public void saveStudent(Student st) throws Exception {
		getHibernateTemplate().save(st);
		//throw new Exception();
	}

	@Transactional
	@Override
	public void updateStudent(Student st) {
		getHibernateTemplate().update(st);
	}

	@Transactional
	@Override
	public void deleteStudent(Integer stuId) {
		Student st = getStudent(stuId);
		getHibernateTemplate().delete(st);
	}

	@Override
	public Student getStudent(Integer stuId) {
		Student st = getHibernateTemplate().get(Student.class, stuId);
		return st;
	}

	
	
}
