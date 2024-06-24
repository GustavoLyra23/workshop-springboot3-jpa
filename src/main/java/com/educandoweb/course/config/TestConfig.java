package com.educandoweb.course.config;


import com.educandoweb.course.entities.OrderT;
import com.educandoweb.course.entities.UserT;
import com.educandoweb.course.entities.enums.OrderStatus;
import com.educandoweb.course.repositories.OrderTRepository;
import com.educandoweb.course.repositories.UserTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserTRepository userTRepository;
    @Autowired
    private OrderTRepository orderTRepository;


    @Override
    public void run(String... args) throws Exception {
        UserT u1 = new UserT(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        UserT u2 = new UserT(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        OrderT o1 = new OrderT(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        OrderT o2 = new OrderT(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        OrderT o3 = new OrderT(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userTRepository.saveAll(Arrays.asList(u1, u2));
        orderTRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
