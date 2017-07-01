package handzath.springboot.thymeleaf3.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = { "", "/" }, method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Mensaje devuelto desde un @Controller de Spring");
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping(value = { "secure", "secure/" }, method = RequestMethod.GET)
	public ModelAndView secureIndex() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Recurso protegido por Spring Security");
		mav.setViewName("secure/index");
		return mav;
	}	

}