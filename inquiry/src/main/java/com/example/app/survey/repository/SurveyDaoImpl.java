package com.example.app.survey.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.app.survey.entity.Survey;


@Repository
public class SurveyDaoImpl implements SurveyDao {
	
	// JdbcTemplateのインスタンス生成。
	private final JdbcTemplate jdbc;
	
	@Autowired
	public SurveyDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	/**
	 *データ取得メソッド
	 *return List
	 */
	public List<Survey> getAll() {
		
		final String sql = "SELECT id, age, satisfaction, contents, created FROM survey";
		
		// map→keyとvalueの組み合わせ。それをListで受け取る。
        List<Map<String, Object>> getList = jdbc.queryForList(sql);

        // 結果返却用の変数
        List<Survey> surveyList = new ArrayList<>();

        // 取得したデータを結果返却用のListに格納していく
        for (Map<String, Object> map : getList) {

            //Inquiryインスタンスの生成
            Survey survey = new Survey();

            // Inquiryインスタンスに取得したデータをセットする
            survey.setId((Integer) map.get("id"));
            survey.setAge((Integer) map.get("age")); 
            survey.setSatisfaction((Integer) map.get("satisfaction")); 
            
            survey.setContents((String) map.get("contents")); 
            survey.setCreated(((Timestamp) map.get("created")).toLocalDateTime()); 

            //結果返却用のListに追加
            surveyList.add(survey);
        }
        return surveyList;
		
	}
	
	
	public void insertSurvey(Survey survey) {
		
		String sql = "insert into survey(age, satisfaction, contents, created) values(?, ?, ?, ?)";
       
        jdbc.update(sql, survey.getAge(),
                                    survey.getSatisfaction(), survey.getContents(), survey.getCreated());
		
	}

}
