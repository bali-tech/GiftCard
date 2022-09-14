package com.giftCardOrder.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giftCardOrder.springboot.Model.GiftCardOrder;



public interface OrderRepository extends JpaRepository<GiftCardOrder, Integer>{

}
