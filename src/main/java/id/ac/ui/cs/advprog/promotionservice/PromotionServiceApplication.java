package id.ac.ui.cs.advprog.promotionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "id.ac.ui.cs.advprog.promotionservice")
@EntityScan(basePackages = "id.ac.ui.cs.advprog.promotionservice.model")
@EnableJpaRepositories(basePackages = "id.ac.ui.cs.advprog.promotionservice.repository")
public class PromotionServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PromotionServiceApplication.class, args);
    }
}

