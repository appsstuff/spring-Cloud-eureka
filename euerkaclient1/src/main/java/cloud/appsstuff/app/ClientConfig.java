package cloud.appsstuff.app;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix="client")
public class ClientConfig {

	private String luckyname;
	private String description;

	public String getLuckyname() {
		return luckyname;
	}

	public void setLuckyname(String luckyname) {
		this.luckyname = luckyname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
