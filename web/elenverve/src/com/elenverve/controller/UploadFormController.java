package com.elenverve.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.elenverve.model.UploadForm;

@Controller
@RequestMapping("/")
public class UploadFormController implements HandlerExceptionResolver{

    @RequestMapping(value= "/FileUploadForm", method=RequestMethod.GET)
    public String showForm(ModelMap model){
        UploadForm form = new UploadForm();
        model.addAttribute("FORM", form);
        return "test1";
    }

    @RequestMapping(value= "/FileUploadForm",method=RequestMethod.POST)
    public String processForm(@ModelAttribute("FORM") UploadForm form,BindingResult result){

    	System.out.println("Inside the upload form controller");
        if(!result.hasErrors()){
            FileOutputStream outputStream = null;
            String filePath = System.getProperty("java.io.tmpdir") + "/" + form.getFile().getOriginalFilename();
            try {
                outputStream = new FileOutputStream(new File(filePath));
                //outputStream.write(form.getFile().getFileItem().get());
                outputStream.close();
            } catch (Exception e) {
                System.out.println("Error while saving file");
                return "FileUploadForm";
            }
            System.out.println("Returning success..");
            return "success";
        }else{
            return "FileUploadForm";
        }
    }

    @Override
    public ModelAndView resolveException(HttpServletRequest arg0,
    HttpServletResponse arg1, Object arg2, Exception exception) {
        Map<Object, Object> model = new HashMap<Object, Object>();
        if (exception instanceof MaxUploadSizeExceededException){
            model.put("errors", "File size should be less then "+
            ((MaxUploadSizeExceededException)exception).getMaxUploadSize()+" byte.");
        } else{
            model.put("errors", "Unexpected error: " + exception.getMessage());
        }
        model.put("FORM", new UploadForm());
        return new ModelAndView("/FileUploadForm", (Map) model);
    }
}
