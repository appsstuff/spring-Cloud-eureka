package cloud.appsstuff.app;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Value("${client.words}")
	private String clientWords;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() {
		String [] words = clientWords.split(",");
		return words[ new Random().nextInt(words.length)];
	}
}
