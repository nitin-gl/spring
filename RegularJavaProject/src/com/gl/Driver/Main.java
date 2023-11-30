package com.gl.Driver;

import com.gl.service.Teacher;
import com.gl.serviceimpl.GKTeacher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create object of teacher
		Teacher teacher = new GKTeacher();
		
		// use object to get homework
		System.out.println(teacher.getHomework());
		
	}

}