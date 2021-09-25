package com.example.app.survey;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.survey.entity.Survey;
import com.example.app.survey.service.SurveyService;

/**
 * @author ryo
 * コントローラークラス
 */
@Controller
public class SurveyController {
	
	 private final SurveyService service;
	    
	    @Autowired
	    private SurveyController(SurveyService service) {
	    	this.service = service;
	    }
	
	
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

		Survey survey = new Survey();
		
		survey.setAge(surveyform.getAge());
		survey.setSatisfaction(surveyform.getSatisfaction());
		survey.setContents(surveyform.getComment());
		survey.setCreated(LocalDateTime.now());
		
		service.save(survey);
		
		
		//フラッシュメッセージの設定
		redirectAttributes.addFlashAttribute("flashSuccessMsg", "登録が完了しました");

		//form.htmlに画面遷移
		return "redirect:/survey/form";

	}
	
	
	@RequestMapping(value = "survey", method = RequestMethod.GET)
	public String index(Survey survey, Model model) {
		
		List<Survey> list = service.getAll();
		
		model.addAttribute("surveyList", list);
		
		//form.htmlに画面遷移
		return "survey/survey";
	}
	
	

}
