package com.naastech.firstspringmvcorm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.naastech.firstspringmvcorm.dao.StudentDao;
import com.naastech.firstspringmvcorm.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao;
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		ModelAndView mv = new ModelAndView("addStudent");
		return mv;
	}

	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(HttpServletRequest request) throws Exception {
		Student st = new Student();
		st.setStuId(Integer.parseInt(request.getParameter("stu_id")));
		st.setFirstName(request.getParameter("first_name"));
		st.setLastName(request.getParameter("last_name"));
		//12-JUN-2021
		String date = request.getParameter("joining_date");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date joiningDate= formatter.parse(date);
		st.setJoiningDate(joiningDate);
		dao.saveStudent(st);
		ModelAndView mv = new ModelAndView("student_success");
		return mv;
	}
}
