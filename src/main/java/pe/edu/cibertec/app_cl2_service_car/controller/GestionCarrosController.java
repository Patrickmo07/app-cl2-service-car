package pe.edu.cibertec.app_cl2_service_car.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_cl2_service_car.remoteservices.ServiceMantClient;
import pe.edu.cibertec.app_cl2_service_car.remoteservices.ServiceUsersClient;

@RequiredArgsConstructor
@RestController
public class GestionCarrosController {
    private final ServiceUsersClient serviceUsersClient;
    private final ServiceMantClient serviceMantClient;

    @GetMapping("/newcar")
    public String registrarCarros(){
        return "Respuesta del servicio REGISTRAR NUEVO CARRO";
    }

    @GetMapping("/obtenerCar")
    public String obtenerCarros(){
        return "Respuesta del servicio OBTENER CARROS";
    }

    @GetMapping("/mant")
    public String obtenerMant(){
        return serviceMantClient.obtenerMantenimiento();
    }

    @GetMapping("/historial-mant")
    public String obtenerHistorial(){
        return serviceMantClient.obtenerHistorialMant();
    }

    @GetMapping("/newuser")
    public String registrarUsuarios(){
        return serviceUsersClient.registrarUsuarios();
    }

    @GetMapping("/obtenerUser")
    public String obtenerUsuarios(){
        return serviceUsersClient.obtenerUsuarios();
    }

}
