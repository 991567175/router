package com.router.handle;

import org.springframework.stereotype.Component;

@Component

public class OrangeHandler implements FruitHandler {
    @Override
    public void buy() {
        System.out.println("orange");
    }
}
