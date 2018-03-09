package com.itheima.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

/**  
 * ClassName:UserDaoTest <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午10:16:31 <br/>       
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext*.xml")
public class UserDaoTest {
	@Autowired
	 private UserDao userDao;
	 
	@Test
	public void Tset() {
		User user = userDao.findById(1);
		 assertEquals("zhangsan", user.getUsername());
		 System.out.println(user.getUsername());
    }

		
	}
	 
	 
  
