package com.jiakecongc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jiakecongc.pojo.User;
import com.jiakecongc.service.IUserService;

@Controller
public class UserController {

	@Autowired
	public IUserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(User user){
		
		ModelAndView modelAndView = new ModelAndView();
		
		User u = userService.selectUserByUsernameAndPassword(user);
		
		if(u != null){
			modelAndView.addObject("username", u.getUsername());
			modelAndView.addObject("user", u);
			modelAndView.setViewName("view/success.jsp");
		}else{
			return new ModelAndView("redirect:/login.jsp");
		}
		
		return modelAndView;
	}
	
/*	
 * 测试接收字符串  返回值为null报错
 * @RequestMapping("/login1")
	public String login(Model model, HttpServletRequest request){
		
		String str = request.getParameter("username");
		
		System.out.println(str);
		return null;
	}*/
}
