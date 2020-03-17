package com.wyz.controller;

import com.wyz.entity.Shoe;
import com.wyz.feign.ShoeFeign;
import com.wyz.feign.ShoeFeignFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shoe")
public class ShoeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShoeController.class);


    @Autowired
    private ShoeFeign shoeFeign;

    @GetMapping("/{id}")
    public Shoe getId(@PathVariable("id") Long id){
        LOGGER.debug("consume shoe invoked..." + id);
        return this.shoeFeign.getById(id);
    }
}
