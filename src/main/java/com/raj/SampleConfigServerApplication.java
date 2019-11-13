package com.raj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableConfigServer
@EnableEncryptableProperties
public class SampleConfigServerApplication {
	  public static void main(String[] args) {
		    SpringApplication.run(SampleConfigServerApplication.class, args);
		  }

//	  @Component
//	  public class MyRunner implements CommandLineRunner {
//	   
//	    @Value("${myProperty}")
//	    private String myProperty;
//	    
//	    @Value("${spring.cloud.config.server.git.password}")
//	    private String myProperty1;
//
//	    @Override
//	    public void run(String... args) throws Exception {
//	      System.out.println("My property is = " + myProperty);
//	      System.out.println("My property1 is = " + myProperty1);
//	    }
//	   
//	  }
	  
}