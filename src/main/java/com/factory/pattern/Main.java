package com.factory.pattern;


import com.factory.pattern.process.ProcessFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);

    ProcessFactory processFactory = context.getBean(ProcessFactory.class);
    processFactory.getFactoryInstance("mongo");
  }
}