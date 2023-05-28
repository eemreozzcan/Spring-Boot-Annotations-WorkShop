package com.java.lessons.annotations.config;

import com.java.lessons.annotations.controller.PizzaController;
import com.java.lessons.annotations.service.NonVegPizza;
import com.java.lessons.annotations.service.Pizza;
import com.java.lessons.annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


@Configuration

public class AppConfig
{
    //Bean etiketi ,configurasyon sınıfı içerisindeki metotların geri dönüş değerlerini Spring Container'a bean olarak eklemek için kullanılır.
    //Bu metotlar Spring Container tarafından yönetilir.
    @Bean(name = "vegPizzaBean")
    @Lazy
    public Pizza vegPizza()
    {
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza()
    {
        return new NonVegPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController()
    {
        return new PizzaController(vegPizza());
    }


}
