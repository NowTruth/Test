package com.example.app.inquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.app.inquiry.entity.Inquiry;
import com.example.app.inquiry.repository.InquiryDaoImpl;

@Service
public class InquiryServiceImpl implements InquiryService {
	
	 
	 private final InquiryDaoImpl dao;
	 
	 @Autowired
	 public InquiryServiceImpl(InquiryDaoImpl dao) {
		 this.dao = dao;
	 }
	
	//データの一覧を返す
	public List<Inquiry> getAll(){
				
		return dao.getAll();
		
	};
	
	//データを追加する
	public void save(Inquiry inquiry) {
		
		//データ登録メソッドの呼び出し
		dao.insertInquiry(inquiry);
		
		
	};


}
