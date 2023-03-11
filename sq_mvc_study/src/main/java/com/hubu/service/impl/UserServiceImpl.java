package com.hubu.service.impl;

import com.hubu.dao.UserInfoDAO;
import com.hubu.model.UserInfo;
import com.hubu.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class UserServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDAO userInfoDAOImpl;

	public UserInfo getuser() {
		return userInfoDAOImpl.getuser();
	}
}