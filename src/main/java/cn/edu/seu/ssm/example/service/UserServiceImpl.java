package cn.edu.seu.ssm.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.seu.ssm.example.dao.UserDao;
import cn.edu.seu.ssm.example.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;  
	
	
	public User selectUserById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.selectByPrimaryKey(userId);
	}


	@Override
	public int insertUser(User record) {
		// TODO Auto-generated method stub
		return userDao.insert(record);
	}

}
