package sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SampleController {

	/**
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/")
	public String index(HttpServletRequest request, Model model) {
		
		return "/main/index";
	}

	/**
	 * @param model
	 * @return
	 */
	@GetMapping(value = "/project01")
	public String firstProject(HttpServletRequest request, Model model) {

		return "/project01/index";
	}
}