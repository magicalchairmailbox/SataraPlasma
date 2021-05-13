package in.sataraplasma.sataraplasma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@ComponentScan("in.sataraplasma")
@Configuration
@EnableSwagger2
public class SataraplasmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SataraplasmaApplication.class, args);
	}
	 @Bean
	    public Docket productApi() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .select()
	               .apis(RequestHandlerSelectors.basePackage("in.sataraplasma.controller"))
	               /* .paths(regex("/product.*"))*/
	                .build()
	                .apiInfo(metaData());
	    }
	    private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "Satara Plasma REST API",
	                "Satara Plasma Application Services",
	                "1.0",
	                "Terms of service",
	                new Contact(" MagicalChairs.com ", "", "magicalchairmailbox@gmail.com"),
	               "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	    }

}
