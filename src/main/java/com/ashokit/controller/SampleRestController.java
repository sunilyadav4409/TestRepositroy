package com.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.globalexceptionhandler.ProductNotFoundException;

@RestController
public class SampleRestController {

	@GetMapping("/product/{pid}")
	public String getProductDeatils(@PathVariable("pid") Integer pid) throws ProductNotFoundException {

		if (pid != 101) {

			throw new ProductNotFoundException();
		} else {
			return "product details fetched succesfully ::";
		}

	}
}
