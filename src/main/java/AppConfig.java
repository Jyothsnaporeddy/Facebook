import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@ComponentScan(basePackages = "src/main/java")
@PropertySource("classpath:src/main/resources/login.properties")
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone() {
//		return new Samsung();
//	}
//	
//	@Bean
//	public MoblieProcessor getProcessor() {
//		return new Snapdragon();
//	}
	
	//@Bean(name= {"ColBean", "collegeBeanAnother"})
	/*
	 * @Bean public College collegeBean() { //return new College();
	 * 
	 * College college=new College(prinipalBean()); return college; }
	 * 
	 * @Bean public Principal prinipalBean() { return new Principal();
	 * 
	 * 
	 * }
	 */

}
