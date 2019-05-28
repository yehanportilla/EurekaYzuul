package co.com.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eurecacliente")
public interface GreetingClient {

	@RequestMapping("/greeting")
	String greeting();

}
