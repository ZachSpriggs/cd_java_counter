package com.counter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;

@Controller

public class CounterController {

	@RequestMapping("")
	public String index(HttpSession session) {
		if(session.isNew()) {
		session.setAttribute("counter", 0);
		} else {
		Integer count = (Integer)session.getAttribute("counter"); 
		count += 1;
		session.setAttribute("counter", count);
		}
		return "index.jsp";
		
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		session.getAttribute("counter");
		return "count.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("counter", 0);
		return "index.jsp";
	}
	
}
