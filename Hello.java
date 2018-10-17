import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import java.util.*;

public class Hello {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ParseException {
        
		
		Map<String, Object> map = new HashMap<>();
		map.put("CreatedDateTime", "2015-07-13 11:23:11.000");
		
		Calendar cal1 = Calendar.getInstance();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("ddHHmm");
		//sdf.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println("TimeZone : "+ TimeZone.getDefault());
		sdf.setTimeZone(TimeZone.getTimeZone("SST"));
		Date str = sdf.parse(map.get("CreatedDateTime").toString());
		
		System.out.println("date is : "+sdf1.format(str));
		
	}

}
