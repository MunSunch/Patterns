package com.munsun.patterns.dz.solid;

import java.util.List;

public abstract class Shop {
    private List<String> products;
    private Recommendations recommendations;

    public Shop(List<String> products, Recommendations recommendations) {
        this.products = products;
        this.recommendations = recommendations;
    }

    public String recommendProduct() {
        return recommendations.recommend(products);
    }
}