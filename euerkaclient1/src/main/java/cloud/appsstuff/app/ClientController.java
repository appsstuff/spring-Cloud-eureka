package cloud.appsstuff.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

	@Autowired
	private ClientConfig config;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() {
		return config.getLuckyname() + " is " + config.getDescription();
		
	}
	
	@RequestMapping(value = "/refresh",method = RequestMethod.POST)
	public void resresh() {
		
		
	}
}
