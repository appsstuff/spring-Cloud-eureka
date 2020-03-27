package cloud.appsstuff.app;

import java.net.URI;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class ClientController {

	@Autowired
	private DiscoveryClient client;
	
	@RequestMapping(value = "/sentence",method = RequestMethod.GET)
	public String getClientWords() {
	return instancesName();
	}
	
	
	private String getClientWordsService(String service) {
		List<ServiceInstance> instances =client.getInstances(service);
		if(instances==null || instances.size()<=0) {
			return null;
		}
		URI url = instances.get(0).getUri();
		if(url != null) {
			
			Object o = new RestTemplate().getForObject(url,String.class);
			return o.toString();
		}			
		return null;
	}
	
	private String instancesName() {
		return 			getClientWordsService("client1")+" " +
						getClientWordsService("client2")+" " +
						getClientWordsService("client3")+" " +
						getClientWordsService("client4")+" " +
						getClientWordsService("client5");
		
	}
}
