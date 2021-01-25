package com.hkarabakla.services;

import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.OrderRepo;

public class OrderService {

    private final OrderRepo orderRepo;


    public OrderService(OrderRepo orderRepo) {

        this.orderRepo = orderRepo;


    }


    public void findBook(int id) {

        System.out.println(orderRepo.findById(id));


    }


}
