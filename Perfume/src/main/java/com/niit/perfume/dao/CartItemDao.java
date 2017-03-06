package com.niit.perfume.dao;

import com.niit.perfume.model.Cart;
import com.niit.perfume.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem);

	void removeCartItem(CartItem cartItem);

	void removeAllCartItems(Cart cart);

	CartItem getCartItemByProductId(int productId);
}
