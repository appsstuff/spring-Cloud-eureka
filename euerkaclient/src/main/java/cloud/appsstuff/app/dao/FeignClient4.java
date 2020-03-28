package cloud.appsstuff.app.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(serviceId = "client4")
public interface FeignClient4 {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() ;
}
