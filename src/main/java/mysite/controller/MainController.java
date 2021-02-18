package mysite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	public static Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping(value = "/")
	public String mainPage() {
		
		return "main/main";
	}
	
}
