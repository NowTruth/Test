package com.example.app.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author ryo
 * コントローラークラス
 */
@Controller
public class SurveyController {
	
	/**
	 * 受付クラス
	 * @param surveyForm　インスタンス
	 * @param model　モデル
	 * @return form.html
	 */
	@RequestMapping(value = "survey/form", method = RequestMethod.GET)
	public String form(SurveyForm surveyForm, Model model) {
		//form.htmlに画面遷移
		return "survey/form";
	}
	
	/**
	 * 確認クラス
	 * @param surveyForm　インスタンス
	 * @param error　エラーメッセージ
	 * @param model　モデル
	 * @return　confirm.html
	 */
	@RequestMapping(value = "survey/confirm", method = RequestMethod.POST)
	public String confirm(@Validated SurveyForm surveyForm, BindingResult error, Model model) {

		//入力チェックに引っかかった場合、メッセージを表示してform画面に戻る
		if (error.hasErrors()) {
			return "survey/form";
		}
		
		//confirm.htmlに画面遷移
		return "survey/confirm";

	}
	
	/**
	 * 戻るクラス
	 * @param surveyform　インスタンス
	 * @param model　モデル
	 * @return form.html
	 */
	@RequestMapping(value = "survey/form", method = RequestMethod.POST)
	public String back(SurveyForm surveyform, Model model) {
		//form.htmlに画面遷移
		return "survey/form";
	}
	
	/**
	 * 確定クラス
	 * @param surveyform インスタンス
	 * @param model　モデル
	 * @param error　エラーメッセージ
	 * @param redirectAttributes　フラッシュメッセージ
	 * @return form.html
	 */
	@RequestMapping(value = "survey/complete", method = RequestMethod.POST)
	public String complete(@Validated SurveyForm surveyform, Model model, BindingResult error, RedirectAttributes redirectAttributes) {
		
		//入力チェックに引っかかった場合、メッセージを表示してform画面に戻る
		if (error.hasErrors()) {
			return "survey/form";
		}
		
		//フラッシュメッセージの設定
		redirectAttributes.addFlashAttribute("flashSuccessMsg", "登録が完了しました");

		//form.htmlに画面遷移
		return "redirect:/survey/form";

	}
	
	

}
