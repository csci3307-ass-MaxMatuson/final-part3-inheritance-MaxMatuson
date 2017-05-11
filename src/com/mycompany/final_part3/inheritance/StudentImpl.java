package com.mycompany.final_part3.inheritance;

public class StudentImpl extends PersonBaseImpl implements Student {

	String takenCourseTitle;
	
	public StudentImpl(String _name, String _takenCourseTitle) {
		super(_name);
		takenCourseTitle = _takenCourseTitle;
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String studiesFor() {
		return takenCourseTitle;
	}

}
