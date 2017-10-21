package ZZZhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ZzzHelloApplication {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hi Silent Shadow";
	}

	public static void main(String[] args) {
		SpringApplication.run(ZzzHelloApplication.class, args);
	}
}
