package pe.edu.cibertec.app_cl2_service_car.remoteservices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-cl2-service-user")
public interface ServiceUsersClient {

    @GetMapping ("/newuser")
    String registrarUsuarios();

    @GetMapping ("/obtenerUser")
    String obtenerUsuarios();

}


