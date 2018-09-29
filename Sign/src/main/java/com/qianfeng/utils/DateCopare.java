package com.qianfeng.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCopare {

	public static void main(String[] args) {
		DateFormat bf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String ss = bf.format(new Date());
		
		String aa = bf.format(new Date());

		if (ss.equals(aa)){ 
			
			}else{ 
				
			} 
	}
}
