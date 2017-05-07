package point;

import java.sql.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.point.dao.PointDao;
import com.point.dao.UserDao;
import com.point.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-*.xml")    
//@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)  
//@TransactionConfiguration(transactionManager="transactionManager")   
//@Transactional  
public class DaoTest {

	@Autowired
	private UserDao userDao = null;
	
	@Autowired
	private PointDao pointDao = null;
	
	@Test  
	@Ignore
	//@Rollback(true)
	public void testUserDao()
	{
		System.out.println("testUserDao");
		List<User> list = userDao.queryAll();
		for(User user : list)
		{
			System.out.println(user.getId());
		}
		System.out.println("end");			
	}
	
//	@Test
//	//@Transactional
//	//@Rollback(false)
//	public void testPointInsert()
//	{
//		System.out.println("testPointInsert");
//		Date currentDate = new Date(System.currentTimeMillis());
//		try
//		{
//			pointDao.insert(2, currentDate, 100, 20, 30);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		System.out.println("end");	
//	}
	
	@Test
	@Ignore
	public void testPointqueryByUserId()
	{
		System.out.println("testPointqueryByUserId");
		
		System.out.println("end");	
	}
	

}
