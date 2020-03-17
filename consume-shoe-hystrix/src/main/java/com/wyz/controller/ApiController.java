package com.wyz.controller;

import com.wyz.entity.Shoe;
import com.wyz.feign.ShoeFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShoeController.class);


    @Autowired
    private ShoeFeign shoeFeign;

    @GetMapping("/shoe/{id}")
    public Shoe getId(@PathVariable("id") Long id){
        LOGGER.debug("consume api shoe invoked..." + id);
        return this.shoeFeign.getById(id);
    }
}
