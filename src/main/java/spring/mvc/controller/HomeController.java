package spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "json",method = RequestMethod.GET)
	@ResponseBody
	public User testJSON() {
		User user=new User(10, "ANJBJABJ", "HASH12@gmail.com");
		return user;
	}
	
	@RequestMapping(value = "list-json",method = RequestMethod.GET)
	@ResponseBody
	public List<User> testListJSOn(){
		User user=new User(11, "ihAHka  iai i  a", "kajsd1212@gmail.com");
		User user2=new User(12, "hasn1n qoi a ", "asdhn12@gmail.com");
		List<User> listUsers=new ArrayList<User>();
		listUsers.add(user);
		listUsers.add(user2);
		return listUsers;
	}
}
