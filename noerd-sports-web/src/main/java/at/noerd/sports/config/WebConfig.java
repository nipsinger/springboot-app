package at.noerd.sports.config;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import at.noerd.sports.api.SoccerService;
import at.noerd.sports.domain.League;

@SpringBootApplication
@ComponentScan(basePackages = "at.noerd.sports")
@PropertySource(value = "classpath:config/soccerapi.properties")
public class WebConfig implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(WebConfig.class);
	
	@Autowired
	private SoccerService soccerService;
	
    @Override
    public void run(String... args) throws Exception {
    	
        List<League> allLeagues = soccerService.getAllLeagues();
        LOGGER.debug(allLeagues.toString());
    }
}