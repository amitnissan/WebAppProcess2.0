package com.example.WebAppProcess20.Repositories;

/*
 * Created by Amit Nissan on 15/7/2018
 */

import com.example.WebAppProcess20.Library.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.*;

public interface OrderItemRepository extends CrudRepository<OrderItem,Integer> {
}