package in.tejas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //service registry
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
