//
//  
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.orm.jpa.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//  
//@SpringBootApplication
//@EntityScan(basePackages = { "model" })
//@EnableJpaRepositories(basePackages = { "DAO" })
//@ComponentScan(basePackages = {"controller"})
//public class App {
//      public static void main(String[] args) {
//            SpringApplication.run(App.class, args);
//      }
//}

package br.com.agenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
  
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class App extends SpringBootServletInitializer {
 
	 public static void main(String[] args) {
            SpringApplication.run(App.class, args);
      }
	 
}