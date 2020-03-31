package cloud.appsstuff.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ClientConfig.class)
public class Euerkaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Euerkaclient1Application.class, args);
	}

}
