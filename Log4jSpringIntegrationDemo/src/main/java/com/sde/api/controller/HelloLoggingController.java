package com.sde.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloLoggingController {

 static Log log = LogFactory.getLog(HelloLoggingController.class.getName());

 @RequestMapping("/hello")
 public ModelAndView sayLogiingHello(){
  //log it via log4j
  if(log.isDebugEnabled()){
	  log.debug("Start debug");
  }
  log.info("Going to run HelloLoggingController class");
  Map model = new HashMap();
  model.put("message", "Hello world Example with Logging");
  log.info("Exiting the program");
  return new ModelAndView("helloWorld", model);
 }
}