package at.noerd.sports;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import at.noerd.sports.api.SoccerService;
import at.noerd.sports.domain.League;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private SoccerService soccerService;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
    
    @Override
    public void run(String... args) throws Exception {
        List<League> allLeagues = soccerService.getAllLeagues();
        LOGGER.debug(allLeagues.toString());
    }

}