package cn.edu.seu.ssm.example.service;

import cn.edu.seu.ssm.example.domain.User;

public interface UserService {
	
	User selectUserById(Integer userId);
	
	int insertUser(User record);

}
