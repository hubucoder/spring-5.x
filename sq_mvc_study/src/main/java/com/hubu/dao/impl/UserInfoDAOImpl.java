package com.hubu.dao.impl;

import com.hubu.dao.UserInfoDAO;
import com.hubu.model.UserInfo;
import org.springframework.stereotype.Repository;

@Repository("userInfoDAOImpl")
public class UserInfoDAOImpl implements UserInfoDAO {

	@Override
	public UserInfo getuser() {
		//省略查询数据库，直接构造一个userInfo对象
		UserInfo userInfo = new UserInfo();
		userInfo.setId(1099);
		userInfo.setName("张三丰");
		return userInfo;
	}
}