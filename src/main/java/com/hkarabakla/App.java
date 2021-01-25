package com.hkarabakla;

import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.OrderRepo;
import com.hkarabakla.services.BookService;
import com.hkarabakla.services.CategoryService;
import com.hkarabakla.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.hkarabakla.entities.*;
import org.springframework.data.repository.CrudRepository;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.hkarabakla");
        appContext.refresh();

        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(App.class, args);

        Scanner scan = new Scanner(System.in);
        System.out.println("1-Kitap Adına göre Arama\n" +
                "2-Kullanıcı Sipariş Bilgileri");

        System.out.println("Yapılacak işlem numarasını giriniz.");
        int choose = scan.nextInt();


        switch (choose) {

            case 1:

                System.out.println("Kitap Adı Giriniz.");
                String name = scan.next();
                BookRepo bookRepo = configurableApplicationContext.getBean(BookRepo.class);

                System.out.println(bookRepo.findByName(name));
                break;

            case 2:
                System.out.println("Kullanıcı Id Giriniz.");
                int id = scan.nextInt();
                OrderRepo orderRepo = configurableApplicationContext.getBean(OrderRepo.class);

                System.out.println(orderRepo.findById(id));
                break;

            default:
                System.out.println("Hatalı Giriş");

        }


        appContext.close();
    }
}
