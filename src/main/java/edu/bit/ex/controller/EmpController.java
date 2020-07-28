package edu.bit.ex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.bit.ex.service.EmpService;
import edu.bit.ex.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class EmpController {
	
//	@Inject
	private EmpService service;
	
//	@GetMapping("/list")
//	public void list(Model model) {
//		log.info("list....");
//		model.addAttribute("list", service.list());
//	}
	
	@RequestMapping("emplist")
	public String list(Model model) {
		log.info("list");
		List<EmpVO> list = service.list();
		log.info(list);
		
		model.addAttribute("list",service.list());
		
		return "emplist";
	}
	
}
