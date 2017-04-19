package ksmart.or.kr;

import java.util.Locale;
import ksmart.or.kr.BoardDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	@Autowired
	BoardDao dao;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// Controller역할
		// Model호출
		model.addAttribute("name","jjdev");
		// View 포워딩
		return "home";
	}
	
}
