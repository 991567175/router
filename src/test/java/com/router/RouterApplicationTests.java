package com.router;

import com.router.enums.FruitEnum;
import com.router.router.FruitRouter;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class RouterApplicationTests {

    @Resource
    private FruitRouter fruitRouter;

    @Test
    void contextLoads() {
//        fruitRouter.buy(FruitEnum.ORANGE);
//        fruitRouter.buy(FruitEnum.APPLE);
        fruitRouter.buy(FruitEnum.ALL);

    }

}
