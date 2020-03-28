package cloud.appsstuff.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.appsstuff.app.dao.FeignClient1;
import cloud.appsstuff.app.dao.FeignClient2;
import cloud.appsstuff.app.dao.FeignClient3;
import cloud.appsstuff.app.dao.FeignClient4;
import cloud.appsstuff.app.dao.FeignClient5;
@Service
public class CollectServiceimpl implements CollectService {

	private FeignClient1 cleint1;
	private FeignClient2 cleint2;
	private FeignClient3 cleint3;
	private FeignClient4 cleint4;
	private FeignClient5 cleint5;	
	
	@Autowired
	public CollectServiceimpl(FeignClient1 cleint1, FeignClient2 cleint2, FeignClient3 cleint3, FeignClient4 cleint4,
			FeignClient5 cleint5) {
		super();
		this.cleint1 = cleint1;
		this.cleint2 = cleint2;
		this.cleint3 = cleint3;
		this.cleint4 = cleint4;
		this.cleint5 = cleint5;
	}

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
	
	
	private String buildSentence() {
		String clientSentancess= "Could not get clients ";
		
		try {
			clientSentancess=	String.format("%s %s %s %s %s", 
					cleint1.getClientWords(),
					cleint2.getClientWords(),
					cleint3.getClientWords(),
					cleint4.getClientWords(),
					cleint5.getClientWords()
							);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientSentancess;
	}
}
