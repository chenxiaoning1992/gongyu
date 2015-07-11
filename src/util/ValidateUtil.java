package util;

import java.util.Collection;

public class ValidateUtil {
	//校验字符串是否非空
	public static boolean isEmpty(String str){
		return str == null ||"".equals(str.trim());
	}
	
	//校验
	public static  boolean isEmpty(Collection col){
		return col == null||col.isEmpty();
	}
}
