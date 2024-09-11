package com.efarms.cartservice.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efarms.cartservice.entity.Cart;
import com.efarms.cartservice.entity.CartItem;
import com.efarms.cartservice.repository.CartRepository;
import com.efarms.cartservice.service.CartService;

@Service
public class CartServiceImplementation implements CartService{
	
	@Autowired
    private CartRepository cartRepository;

    @Override
    public Cart getCartByUserId(Long userId) {
        Optional<Cart> cartOptional = cartRepository.findByUserId(userId);
        return cartOptional.orElseGet(() -> new Cart(userId, null));
    }

    @Override
    public Cart addItemToCart(Long userId, CartItem cartItem) {
        Cart cart = getCartByUserId(userId);

        boolean itemExists = cart.getItems().stream().anyMatch(item -> item.getProductId().equals(cartItem.getProductId()));

        if (itemExists) {
            cart.getItems().forEach(item -> {
                if (item.getProductId().equals(cartItem.getProductId())) {
                    item.setQuantity(item.getQuantity() + cartItem.getQuantity());
                }
            });
        } else {
            cartItem.setCart(cart);
            cart.getItems().add(cartItem);
        }

        return cartRepository.save(cart);
    }

    @Override
    public void removeItemFromCart(Long userId, Long productId) {
        Cart cart = getCartByUserId(userId);

        cart.getItems().removeIf(item -> item.getProductId().equals(productId));

        cartRepository.save(cart);
    }

    @Override
    public void clearCart(Long userId) {
        Cart cart = getCartByUserId(userId);
        cart.getItems().clear();
        cartRepository.save(cart);
    }


}
