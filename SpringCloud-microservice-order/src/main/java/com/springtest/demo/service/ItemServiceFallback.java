package com.springtest.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.springtest.demo.model.Item;

/**
 * 此类中的方法专门用于服务降级，该类一般要实现调用远程服务的接口（这样保证方法名一致）
 */
@Component
public class ItemServiceFallback  implements ItemFeignClient {
    /**
     * 服务降级的方法要和原方法一致(名称、参数列表)
     * @param id
     * @return
     */
    @Override
    public Item queryItemById(@PathVariable("id") Long id) {
        return new Item(0, "服务降级方法queryItemById", null, "服务降级方法queryItemById", null);
    }
}

