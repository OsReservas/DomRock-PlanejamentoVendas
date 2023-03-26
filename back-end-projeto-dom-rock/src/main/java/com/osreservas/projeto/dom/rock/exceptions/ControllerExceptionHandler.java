package com.osreservas.projeto.dom.rock.exceptions;


import com.osreservas.projeto.dom.rock.controller.exceptions.ErroPadrao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

//Intercepta excessoes
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EntidadeNaoLocalizada.class)
    public ResponseEntity<ErroPadrao> entityNotFound(EntidadeNaoLocalizada e, HttpServletRequest request){
            ErroPadrao err = new ErroPadrao();
            err.setTimestamp(Instant.now());
            err.setStatus(HttpStatus.NOT_FOUND.value());
            err.setError("Resource not Found");
            err.setMessage(e.getMessage());
            err.setPath(request.getRequestURI());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);

    }




}
