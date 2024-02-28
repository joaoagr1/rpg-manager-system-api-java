package rpg.system.rpg;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//http://localhost:8080/swagger-ui/index.html#/
@SpringBootApplication
public class    RpgApplication {
    //// spring.datasource.url=jdbc:mysql://rpgfinal.cdsgu4wqqnmf.sa-east-1.rds.amazonaws.com:3306/rpgfinal
    public static void main(String[] args) {
        SpringApplication.run(RpgApplication.class, args);
    }

}


