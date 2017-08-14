package org.arpit.java2blog;
import org.arpit.java2blog.springboot.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldStandaloneApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("country")
	Country countryBean;
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootHelloWorldStandaloneApplication.class, args);   
	}

	public void run(String... arg0) throws Exception {

		System.out.println("Country Name: "+countryBean.getCountryName());
	}

}