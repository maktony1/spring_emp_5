package edu.bit.ex.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.bit.ex.service.EmpService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Controller
@Log4j
public class EmpController {
	
	@Inject
	private EmpService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("ggg");
		model.addAttribute("list", service.list());
	}
	
}
