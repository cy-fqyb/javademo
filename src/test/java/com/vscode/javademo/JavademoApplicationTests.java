package com.vscode.javademo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.vscode.javademo.dao.UserDao;
import com.vscode.javademo.entity.User;

@SpringBootTest
class JavademoApplicationTests {
	@Autowired
	private UserDao userDao;

	@Test
	void testMybatisPlus() {
		System.out.println(("----- selectAll method test ------"));
		List<User> userList = userDao.selectList(null);
		Assert.isTrue(5 == userList.size(), "");
		userList.forEach(System.out::println);
	}

}
