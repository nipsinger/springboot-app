package at.noerd.sports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import at.noerd.sports.config.WebConfig;

public class AppStarter extends SpringBootServletInitializer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebConfig.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebConfig.class);
	}
}