package edu.bit.ex.db;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.service.EmpService;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DataSourceTest {

	@Inject
	DataSource datasource;

	@Inject
	EmpService EmpService;
	
	@Test
	public void testDataSource() {
		log.info(datasource);
//		System.out.println(datasource); log 랑 같은거 뿌리는데 왜 sysout는 사용하지 않을까???
	}
	@Test
	public void testEmpService() {
		log.info("%%log : " + EmpService.list());
		System.out.println("%%sysout : " + EmpService.list());
	}

}
