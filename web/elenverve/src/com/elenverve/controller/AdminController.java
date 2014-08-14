package com.elenverve.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.elenverve.model.Admin;
import com.elenverve.model.Home;
import com.elenverve.model.UploadForm;
import com.elenverve.validator.FileUploadValidator;


@Controller
@RequestMapping("/")
public class AdminController {
	
	@Autowired  
	 FileUploadValidator fileValidator;  
	
	@RequestMapping(value={ "/admin"}, method = RequestMethod.GET)
	public String admin(ModelMap model,HttpServletRequest request) {
		
		
		/*
		ProductParser parser = new ProductParser();
		List<Product> prodList = parser.getProductList();
		model.addAttribute("prodList", prodList);
		*/
		Admin admin = new Admin();
		model.addAttribute("model", admin);
		model.addAttribute("page", "admin");
		return "template";
 
	}
	/*
	 @RequestMapping(value={ "/upload"}, method = RequestMethod.GET)  
	 public ModelAndView fileUploaded(  
	   @ModelAttribute("uploadedFile") fileUpload uploadedFile,BindingResult result) {  
	  InputStream inputStream = null;  
	  OutputStream outputStream = null;  
	  
	  MultipartFile file = uploadedFile.getFile();  
	  fileValidator.validate(uploadedFile, result);  
	  
	  String fileName = file.getOriginalFilename();  
	  
	  if (result.hasErrors()) {  
	   return new ModelAndView("admin");  
	  }  
	  
	  try {  
	   inputStream = file.getInputStream();  
	  
	   File newFile = new File("C:/Users/nagesh.chauhan/files/" + fileName);  
	   if (!newFile.exists()) {  
	    newFile.createNewFile();  
	   }  
	   outputStream = new FileOutputStream(newFile);  
	   int read = 0;  
	   byte[] bytes = new byte[1024];  
	  
	   while ((read = inputStream.read(bytes)) != -1) {  
	    outputStream.write(bytes, 0, read);  
	   }  
	  } catch (IOException e) {  
	   // TODO Auto-generated catch block  
	   e.printStackTrace();  
	  }  
	  
	  return new ModelAndView("admin", "fileMessage", fileName);  
	 }  
*/
}
