package com.example.app.inquiry.repository;

import java.util.List;

import com.example.app.inquiry.entity.Inquiry;

/**
 * @author ryo
 * Daoインターフェース
 */
public interface InquiryDao {

	/**
	*データ取得メソッド 
	* @return List
	*/
	List<Inquiry> getAll();

	/**
	* データ追加メソッド
	* @param inquiry 登録フォーム
	*/
	public void insertInquiry(Inquiry inquiry);

}
