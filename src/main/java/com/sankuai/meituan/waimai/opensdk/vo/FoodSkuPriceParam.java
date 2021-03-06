package com.sankuai.meituan.waimai.opensdk.vo;

import java.util.List;

/**
 * Created by zhangzhidong on 15/10/28.
 */
public class FoodSkuPriceParam {
    private String app_food_code;
    private List<skuPriceParam> skus;

    public String getApp_food_code() {
        return app_food_code;
    }

    public FoodSkuPriceParam setApp_food_code(String app_food_code) {
        this.app_food_code = app_food_code;
        return this;
    }

    public List<skuPriceParam> getSkus() {
        return skus;
    }

    public FoodSkuPriceParam setSkus(List<skuPriceParam> skus) {
        this.skus = skus;
        return this;
    }

    @Override
    public String toString() {
        return "FoodSkuPriceParam [" +
                "app_food_code='" + app_food_code + '\'' +
                ", skus=" + skus +
                ']';
    }
}
