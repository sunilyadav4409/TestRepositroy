package com.ashokit.globalexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ashokit.entities.Product;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Product> handleProductNotFoundException(Exception e) {

		Product p = new Product();
		p.setError("Product is not found in the database ");
		p.setErrorId("EX9383");
		return new ResponseEntity(p, HttpStatus.BAD_REQUEST);

	}
}
