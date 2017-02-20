package cn.edu.seu.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.edu.seu.baseTest.SpringTestCase;
import cn.edu.seu.ssm.example.domain.User;
import cn.edu.seu.ssm.example.service.UserService;  

  
/** 
 * 功能概要：UserService单元测试 
 *  
 * @author linbingwen 
 * @since  2015年9月28日  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
      
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(1);  
        logger.debug("查找结果" + user);  
    }      
    
    @Test  
    public void insertUser(){
    	User record = new User();
    	record.setUserId(6);
    	record.setUserName("程健");
    	record.setUserPassword("19920801cj");
    	record.setUserEmail("1103792967@qq.com");
        int success = userService.insertUser(record);  
        logger.debug("插入结果" + success);  
    }  
      
  
}  
