package com.osreservas.projeto.dom.rock.exceptions;


import com.osreservas.projeto.dom.rock.controller.exceptions.ErroPadrao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

//Intercepta excessoes
@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErroPadrao> entityNotFound(EntityNotFoundException e, HttpServletRequest request){

    }




}
