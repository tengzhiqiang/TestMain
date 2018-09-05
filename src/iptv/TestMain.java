package iptv;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		String json = "D:/program/shanxiao-git/shiptv/iptv-monitor/src/main/resources/static/iptv/script/map/china.json";
		System.out.println(json.substring(0,json.lastIndexOf("/")));
	}
	
	
	public static void getCalender() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		
//		calendar.add(Calendar.MONTH, -1);
//		calendar.set(Calendar.DAY_OF_MONTH, 23);
		
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		now = calendar.getTime();
		System.out.println(sdf.format(now));
	}
	
	
	/**
	 * yyyyMMddHH
	 * //0到6点数据不作为考虑
	 * @return
	 */
	public static List<Long> getTime() {
		List<Long> nowList = new ArrayList<>();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		
//		calendar.set(Calendar.DAY_OF_MONTH, 23);
		
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		now =  calendar.getTime();
		String str = sdf.format(now);
		String start = str+"06";
		String end = str+"24";
		nowList.add(Long.valueOf(start));
		nowList.add(Long.valueOf(end));
		
		return nowList;
	}
	
	/**
	 * long的数字，格式化之后获取到分钟
	 * @return
	 */
	public static List<Long> getLong(){
		
		List<Long> list = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        
//		calendar.set(Calendar.DAY_OF_MONTH, 23);
        
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 6);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        list.add(calendar.getTimeInMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        list.add(calendar.getTimeInMillis());
        
        return list;
       
	}
	
	/**
	 * yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static List<String> getOrgtime() {
		List<String> nowList = new ArrayList<>();
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		
//		calendar.set(Calendar.DAY_OF_MONTH, 23);
		
		calendar.add(Calendar.DAY_OF_MONTH, -1);
		calendar.set(Calendar.HOUR_OF_DAY, 6);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		now = calendar.getTime();
		String str = sdf.format(now);
		nowList.add(str);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		now = calendar.getTime();
		str = sdf.format(now);
		nowList.add(str);
		return nowList;
	}
	
}
