package com.example.tobi.spring.tobi_spring_example;

import com.example.tobi.spring.tobi_spring_example.sample.user.dao.UserDao;
import com.example.tobi.spring.tobi_spring_example.sample.user.domain.User;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class TobiSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TobiSpringExampleApplication.class, args);
		System.out.println("Hello World!!!!!");
	}

	@GetMapping("/daoTest")
	public void daoTest() throws Exception{
		// #####
		UserDao userDao = new UserDao();

		User user = new User();
		
		user.setId("1");
		user.setName("wplee");
		user.setPassword("qwer1234!!");

		userDao.add(user);

		System.out.println(user.getId() + "등록 성공");

		User user2 = userDao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());

		System.out.println(user2.getId() + " 조회 성공");
	}
}
