package cloud.appsstuff.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClientController {

	
	 @Value("${lucky.word:Unable to connect to Configuration Server}") String luckyWord;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() {
	return "The lucky word is: " + luckyWord;
	}
	
}
