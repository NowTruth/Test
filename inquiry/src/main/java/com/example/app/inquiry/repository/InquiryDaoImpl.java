package com.example.app.inquiry.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.app.inquiry.entity.Inquiry;

/**
 * Daoクラス
 * @author ryo
 */
@Repository
public class InquiryDaoImpl implements InquiryDao {
	
	// JdbcTemplateのインスタンス生成。
	private final JdbcTemplate jdbc;
	
	@Autowired
	public InquiryDaoImpl(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	/**
	 *データ取得メソッド
	 *return List
	 */
	public List<Inquiry> getAll() {
		
		final String sql = "SELECT id, name, email, contents, created FROM inquiry";
		
		// map→keyとvalueの組み合わせ。それをListで受け取る。
        List<Map<String, Object>> getList = jdbc.queryForList(sql);

        // 結果返却用の変数
        List<Inquiry> inquiryList = new ArrayList<>();

        // 取得したデータを結果返却用のListに格納していく
        for (Map<String, Object> map : getList) {

            //Inquiryインスタンスの生成
            Inquiry inquiry = new Inquiry();

            // Inquiryインスタンスに取得したデータをセットする
            inquiry.setId((Integer) map.get("id"));
            inquiry.setName((String) map.get("name")); 
            inquiry.setEmail((String) map.get("email")); 
            inquiry.setContents((String) map.get("contents")); 
            inquiry.setCreated(((Timestamp) map.get("created")).toLocalDateTime()); 

            //結果返却用のListに追加
            inquiryList.add(inquiry);
        }
        return inquiryList;
		
	}
	
	
	public void insertInquiry(Inquiry inquiry) {
		
		String sql = "insert into inquiry(name, email, contents, created) values(?, ?, ?, ?)";
       
        jdbc.update(sql, inquiry.getName(),
                                    inquiry.getEmail(), inquiry.getContents(), inquiry.getCreated());
		
	}
	
}
