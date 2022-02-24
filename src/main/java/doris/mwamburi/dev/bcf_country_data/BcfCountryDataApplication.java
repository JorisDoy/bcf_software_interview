package doris.mwamburi.dev.bcf_country_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BcfCountryDataApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BcfCountryDataApplication.class);
        springApplication.setAddCommandLineProperties(false);
        springApplication.run();

    }

}
