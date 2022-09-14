package com.giftCardOrder.springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="gifts")
public class GiftCardOrder {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="order_id")
		private int orderId;
		
		@Column(name="card_type")
		private String cardType;
		
		//@Min(value=100, message="Minimum amount should be 100"
		//@Max(value=10000, message="Maximum amount should be 10000")
		@Column(name = "card_amount")
		private int cardAmount;
		
		@Column(name="redemption_amount")
		private double redemptionAmount;

		
		public GiftCardOrder(int orderId, String cardType, int cardAmount) {
			super();
			this.orderId = orderId;
			this.cardType = cardType;
			this.cardAmount = cardAmount;
		}
		

		public GiftCardOrder() {
			super();
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public String getCardType() {
			return cardType;
		}

		public void setCardType(String cardType) {
			this.cardType = cardType;
		}

		public int getCardAmount() {
			return cardAmount;
		}

		public void setCardAmount(int cardAmount) {
			this.cardAmount = cardAmount;
		}

		public double getRedemptionAmount() {
			return redemptionAmount;
		}

		public void setRedemptionAmount(double redemptionAmount) {
			this.redemptionAmount = redemptionAmount;
		}
		
		

}
