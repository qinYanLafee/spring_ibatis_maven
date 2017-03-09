package com.raycloud.utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	//���ַ���ת����������
	public static Date stringToDate(String format,String strDate) {
		DateFormat df = new SimpleDateFormat(format);
		Date d = null;
		try {
			d = df.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}
    /*����1*/
	//��������ת�����ַ���
	public static String dateToString(String format,Date date) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}

}
