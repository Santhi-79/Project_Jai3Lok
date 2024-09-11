package com.efarms.cartservice.service;

import com.efarms.cartservice.entity.Cart;
import com.efarms.cartservice.entity.CartItem;

public interface CartService {
	
	Cart getCartByUserId(Long userId);
    Cart addItemToCart(Long userId, CartItem cartItem);
    void removeItemFromCart(Long userId, Long productId);
    void clearCart(Long userId);

}
