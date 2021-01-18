package com.kodilla.spring.basic.spring_dependency_injection.home;

import org.springframework.stereotype.Component;

@Component
public class Display {

        public String display(double value) {
            return "Value is:" + value;
        }
}
