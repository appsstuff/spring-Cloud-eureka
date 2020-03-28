package cloud.appsstuff.app.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(serviceId = "client3")
public interface FeignClient3 {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String getClientWords() ;
}
