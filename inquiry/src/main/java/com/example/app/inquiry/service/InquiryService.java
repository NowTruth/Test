package com.example.app.inquiry.service;

import java.util.List;

import com.example.app.inquiry.entity.Inquiry;

/**
 * Serviceインターフェース
 * @author ryo
 */
public interface InquiryService {

	/**
	 * フォーム取得実行メソッド
	 * @return List
	 */
	List<Inquiry> getAll();

	/**
	 * フォーム登録実行メソッド
	 */
	void save(Inquiry inquiry);

}
