package mainConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.study.Person;

@Configuration
public class MainConfig {

	@Bean
	public Person person() {
		return new Person("wang", 11);
	}
}
