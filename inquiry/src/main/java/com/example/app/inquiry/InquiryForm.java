package com.example.app.inquiry;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * @author ryo
 * フォームクラス
 */
public class InquiryForm {

	//必須入力
	@NotNull(message = "nullは許可されていません")
	@NotBlank(message = "空白は許可されていません")
	@Length(min = 1, max = 20, message = "1~20文字で入力してください")
	private String name;

	//必須入力、メールアドレス形式
	@NotNull(message = "nullは許可されていません")
	@NotBlank(message = "空白は許可されていません")
	@Email(message = "email形式で入力してください")
	private String email;

	//必須入力
	@NotNull(message = "nullは許可されていません")
	@NotBlank(message = "空白は許可されていません")
	private String comment;

	/**
	 * コンストラスタ
	 */
	public InquiryForm() {

	}

	/**
	 * コンストラスタ
	 * @param name　氏名
	 * @param email　メールアドレス
	 * @param comment　内容
	 */
	public InquiryForm(String name, String email, String comment) {
		super();
		this.name = name;
		this.email = email;
		this.comment = comment;
	}

	/**
	 * 氏名取得メソッド
	 * @return String 氏名
	 */
	public String getName() {
		return name;
	}

	/**
	 * メールアドレス取得メソッド
	 * @return String メールアドレス
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 内容取得メソッド
	 * @return String 内容
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 氏名設定メソッド
	 * @param name 氏名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * メールアドレス設定メソッド
	 * @param email メールアドレス
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 内容設定メソッド
	 * @param comment 内容
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
