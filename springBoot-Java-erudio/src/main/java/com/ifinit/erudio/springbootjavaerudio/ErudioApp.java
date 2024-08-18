package com.ifinit.erudio.springbootjavaerudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErudioApp {

    // O método main deve receber um array de Strings como argumento, não um array de Doubles.
    public static void main(String[] args) {
        // Chama o método run da classe SpringApplication, passando a classe principal (ErudioApp) e os argumentos da linha de comando.
        SpringApplication.run(ErudioApp.class, args);
    }

}
