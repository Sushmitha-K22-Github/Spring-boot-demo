package org.jsp.Springbootdemo.controller;

import org.jsp.Springbootdemo.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/home")
	@ResponseBody
public String home() {
	return "hello from home controller";
}
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "hello from test method";
	}
	@PostMapping("/sum")
	public String getSum(@RequestParam int n1,@RequestParam int n2) {
		return "The sum is:"+(n1+n2);
	}
	@GetMapping("/diff")
	public String getDiff(@RequestParam int n1,@RequestParam int n2) {
		return "The difference is:"+(n1-n2);
	}
	@GetMapping("/users")
	public User getUser() {
		return new User(1,"abc",888,"1@gmail.com");
	}
	@PostMapping("/users")
	public String printUser(@RequestBody User u) {
		System.out.println("id"+u.getId());
		System.out.println("name"+u.getName());
		System.out.println("phone"+u.getPhone());
		System.out.println("email"+u.getEmail());
		System.out.println("--------");
		return "The detalis are printed";
	}

}
