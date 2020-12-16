package com.router.router;

import com.router.enums.FruitEnum;
import com.router.handle.FruitHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 规则
 */
public class FruitRouterRule {


    private final FruitRouter routerBuilder;

    private FruitEnum fruitTypeKey;

    private List<FruitHandler> handlers = new ArrayList<>();

    public FruitRouterRule(FruitRouter routerBuilder) {
        this.routerBuilder = routerBuilder;
    }

    /**
     * 如果eventKey等于某值
     */
    public FruitRouterRule fruitType(FruitEnum eventKey) {
        this.fruitTypeKey = eventKey;
        return this;
    }

    public FruitRouterRule handler(FruitHandler... handlers) {
        this.handlers.addAll(Arrays.asList(handlers));
        return this;
    }

    public FruitRouterRule handler(FruitHandler handler) {
        this.handlers.add(handler);
        return this;
    }

    /**
     * 规则结束，代表如果一个消息匹配该规则，那么它将不再会进入其他规则
     */
    public FruitRouter end() {
        this.routerBuilder.getRules().add(this);
        return this.routerBuilder;
    }



    protected boolean test(FruitEnum fruitEnum) {
        return Objects.equals(fruitEnum, this.fruitTypeKey);
    }


    protected void buy() {
        for (FruitHandler handler : this.handlers) {
            // 返回最后handler的结果
            if (handler == null) {
                continue;
            }
            handler.buy();
        }
    }
}
