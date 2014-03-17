package com.amos.spring.dschange;

import com.amos.spring.dschange.bean.Shop;
import com.amos.spring.dschange.mapper.ShopMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User: Baron.Zhang
 * Date: 14-1-7
 * Time: 下午1:29
 */
@Service
public class ShopService {


    @Resource
    private ShopMapper shopMapper;

    public List<Shop> findAllShop() {
        return shopMapper.findAllShop();
    }
}
