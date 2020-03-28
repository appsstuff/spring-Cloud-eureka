package cloud.appsstuff.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientController {

	@Autowired
	private CollectService client;
	
	@RequestMapping(value = "/sentence",method = RequestMethod.GET)
	public String getClientWords() {
		 return client.getClientWords();
	}}
