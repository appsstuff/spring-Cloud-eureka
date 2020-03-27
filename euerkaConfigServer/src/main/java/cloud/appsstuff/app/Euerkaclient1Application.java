package cloud.appsstuff.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Euerkaclient1Application {

	public static void main(String[] args) {
		SpringApplication.run(Euerkaclient1Application.class, args);
	}

}
