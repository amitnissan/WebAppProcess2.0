package com.example.WebAppProcess20.Repositories;

/*
 * Created by Amit Nissan on 15/7/2018
 */

import com.example.WebAppProcess20.bootstrap.InvoicesEntity;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<InvoicesEntity,Integer> {
}
