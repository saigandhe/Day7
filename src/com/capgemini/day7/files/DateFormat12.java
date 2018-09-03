package com.capgemini.day7.files;

public class DateFormat12 {
	public static Object checkMagic(int dd, int mm, int yy) {
			
			if(dd*mm==yy)
			{
				System.out.println("Date is Magic");
			}
			else {
				System.out.println("Daet is not Magic");
			}
			return(dd*mm==yy) ;
		}

}
