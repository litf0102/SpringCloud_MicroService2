package com.springtest.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springtest.demo.model.Item;
/**
   * 申明这是一个Feign客户端，并且指明服务id
 */
@FeignClient(value = "appitem",fallback = ItemServiceFallback.class)
public interface ItemFeignClient {
    /**
            * 这里定义了类似于SpringMVC用法的方法，就可以进行RESTful方式的调用了
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/item/{id}", method = RequestMethod.GET)
    Item queryItemById(@PathVariable("id") Long id);
}