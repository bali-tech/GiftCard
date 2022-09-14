package com.giftCardOrder.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.giftCardOrder.springboot.Model.GiftCardOrder;
import com.giftCardOrder.springboot.Repository.OrderRepository;


@Service
public class GiftOrderService {
    @Autowired
    OrderRepository orderRepository;
    
    public List<GiftCardOrder> getAllGiftCardHistory() {
		return orderRepository.findAll();
    }
    

	public  GiftCardOrder addGiftCard(GiftCardOrder giftobj) {
		return orderRepository.save(giftobj);
		
	}
	public GiftCardOrder typeGiftOrder(GiftCardOrder obj) {
		GiftOrderService giftOrderService;
		
		return obj; 
}
}