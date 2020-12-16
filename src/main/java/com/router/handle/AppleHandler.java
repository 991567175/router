package com.router.handle;

import org.springframework.stereotype.Component;

@Component
public class AppleHandler implements FruitHandler {
    @Override
    public void buy() {
        System.out.println("apple");
    }
}
