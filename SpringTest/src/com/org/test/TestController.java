package com.org.test;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
@PropertySource("classpath:/com/org/test/foo.properties")
public class TestController{
 
	@Autowired
	IMultiply tem;
	
	@Resource
	Environment env;
	
   @RequestMapping("/this")
   public String printHello(ModelMap model) {
	  int c=1;
	  c=tem.multiply(5, 6);
      model.addAttribute("message", env.getProperty("test")+c);

      return "hello";
   }

}