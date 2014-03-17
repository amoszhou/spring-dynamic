package com.amos.mybatis.dschange;

import com.amos.mybatis.annotation.ChooseDataSource;
import com.amos.mybatis.dschange.bean.Shop;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * User:Amos.zhou
 * Date: 14-3-14
 * Time: 下午5:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
@ChooseDataSource("ds_1")
public class TestChangeDs {

    @Autowired
    private ShopService shopService;

    @Test
    @Rollback(false)
    @ChooseDataSource("ds_1")
    public void testFindAllShop(){
        List<Shop> shopList1 = shopService.findAllShop();
        System.out.println(shopList1.size());

        fromTestDB();
    }

    @ChooseDataSource("ds_2")
    public void fromTestDB(){
        List<Shop> shopList = shopService.findAllShop();
        System.out.println(shopList.size());
    }

}
