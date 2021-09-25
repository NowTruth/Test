package com.example.app.survey;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class SurveyForm {
	
	//必須入力、入力値の範囲0~150
		@Min(value=0, message="{value}以上の値を入力してください。")
		@Max(value=150, message="{value}以下の値を入力してください。")
		private int age;

		//必須入力、入力値の範囲チェック1~5
		@Min(value=1, message="{value}以上の値を入力してください。")
		@Max(value=5, message="{value}以下の値を入力してください。")
		private int satisfaction;

		//必須入力、入力値の文字数１〜20文字
		@NotNull(message = "nullは許可されていません")
		@NotBlank(message = "空白は許可されていません")
		@Length(message = "1~20文字で入力してください", min=1, max=20)
		private String comment;

		/**
		 * コンストラクタ
		 */
		public SurveyForm() {
			
		}

		/**
		 * コンストラクタ
		 * @param age　年齢
		 * @param satisfaction　満足度
		 * @param comment　コメント
		 */
		public SurveyForm(int age, int satisfaction, String comment) {
			super();
			this.age = age;
			this.satisfaction = satisfaction;
			this.comment = comment;
		}

		/**
		 * 年齢取得メソッド
		 * @return int 年齢
		 */
		public int getAge() {
			return age;
		}

		/**
		 * 満足度取得メソッド
		 * @return int 満足度
		 */
		public int getSatisfaction() {
			return satisfaction;
		}

		/**
		 * コメント取得メソッド
		 * @return String コメント
		 */
		public String getComment() {
			return comment;
		}

		/**
		 * 年齢設定メソッド
		 * @param age 年齢
		 */
		public void setAge(int age) {
			this.age = age;
		}

		/**
		 * 満足度設定メソッド
		 * @param satisfaction 満足度
		 */
		public void setSatisfaction(int satisfaction) {
			this.satisfaction = satisfaction;
		}

		/**
		 * コメント設定メソッド
		 * @param comment　コメント
		 */
		public void setComment(String comment) {
			this.comment = comment;
		}		

}
