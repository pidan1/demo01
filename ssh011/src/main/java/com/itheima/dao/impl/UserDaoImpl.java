package com.itheima.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

/**  
 * ClassName:UserDaoImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年3月9日 下午5:36:57 <br/>       
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public User findById(Integer id) {
		  
		return getHibernateTemplate().get(User.class, id);
	}

}
  
