package edu.bit.ex.mapper;

import java.util.List;

import edu.bit.ex.vo.EmpVO;

public interface EmpMapper {
	
//	ArrayList<EmpVO> list(); 로 안하고 왜 List 로 해줄까?? polymorphism 사용하려고 list 사용함  코드의 유연성 때문 
	List<EmpVO> list();

}
