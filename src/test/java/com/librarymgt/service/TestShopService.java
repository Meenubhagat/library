package com.librarymgt.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com. librarymgt.model.Shop;
import com. librarymgt.service.ShopService;
import com. librarymgt.init.BaseTestCase;

@Slf4j
public class TestShopService extends BaseTestCase {

	@Autowired
	private ShopService shopService;

  @Test
  public void testRoleCreate() {
   //log.debug("Creating new Role");
   int i = 10;
   
   final Shop s = new Shop();
   //s.setName("Shop Nameaaa");
  // s.setEmplNumber(12);
   shopService.create(s);
   
   final List<Shop> shops = shopService.findAll();
   assertNotNull(shops);
   assertTrue(shops.size() > 0);
   
  }

}