package com.librarymgt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com. librarymgt.exception.ShopNotFound;
import com. librarymgt.model.Shop;
import com. librarymgt.repository.ShopRepository;
import com. librarymgt.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Resource
	private ShopRepository shopRepository;

	@Override
	@Transactional
	public Shop create(Shop shop) {
		Shop createdShop = shop;
		return shopRepository.save(createdShop);
	}
	
	@Override
	@Transactional
	public Shop findById(int id) {
		return shopRepository.findOne(id);
	}

	@Override
	@Transactional(rollbackFor=ShopNotFound.class)
	public Shop delete(int id) throws ShopNotFound {
		Shop deletedShop = shopRepository.findOne(id);
		
		if (deletedShop == null)
			throw new ShopNotFound();
		
		shopRepository.delete(deletedShop);
		return deletedShop;
	}

	@Override
	@Transactional
	public List<Shop> findAll() {
		return shopRepository.findAll();
	}

	@Override
	public Shop update(Shop shop) throws ShopNotFound {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//@Transactional(rollbackFor=ShopNotFound.class)
	/*public Shop update(Shop shop) throws ShopNotFound {
		Shop updatedShop = shopRepository.findOne(shop.getId());
		
		if (updatedShop == null)
			throw new ShopNotFound();
		
		updatedShop.setName(shop.getName());
		updatedShop.setEmplNumber(shop.getEmplNumber());
		return updatedShop;
	}*/

}
