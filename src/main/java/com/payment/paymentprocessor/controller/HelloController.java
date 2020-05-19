package com.payment.paymentprocessor.controller;


import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value = "/products/{productId}", method = RequestMethod.GET)
    public ResponseEntity<?> getProducts(@PathVariable("productId") Integer productId) {
            List<String> productsList = new ArrayList<>();
            productsList.add(productId.toString());
            productsList.add("Honey");
            productsList.add("Almond");
        return new ResponseEntity<>(productsList, HttpStatus.OK);
    }
    @RequestMapping(value = "/products/{productId}", method = RequestMethod.POST)
    public ResponseEntity createProduct(@RequestBody Product product) {

            if(product.getProductName().equalsIgnoreCase("Mobile")) {
                product.setProductPrice(new BigDecimal(1000));
            } else {
                product.setProductName("Unknown");
            }

        return new ResponseEntity<>(product, HttpStatus.OK);
    }

}
