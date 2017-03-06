package com.niit.perfume.service;

import com.niit.perfume.model.Cart;

public interface CartService {
	  Cart getCartById(int cartId);

	    void update(Cart cart);
}
