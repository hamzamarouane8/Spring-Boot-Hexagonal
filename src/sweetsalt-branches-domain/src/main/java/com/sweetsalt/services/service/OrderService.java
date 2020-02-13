package com.sweetsalt.services.service;

import com.sweetsalt.services.model.Product;

public interface OrderService {
    void addProduct (Integer id,Product product);
    void deleteProduct (Integer productId);
}
