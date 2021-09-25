package com.example.app.survey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.survey.entity.Survey;
import com.example.app.survey.repository.SurveyDaoImpl;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	private final SurveyDaoImpl dao;
	 
	 @Autowired
	 public SurveyServiceImpl(SurveyDaoImpl dao) {
		 this.dao = dao;
	 }
	
	//データの一覧を返す
	public List<Survey> getAll(){
				
		return dao.getAll();
		
	};
	
	//データを追加する
	public void save(Survey survey) {
		
		//データ登録メソッドの呼び出し
		dao.insertSurvey(survey);
		
		
	};
	
	
	
}
