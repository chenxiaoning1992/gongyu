package util;

import java.security.MessageDigest;

public class DataUtil {
	public static String md5(String src){
		try {
			StringBuffer buffer = new StringBuffer();
			char[] chars = {'0','1', '2','3', '4','5', '6','7','8','9', 'A','B', 'C','D','E','F'};
			byte[] bytes = src.getBytes();
			MessageDigest digest = MessageDigest.getInstance("md5");
			byte[] targ = digest.digest(bytes);
			for(byte b :targ){
				buffer.append(chars[(b >> 4) & 0x0F]);
				buffer.append(chars[b & 0x0F]);
			}
			return buffer.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
