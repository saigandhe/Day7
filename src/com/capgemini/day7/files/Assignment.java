package com.capgemini.day7.files;

import java.time.LocalDate;
import java.util.LinkedList;

public class Assignment {
	String subject;
	LocalDate date;
	public Assignment() {
		super();
		
	}
	public Assignment(String subject, LocalDate date) {
		super();
		this.subject = subject;
		this.date = date;
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public static LinkedList<Assignment> list=new LinkedList<>();
	
	public static boolean adding(Assignment a1)
	{
		if((list.add(a1)))
			return true;
		else
			return false;
	}
	
	public static boolean remove(Assignment a4)
	{
		if((list.remove(a4)))
			return true;
		else 
			return false;
	}
	public static void show()
	{
		for(Assignment a:list)
			System.out.println(a);
	}
	
	public static Assignment search()
	{
		int result = 0;
		Assignment early = list.getFirst();
		
		for(Assignment assignments : list) {
			if (early.equals(assignments)) {
				continue;
			}
			result = assignments.date.compareTo(early.date);
			System.out.println(result);
			if(result<0) {
				early = assignments;
			}
		}
		System.out.println(early);
		return early;
			
	}
	public String getSubject1() {
		return subject;
	}
	public void setSubject1(String subject) {
		this.subject = subject;
	}
	public LocalDate getDate1() {
		return date;
	}
	public void setDate1(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Assignment [subject=" + subject + ", date=" + date + "]";
	}
}

	
	
	

