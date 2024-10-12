package pe.edu.cibertec.app_cl2_service_car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class AppCl2ServiceCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCl2ServiceCarApplication.class, args);
	}

}
