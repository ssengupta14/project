package com.elenverve.controller;

import org.springframework.stereotype.Controller;

import com.elenverve.dao.DbAccessService;

@Controller
public class DefaultController {
	//@Autowired
	protected DbAccessService dbAccess= new DbAccessService();

	
	

}
