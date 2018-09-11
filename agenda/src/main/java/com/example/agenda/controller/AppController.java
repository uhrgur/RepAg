package com.example.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.agenda.pojos.Personas;
import com.example.agenda.service.IService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Controller
public class AppController {
	
	@Autowired
	private IService iService;
	
	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		logger.info("-- en Listado");		
		List<Personas> listUsers = iService.list();
		ModelAndView model = new ModelAndView("UserList");
		model.addObject("UserList", listUsers);
		return model;
	}
	
	//@RequestMapping(value = "/new", method = RequestMethod.GET)
	/*public ModelAndView newUser() {
		logger.info("-- en NEW");
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", new User());
		return model;		
	}*/
	
	//@RequestMapping(value = "/edit", method = RequestMethod.GET)
	/*public ModelAndView editUser(HttpServletRequest request) {
		logger.info("-- en EDIT");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.get(userId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", user);
		return model;		
	}*/
	
	@GetMapping("/delete")
	public ModelAndView deleteUser(HttpServletRequest request) {
		//logger.info("-- en DELETE");
		int userId = Integer.parseInt(request.getParameter("id"));
		//IService.delete(userId);
		return new ModelAndView("redirect:/");		
	}
	
	//@RequestMapping(value = "/save", method = RequestMethod.POST)
	/*public ModelAndView saveUser(@ModelAttribute User user) {
		logger.info("-- en SAVE");
		userService.add(user);
		return new ModelAndView("redirect:/");
	}*/
	
}