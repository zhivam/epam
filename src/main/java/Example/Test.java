package Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Test {


    public static void main(String args[]){

        SpringApplication.run(Test.class);
    }
    @Bean
    public RestTemplate returnTemplate(){
        return new RestTemplate() ;
    }
}

