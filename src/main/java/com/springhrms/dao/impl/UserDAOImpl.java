package com.springhrms.dao.impl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhrms.dao.UserDAO;
import com.springhrms.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User findByUserName(String username) {
		logger.info("UserDAOImpl findByUserName executed");
		return (User) sessionFactory.getCurrentSession().get(User.class, username);
	}

}
