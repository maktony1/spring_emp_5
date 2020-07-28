package edu.bit.ex.vo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.sql.Timestamp;
import java.util.Random;

import lombok.Data;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data  //로 만들면 테스트 할 때 toString을 만들어서 sysout 할떄 출력됨

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
public class EmpVO {
  
	private int empno;			//	EMPNO    NOT NULL NUMBER(4)  
	private String ename;		//	ENAME             VARCHAR2(10) 
	private String job;			//	JOB               VARCHAR2(9) 
	private int mgr;			//	MGR               NUMBER(4)  
	private Timestamp hiredate;	//	HIREDATE          DATE 
	private int sal;			//	SAL               NUMBER(7,2)  
	private int comm;			//	COMM              NUMBER(7,2)
	private int deptno;			//	DEPTNO            NUMBER(2)    
	
	public int getPhoto() {
		Random r = new Random();
		return r.nextInt(5)+1;
	}
	
	public EmpVO() {
	}
	
	
	public EmpVO(int empno, String ename, String job, int mgr, Timestamp hiredate, int sal, int comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}


	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Timestamp getHiredate() {
		return hiredate;
	}
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
