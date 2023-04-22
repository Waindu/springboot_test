package org.mycompany.springboot.app.controllers;

import static org.springframework.http.HttpStatus.*;

import org.mycompany.springboot.app.models.Cuenta;
import org.mycompany.springboot.app.models.TransaccionDto;
import org.mycompany.springboot.app.services.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController // Registramos controlador Rest en el contenedor de Spring
@RequestMapping("/api/cuentas") // URI de los metodos de Cuenta
public class CuentaController {

    @Autowired // anotacion de Spring para injectar dependencias, estás deben estar registradas en el contenedor
    private CuentaService cuentaService;

    @GetMapping // verbo http: GET, URI: /api/cuentas
    @ResponseStatus(OK) 
    public List<Cuenta> listar() {
        return cuentaService.findAll();
    }

    @GetMapping("/{id}") // verbo http: GET, URI: /api/cuentas/{id} con parametro "id" en la ruta
    @ResponseStatus(OK)
    public Cuenta detalle(@PathVariable Long id) {
        return cuentaService.findById(id);
    }

    @PostMapping // verbo http: POST, URI: /api/cuentas con parametro "cuenta" en el body
    @ResponseStatus(CREATED)
    public Cuenta guardar(@RequestBody Cuenta cuenta) {
        return cuentaService.save(cuenta);
    }

    @PostMapping("/transferir") // verbo http: POST, URI: /api/cuentas/transferir con parametro "dto" en el body
    public ResponseEntity<?> transferir(@RequestBody TransaccionDto dto) {
        cuentaService.transferir(dto.getCuentaOrigenId(),
                dto.getCuentaDestinoId(),
                dto.getMonto(), dto.getBancoId());

        Map<String, Object> response = new HashMap<>();
        response.put("date", LocalDate.now().toString());
        response.put("status", "OK");
        response.put("mensaje", "Transferencia realizada con éxito!");
        response.put("transaccion", dto);

        return ResponseEntity.ok(response);
    }

}
