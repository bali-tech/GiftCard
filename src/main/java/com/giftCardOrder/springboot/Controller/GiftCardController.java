package com.giftCardOrder.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giftCardOrder.springboot.Model.GiftCardOrder;
import com.giftCardOrder.springboot.Service.GiftOrderService;

@RestController
@RequestMapping("/giftCardOrder")
public class GiftCardController {
	
		@Autowired
		GiftOrderService giftOrderService;
		
		@GetMapping("/allCardsHistory")
		public ResponseEntity<List<GiftCardOrder>> fetchAllUser(){
			List<GiftCardOrder> userObj = giftOrderService.getAllGiftCardHistory();
			return new ResponseEntity<List<GiftCardOrder>>(userObj,HttpStatus.OK);
		}
		@PostMapping("/addGiftCard")
		public ResponseEntity<String> addGiftCards(@Validated @RequestBody GiftCardOrder gift) {
			GiftCardOrder giftCardId = giftOrderService.addGiftCard(gift);
			return new ResponseEntity<String>("Gift Card has been successfully purchased, the Gift Card ID is: "
							+ giftCardId.getOrderId(),HttpStatus.OK);
		}
		@GetMapping("/redeemGiftCard")
		public ResponseEntity<String> typeGiftOrder(@Validated @RequestBody GiftCardOrder gift) {
			GiftCardOrder giftCardAmount = giftOrderService.typeGiftOrder(gift);
			return new ResponseEntity<String>("Gift Card has been successfully redeemed, updated gift card balance  is: " 
			+( giftCardAmount.getCardAmount()-giftCardAmount.getRedemptionAmount()), HttpStatus.OK);
		}

}
