/* when we input data then use POST
 and when we show data then use GET*/

package com.spring.jdbctemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@Controller
public class UserController {
	@Autowired
	UserService userService;	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletRequest response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User());
	    return mav;
	  }	
	@RequestMapping(value = "/register",method=RequestMethod.POST)
	public String registerUser(@ModelAttribute User user ,HttpSession session) {
		userService.register(user);
		//add data inserted message
		session.setAttribute("message", "User Registered Successfully");
		return "register";
	}
	
	@RequestMapping(value = "/showdata",method=RequestMethod.GET)
	public ModelAndView showUsers(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav = new ModelAndView("showUser");
		mav.addObject("users", userService.getAllUsers());
		return mav;
		
	}
}
