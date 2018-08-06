package com.example.WebAppProcess20.Repositories;

/*
 * Created by Amit Nissan on 6/8/2018
 */

import com.example.WebAppProcess20.Entities.CartEntity;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<CartEntity,Integer> {
}
