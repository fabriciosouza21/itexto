package com.fsm.itext.controller.exception;


import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fsm.itext.services.exception.NotFoundException;



@ControllerAdvice
public class ControllerExceptionHandler{

	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound (NotFoundException e , HttpServletRequest request){
		StandardError err = new StandardError();
		HttpStatus status = HttpStatus.NOT_FOUND;		
		err.setStatus(status.value());
		err.setMessage(e.getMessage());
		err.setTimestamp(Instant.now());
		err.setPath(request.getRequestURI());
		err.setError("Recurso não existe");
		
		return ResponseEntity.status(status).body(err);
	}
}