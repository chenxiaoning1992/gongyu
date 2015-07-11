package gongyu;

import org.junit.Test;

import util.DataUtil;

public class TestDataUtil {
	@Test
	public void test(){
		DataUtil dataUtil = new DataUtil();
		String str = "65465";
		String result =dataUtil.md5(str);
		System.out.println(result);
	}
}
