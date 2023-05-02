package com.desarrollo.demospring.controllers;

import com.desarrollo.demospring.entities.ChangePassRequest;
import com.desarrollo.demospring.entities.Login;
import com.desarrollo.demospring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioRESTController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/loginrest")
    public ResponseEntity<String> login(@RequestBody Login login){
        if(usuarioService.login(login.getUsername(), login.getPassword())){
            return new ResponseEntity<String>("SESION INICIADA CORRECTAMENTE", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("NO SE HA PODIDO ENCONTRAR LA SESION", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/changepassrest")
    public ResponseEntity<String> changePassword(@RequestBody ChangePassRequest changePassRequest){
        if(usuarioService.changePassword(changePassRequest.getUsername(), changePassRequest.getOldPass(), changePassRequest.getNewPass())){
            return new ResponseEntity<String>("SE HAN HECHO LOS CAMBIOS EXITOSAMENTE", HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("NO SE HAN HECHO LOS CAMBIOS EXITOSAMENTE", HttpStatus.NOT_FOUND);
        }
    }

}
