package com.model;

public class Student
{
	int sid;
	String sname;
	String sdept;
	public Student()
	{
		
	}
	public Student(int sid, String sname, String sdept) 
	{
	
		this.sid = sid;
		this.sname = sname;
		this.sdept = sdept;
	}
	public int getSid() 
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	@Override
	public String toString() 
	{
		return "Student [sid=" + sid + ", sname=" + sname + " sdept=" + sdept + "]";
	}
	
	
	

}
