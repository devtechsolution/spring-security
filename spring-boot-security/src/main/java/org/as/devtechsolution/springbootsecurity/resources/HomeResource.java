package org.as.devtechsolution.springbootsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/home")
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return ("<h1> Welcome</h1>");
	}
}
