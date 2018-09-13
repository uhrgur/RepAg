package com.example.agenda.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.agenda.pojos.Personas;
import com.example.agenda.service.IService;
import com.example.agenda.service.ServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.agenda.pojos.Personas;



@Controller
public class AppController {

	@Autowired
	private IService iService;

	private static final Logger logger = LoggerFactory.getLogger(AppController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception {
		logger.info("-- en Listado");
		List<Personas> listP = iService.list();
		ModelAndView model = new ModelAndView("Listado");
		model.addObject("lista", listP);
		return model;
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.POST)
	public ModelAndView handleRequestFind(HttpServletRequest request) throws Exception {
		logger.info("-- en Buscar");
		String nombre = request.getParameter("nombre");
		List<Personas> listP = iService.getPersona(nombre);
		ModelAndView model = new ModelAndView("ListaFind");
		model.addObject("lista", listP);
		return model;
	}

	@PostMapping("/edit")
	public ModelAndView handleRequestEdit(HttpServletRequest request){
		logger.info("-- en EDIT");
		int userId = Integer.parseInt(request.getParameter("hola"));
		logger.info("userId tiene el valor:" +userId);
		Personas personita = iService.get(userId);
		ModelAndView model = new ModelAndView("Editar");
		model.addObject("p", personita);
		return model;
	}

	@PostMapping("/commit")
	public ModelAndView handleRequestCommit(HttpServletRequest request){
		logger.info("-- en EDIT");

		String nombre = (String) request.getParameter("nombre");
		String apellido1 = (String) request.getParameter("apellido");
		String dni = (String) request.getParameter("dni");
		Integer userId = Integer.parseInt(request.getParameter("hola"));
		Personas nper = new Personas(userId, nombre, apellido1, dni);

		logger.info("userId tiene el valor:" +userId);
		iService.update(nper);
		return new ModelAndView("redirect:/list");
	}

	/*@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView handleRequest3() throws Exception {
		logger.info("-- en Editar");
		int userId = Integer.parseInt(request.getParameter("hola"));
		Personas personita = iService.get(userId);
		ModelAndView model = new ModelAndView("Editar");
		model.addObject("p", personita);
		return model;
	}*/

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		logger.info("-- en NEW");
		ModelAndView model = new ModelAndView("AddContacto");
		model.addObject("persona", new Personas());
		return model;
	}

	//@RequestMapping(value = "/edit", method = RequestMethod.GET)
	/*public ModelAndView editUser(HttpServletRequest request) {
		logger.info("-- en EDIT");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.get(userId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", user);
		return model;
	}*/


	@PostMapping("/delete")
	public ModelAndView deleteUser(HttpServletRequest request){
		logger.info("-- en DELETE");
		int userId = Integer.parseInt(request.getParameter("hola"));
		logger.info("userId tiene el valor:" +userId);
		Personas p = new Personas();
		p.setIdpersonas(userId);
		iService.delete(p);
		return new ModelAndView("redirect:/list");
	}

	/*@PostMapping("/delete")
	public ModelAndView handleRequest2() throws Exception {
		logger.info("-- en DELETE HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
		int userId = Integer.parseInt(request.getParameter("hola"));
		//List<Personas> listP = iService.list();
		ModelAndView model = new ModelAndView("Listado");
		//model.addObject("lista", listP);
		return model;
	}*/

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute Personas persona, BindingResult bindingResult, Model model) {
		logger.info("-- en SAVE");
		iService.add(persona);
		return new ModelAndView("redirect:/list");
	}

}
