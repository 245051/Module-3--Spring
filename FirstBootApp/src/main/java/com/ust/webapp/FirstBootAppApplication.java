package com.ust.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class FirstBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootAppApplication.class, args);
	}
	
@GetMapping("/first")
//@RequestMapping("/first")
public String Respond() {
	return "my first rest controller";
	
}
@GetMapping("/second")
//@RequestMapping("/second")
public String message() {
	return "today we want break";

}



@GetMapping("/third/{custname}")
public String greetings(@PathVariable String custname) {
	return "Hello Dear" +custname;
	
}
	
@GetMapping("/fourth/{custname}/gender/{gen}")
	public String greetings(@PathVariable String custname ,@PathVariable String gen ) {
	

	if(gen.equals("male"))
	{
		return "hello mr"+custname;
	}
	else if(gen.equals("female")) {
		return "hello mrs" + custname;
		
	}
	else
	{
		return "hello";
	}
}
}
	
	
	
	


