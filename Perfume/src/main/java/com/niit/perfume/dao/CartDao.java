package com.niit.perfume.dao;

import java.io.IOException;

import com.niit.perfume.model.Cart;



public interface CartDao {

	 Cart getCartById(int cartId);

	    Cart validate(int cartId) throws IOException;

	    void update(Cart cart);
}
