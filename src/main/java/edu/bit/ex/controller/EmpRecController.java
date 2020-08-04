package edu.bit.ex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.bit.ex.service.EmpService;
import edu.bit.ex.vo.EmpVO;
import edu.bit.ex.vo.RectVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@AllArgsConstructor
public class EmpRecController {
	
//	@Inject
	private EmpService service;
	
//	@GetMapping("/list")
//	public void list(Model model) {
//		log.info("list....");
//		model.addAttribute("list", service.list());
//	}
	
	@ResponseBody
	@RequestMapping("/restful/recAjax")
	public double recArea(RectVO rec) {
		
		log.info("recArea");
		return rec.getArea();
	}
	
	@RequestMapping("/restful/rect")
	public String rec() {
		
		log.info("recAjax");
		return "recAjax";
	}
	
}
