package com.elenverve.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elenverve.dao.DbAccessService;

@Controller
@RequestMapping("/")
public class DefaultController {
	//@Autowired
	protected DbAccessService dbAccess= new DbAccessService();
	
	
	

}
