package gongyu;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	@Test
	public void test() throws SQLException{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
		
	
			System.out.println(dataSource.getConnection());
		
	}
}
