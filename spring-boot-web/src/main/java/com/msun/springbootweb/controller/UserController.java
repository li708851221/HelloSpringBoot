package com.msun.springbootweb.controller;

import com.msun.springbootweb.mapper.UserMapper;
import com.msun.springbootweb.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	// 页面跳转
	@RequestMapping("/users")
	public String pageadddatasource() {
		return "userlist";
	}

	@GetMapping(value = "/hello")
	public String hello(Model model) {
		String name = "lee";
		model.addAttribute("name", name);
		model.addAttribute("users", userMapper.getAll());
		return "hello";
	}
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		List<User> users=userMapper.getAll();
		return users;
	}
	
    @RequestMapping("/getUser")
    public User getUser(Long id) {
    	User user=userMapper.getOne(id);
        return user;
    }
    
    @RequestMapping("/add")
    public void save(User user) {
    	userMapper.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(User user) {
    	userMapper.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	userMapper.delete(id);
    }
    
    
}