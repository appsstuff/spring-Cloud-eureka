package cloud.appsstuff.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Euerkaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Euerkaclient1Application.class, args);
	}

	 //  This "LoadBalanced" RestTemplate 
	  //  is automatically hooked into Ribbon:
	  @Bean @LoadBalanced
	  RestTemplate restTemplate() {
	      return new RestTemplate();
	  }  
}
