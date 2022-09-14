package com.giftCardOrder.springboot.Exception;

public class MinimumAmountException extends RuntimeException{
	public MinimumAmountException(String message) {
		super(message);

}
}