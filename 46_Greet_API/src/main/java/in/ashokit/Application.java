package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient 
@EnableFeignClients  //it is going to act as client 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
