package cloud.appsstuff.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="client")
public class ClientController {

	private String luckyname;
	private String description;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() {
		return luckyname + " is " + description;
		
	}
	
}
