package com.springtest.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.demo.model.Item;
import com.springtest.demo.model.JdbcConfigBean;
import com.springtest.demo.service.ItemService;

@RestController
public class ItemController {
	@Autowired
    private JdbcConfigBean jdbcConfigBean;
    @Autowired
    private ItemService itemService;

    /**
     * Search item
     *
     * @param id
     * @return
     */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        return this.itemService.queryItemById(id);
    }
    
    @GetMapping(value = "testconfig")
    public String testconfig(){
        return this.jdbcConfigBean.toString();
    }
}

