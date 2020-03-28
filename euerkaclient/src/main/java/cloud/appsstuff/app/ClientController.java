package cloud.appsstuff.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RefreshScope
@RestController
public class ClientController {

	@Autowired
	private RestTemplate client;
	
	@RequestMapping(value = "/sentence",method = RequestMethod.GET)
	public String getClientWords() {
		 return 
					"<h3>Some Sentences</h3><br/>" +	  
					buildSentence() + "<br/><br/>" +
					buildSentence() + "<br/><br/>" +
					buildSentence() + "<br/><br/>" +
					buildSentence() + "<br/><br/>" +
					buildSentence() + "<br/><br/>"
					;
				}
	
	
	private String getClientWordsService(String service) {
		String cleint= client.getForObject("http://" + service, String.class);
		return cleint;
	}
	
	private String buildSentence() {
		String clientSentancess= "Could not get clients ";
		
		try {
			clientSentancess=	String.format("%s %s %s %s %s", 
							getClientWordsService("client1"),
							getClientWordsService("client2"),
							getClientWordsService("client3"),
							getClientWordsService("client4"),
							getClientWordsService("client5"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientSentancess;
	}
}
