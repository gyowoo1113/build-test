package com.yedam.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yedam.app.accessigndatajpa.Customer;
import com.yedam.app.accessigndatajpa.CustomerRepository;

@RestController	// Controller, ResponseBody
public class CustomerController {
	
	@Autowired
	CustomerRepository repo;
	
	// RestController에서도 View Page로 넘어갈 수 있음
	@GetMapping("/")
	public ModelAndView main() {
		// Model + View 객체
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("greet","안녕하세요");
		return mv;
	}
	
	@GetMapping("/customer")
	public Iterable<Customer> findall(){
		return repo.findAll();
	}
}
