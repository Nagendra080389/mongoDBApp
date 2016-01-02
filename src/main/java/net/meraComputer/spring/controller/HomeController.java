package net.meraComputer.spring.controller;


import net.meraComputer.spring.model.Cabinet;
import net.meraComputer.spring.model.Role;
import net.meraComputer.spring.model.UserAccount;
import net.meraComputer.spring.model.UserRole;
import net.meraComputer.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * Handles requests for the application home page.
 *
 * Created by amarendra on 08/08/15.
 *
 */
@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	//Password Encoder
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView("login");
		return model;
	}

	@RequestMapping(value = "/register")
	public ModelAndView register() {
		ModelAndView model = new ModelAndView("registerUser");
		return model;
	}

	@RequestMapping(value = "/loginForm", method = RequestMethod.POST)
	public String submit(@ModelAttribute("user") UserAccount user,
						 ModelMap model,  HttpServletRequest request,
						 HttpServletResponse response) {
		String username = user.getUsername();
		String password = user.getPassword();
		UserAccount byUserName = userService.findByUserName(username);
		if(byUserName != null && passwordEncoder.matches(password, byUserName.getPassword())){

				if(byUserName.getRoles().getName().equals("CUSTOMER")){
					String requestedSessionId = request.getRequestedSessionId();
					model.put("sessionID", requestedSessionId);
					model.put("role", byUserName.getRoles());
					return "addCabinet";
				}else {
					return "buyComputer";
				}


		}else {
			model.put("errorMessage","Invalid Login Details");
			return "login";
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(@ModelAttribute("user") UserAccount user,
						 ModelMap model,  HttpServletRequest request,
						 HttpServletResponse response) {
		String sessionID = request.getParameter("sessionID");
		sessionID = sessionID.substring(0, (sessionID.length() - 1));
		String requestedSessionId = request.getRequestedSessionId();
		if(sessionID.equals(requestedSessionId)){
			request.getSession().invalidate();
		}

		return "login";
	}



	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user") UserAccount user,
						 ModelMap model,  HttpServletRequest request,
						 HttpServletResponse response) {
		Role role = new Role();
		UserRole userRole = new UserRole();
		userRole.setRole("CUSTOMER");
		Set<UserRole> userRoles = new HashSet<UserRole>();
		userRoles.add(userRole);
		String encode = passwordEncoder.encode(user.getPassword());
		user.setPassword(encode);
		role.setName("CUSTOMER");
		if(user != null){
			user.setRoles(role);
			user.setUserRole(userRoles);
			userService.saveUser(user);
		}

		return "login";
	}

	@RequestMapping(value = "/addCabinet", method = RequestMethod.POST)
	public String addCabinet(@ModelAttribute("cabinet") Cabinet cabinet,
						   ModelMap model,  HttpServletRequest request,
						   HttpServletResponse response) {

		System.out.println(cabinet.getCabinetType());

		return "login";
	}



}
