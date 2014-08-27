package com.elenverve.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.elenverve.model.UploadForm;

public class FileUploadValidator implements Validator{

	
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return UploadForm.class.isAssignableFrom(arg0);
	}

	
	public void validate(Object uploadedFile, Errors errors) {
		  UploadForm file = (UploadForm) uploadedFile;  
		  
		  if (file.getFile().getSize() == 0) {  
		   errors.rejectValue("file", "Please select a file!");  
		  }  
		
	}
	

}
