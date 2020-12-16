package com.router.router;

import com.router.enums.FruitEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 路由器
 */
public class FruitRouter {


    private final List<FruitRouterRule> rules = new ArrayList<>();


    List<FruitRouterRule> getRules() {
        return this.rules;
    }


    /**
     * 开始一个新的Route规则.
     */
    public FruitRouterRule rule() {
        return new FruitRouterRule(this);
    }

    public void buy(FruitEnum fruitEnum) {
        final List<FruitRouterRule> matchRules = new ArrayList<>();
        // 收集匹配的规则
        for (final FruitRouterRule rule : this.rules) {
            if (rule.test(fruitEnum)) {
                matchRules.add(rule);
                break;
            }
        }
        if (matchRules.size() == 0) {
            return;
        }
        for (final FruitRouterRule rule : matchRules) {
            rule.buy();
        }
    }

}
