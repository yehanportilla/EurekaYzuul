package co.com.iuzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class IuzuulApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(IuzuulApplication.class, args);
	}

}
