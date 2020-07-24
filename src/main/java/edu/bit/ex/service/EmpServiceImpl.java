package edu.bit.ex.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service("service")
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {

	@Inject 
	private EmpMapper mapper;
	
	@Override
	public List<EmpVO> list() {
		return mapper.list();
		
	}

}
