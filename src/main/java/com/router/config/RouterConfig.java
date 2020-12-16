package com.router.config;

import com.router.enums.FruitEnum;
import com.router.handle.AppleHandler;
import com.router.handle.OrangeHandler;
import com.router.router.FruitRouter;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class RouterConfig {

    private AppleHandler appleHandler;
    private OrangeHandler orangeHandler;

    @Bean
    public FruitRouter fruitRouter() {
        FruitRouter fruitRouter = new FruitRouter();
        fruitRouter.rule().fruitType(FruitEnum.APPLE).handler(appleHandler).end();
        fruitRouter.rule().fruitType(FruitEnum.ORANGE).handler(orangeHandler).end();
        fruitRouter.rule().fruitType(FruitEnum.ALL).handler(appleHandler, orangeHandler).end();
        return fruitRouter;
    }
}
