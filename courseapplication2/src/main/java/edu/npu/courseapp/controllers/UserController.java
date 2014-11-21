package edu.npu.courseapp.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import edu.npu.courseapp.domain.User;
import edu.npu.courseapp.services.UserService;

@Controller
public class UserController {
///membershipinquiry
	@Autowired
	UserService userservice;
	public static final Logger logger =LoggerFactory.getLogger(UserController.class);
	/*@RequestMapping(value="/groupclasses",method = RequestMethod.GET)
	public ModelAndView inquery(){
		ModelAndView modelview;
		modelview = new ModelAndView("groupClass");
		return modelview;
		
	}
	@RequestMapping(value = "/minquiry")
	public ModelAndView inqueryform(){
		ModelAndView modelview;
		modelview = new ModelAndView();
		
		return modelview;
	}
*/	
}
