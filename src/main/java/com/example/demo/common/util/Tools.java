package com.example.demo.common.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tools {
    
    public static String getDate(String format){
        if(format==null||format.equals("")){
            return "";
        }
        Date mydate = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String rt = sdf.format(mydate);
        return rt;
    }  
    public static String toTrim(String str){
    	if(str==null){
    		return "";
    	}
    	if(str.equals("NULL")||str.equals("null")){
    		return "";
    	}
    	return str.trim();  	
    }
	
    public static String formatDate(String datetime,String oldFormat,String newFormat){
    	Date newDate = null;
    	if(datetime==null||oldFormat==null||newFormat==null){
    		return "";
    	}
    	SimpleDateFormat sdf = new SimpleDateFormat(oldFormat);
    	try {
			Date date = sdf.parse(datetime);
			Calendar calendar = Calendar.getInstance();
			calendar.clear();
			calendar.setTime(date);
			newDate = calendar.getTime();
			sdf = new SimpleDateFormat(newFormat);		
		} catch (ParseException e) {
			//记录日志
			return "";
		}
    	return sdf.format(newDate);
    }
	
    public String getBeforeTime(String datetime, String oldFormat,String newFormat, int difftime)
	{
    	String newTime = null;
		
		if (datetime == null || oldFormat == null) {
			return "";
		} 

		Calendar calendar = this.getCalendar(datetime, oldFormat);
		if(calendar==null){
			return "";
		}

		calendar.add(Calendar.HOUR_OF_DAY,-difftime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(newFormat);
        newTime = simpleDateFormat.format(calendar.getTime());
		return newTime;
	}    
    
	private Calendar getCalendar(String datetime, String dateFormat) {
		Calendar calendar = null;
	
		if (datetime == null || dateFormat == null) {
			return null;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

		Date newdate = simpleDateFormat.parse(datetime,
				new ParsePosition(0));
		if (newdate == null) {
			return null;
		}
		calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setTime(newdate);
		return calendar;	
	}

	public static String parseDate(String date_14,Character sign){
		if(date_14==null||"".equals(date_14)||date_14.length()!=14){
			return "";
		}
		StringBuffer date_8 = new StringBuffer();
		date_8.append(date_14.substring(0,4));
		date_8.append(sign.toString());
		date_8.append(date_14.substring(4,6));
		date_8.append(sign.toString());
		date_8.append(date_14.substring(6,8));
		return date_8.toString();
	}

	public static String insertSign(String date_8,Character sign){
		if(date_8==null||"".equals(date_8)||date_8.length()!=8){
			return "";
		}
		StringBuffer new_date = new StringBuffer();
		new_date.append(date_8.substring(0,4));
		new_date.append(sign.toString());
		new_date.append(date_8.substring(4,6));
		new_date.append(sign.toString());
		new_date.append(date_8.substring(6));
		return new_date.toString();
	} 

	public static String deleteSign(String date_8_sign){
		if(date_8_sign==null||"".equals(date_8_sign)||date_8_sign.length()!=10){
			return "";
		}
		StringBuffer new_date = new StringBuffer();
		new_date.append(date_8_sign.substring(0,4));
		new_date.append(date_8_sign.substring(5,7));
		new_date.append(date_8_sign.substring(8));
		return new_date.toString();
	}
}