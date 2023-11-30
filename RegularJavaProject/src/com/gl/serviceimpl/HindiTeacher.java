package com.gl.serviceimpl;

import com.gl.service.Teacher;


public class HindiTeacher implements Teacher {

	// defining a private field for dependency
	ExamTip examTip;
	
	public HindiTeacher() {
		
	}
	
	public HindiTeacher(ExamTip theExamTip) {
		examTip = theExamTip;
	}
	
	@Override
	public String getHomework() {
		// TODO Auto-generated method stub
		return "Do one page of Hindi Writing";
	}

}
