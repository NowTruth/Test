package com.example.app.survey.service;

import java.util.List;

import com.example.app.survey.entity.Survey;

public interface SurveyService {
	
	List<Survey> getAll();
	
	public void save(Survey survey);

}
