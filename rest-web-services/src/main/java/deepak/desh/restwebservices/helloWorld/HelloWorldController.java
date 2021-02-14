package deepak.desh.restwebservices.helloWorld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;

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

	@GetMapping(path = "/hello-World-internationalized")
	public String helloWorldinternationalized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());

	}

}
