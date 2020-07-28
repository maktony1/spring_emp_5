package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.EmpMapper;
import edu.bit.ex.vo.EmpVO;
import lombok.AllArgsConstructor;

//@Service("service") 그냥 서비스랑 이거랑 차이?
@Service
@AllArgsConstructor
public class EmpServiceImpl implements EmpService {

//	@Inject  이거 해주냐 안해주냐 차이?
	private EmpMapper mapper;
	
	@Override
	public List<EmpVO> list() {
		return mapper.list();
		
	}

}
