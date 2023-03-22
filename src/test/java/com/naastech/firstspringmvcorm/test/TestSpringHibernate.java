package com.naastech.firstspringmvcorm.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naastech.firstspringmvcorm.dao.StudentDao;
import com.naastech.firstspringmvcorm.model.Student;


public class TestSpringHibernate {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		StudentDao dao = ctx.getBean("dao", StudentDao.class);
		Student st = new Student(1, "Sachetan-1", "Kaligota-1", new Date());
		dao.saveStudent(st);
//		for(int i=2;i<=50;i++) {
//			Student st = new Student(i,"Sachetan-"+i ,"Kaligota-"+i , new Date());
//			dao.saveStudent(st);
//		}

//		Student st = dao.getStudent(1);
//		System.out.println(st);
//		st.setFirstName("Sachetan-1");
//		st.setLastName("Kaligota-1");
//		dao.updateStudent(st);
//		st = dao.getStudent(1);
//		System.out.println(st);

//		dao.deleteStudent(1);
	}

}
