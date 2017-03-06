package com.niit.perfume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.niit.perfume.dao.CartItemDao;
import com.niit.perfume.model.Cart;
import com.niit.perfume.model.CartItem;
import com.niit.perfume.service.CartItemService;


@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem){
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem){
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByProductId(int productId){
        return cartItemDao.getCartItemByProductId(productId);
    }
}
