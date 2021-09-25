package com.example.app.inquiry;

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

import com.example.app.inquiry.entity.Inquiry;
import com.example.app.inquiry.service.InquiryService;

/**
 * @author ryo
 * コントローラークラス
 */
@Controller
public class InquiryController {
	
    private final InquiryService service;
    
    @Autowired
    private InquiryController(InquiryService service) {
    	this.service = service;
    }
	
	/**
	 * @お問い合わせフォーム画面メソッド
	 * @param model 
	 * @return htmlファイルパス
	 */
	@RequestMapping(value = "inquiry/form", method = RequestMethod.GET)
	public String form(InquiryForm inquiryForm, Model model) {

		//form.htmlに画面遷移
		return "inquiry/form";
	}

	/**
	 * お問い合わせ確認画面メソッド
	 * @param model 
	 * @return htmlファイルパス
	 */
	@RequestMapping(value = "inquiry/confirm", method = RequestMethod.POST)
	public String confirm(@Validated InquiryForm inquiryForm, BindingResult error, Model model) {

		//入力チェックに引っかかった場合、メッセージを表示してform画面に戻る
		if (error.hasErrors()) {
			return "inquiry/form";
		}
		
		//confirm.htmlに画面遷移
		return "inquiry/confirm";

	}

	//戻るメソッド
	//値を返す時はURLにセットする値を含めてあげる。
	@RequestMapping(value = "inquiry/form", method = RequestMethod.POST)
	public String back(InquiryForm form, Model model) {
		//form.htmlに画面遷移
		return "inquiry/form";
	}

	//完了メソッド
	@RequestMapping(value = "inquiry/complete", method = RequestMethod.POST)
	public String complete(@Validated InquiryForm form, Model model, BindingResult error, RedirectAttributes redirectAttributes) {
		
		//入力チェックに引っかかった場合、メッセージを表示してform画面に戻る
		if (error.hasErrors()) {
			return "inquiry/form";
		}
		
		Inquiry inquiry = new Inquiry();
		
		inquiry.setName(form.getName());
		inquiry.setEmail(form.getEmail());
		inquiry.setContents(form.getComment());
		inquiry.setCreated(LocalDateTime.now());
		
		service.save(inquiry);
		
		//フラッシュメッセージの設定
		redirectAttributes.addFlashAttribute("flashSuccessMsg", "登録が完了しました");

		//form.htmlに画面遷移
		return "redirect:/inquiry/form";

	}
	
	
	@RequestMapping(value = "inquiry/index", method = RequestMethod.GET)
	public String index(Inquiry inquiry, Model model) {
		
		List<Inquiry> list = service.getAll();
		
		model.addAttribute("inquiryList", list);
		
		
		//form.htmlに画面遷移
		return "inquiry/index";
	}
	
	

}
