package com.wyz.controller;


import com.wyz.entity.Shoe;
import com.wyz.service.IShoeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuyanzhong
 * @since 2020-03-10
 */
@RestController
@RequestMapping("/shoe")
public class ShoeController {

    private static Logger log = LoggerFactory.getLogger(ShoeController.class);

    @Autowired
    private IShoeService shoeService;

    @RequestMapping("/{id}")
    public Shoe getById(@PathVariable("id") Long id){
        try {

            log.debug("by id invoked...");
            return this.shoeService.getById(id);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
