package co.com.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableFeignClients
@Controller
@SpringBootApplication
public class FeignApplication {

	@Autowired
	private GreetingClient greetingClient;

	public static void main(String[] args) {
		SpringApplication.run(FeignApplication.class, args);
	}

	@RequestMapping("/get-greeting")
	public String greeting(Model model) {
		model.addAttribute("greeting", greetingClient.greeting());
		return "greeting-view";
	}
	
	
}
