package com.example.app.survey.repository;

import java.util.List;

import com.example.app.survey.entity.Survey;

public interface SurveyDao {
	
	List<Survey> getAll();
	
	
	public void insertSurvey(Survey survey);

}
