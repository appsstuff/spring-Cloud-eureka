package cloud.appsstuff.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServerClient {

	@RequestMapping("/")
	public String test() {
		return "connected ";
	}
}
