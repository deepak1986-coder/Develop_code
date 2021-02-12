package helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	// @GetMapping(method = RequestMethod.GET,path = "/hello-World")
	@GetMapping(path = "/hello-World")
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/hello-World-Bean")
	public HelloWolrdBean helloWorldBean() {
		return new HelloWolrdBean("Hello World From bean ");
	}

	@GetMapping(path = "/hello-World/path-variable/{name}")
	public HelloWolrdBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWolrdBean(String.format("Hello World %s", name));
	}
}
 