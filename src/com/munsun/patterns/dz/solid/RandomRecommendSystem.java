package com.munsun.patterns.dz.solid;

import java.util.List;
import java.util.Random;

public class RandomRecommendSystem implements Recommendations {
    private Random random;

    public RandomRecommendSystem() {
        random = new Random();
    }

    @Override
    public String recommend(List<String> products) {
        return products.get(random.nextInt(products.size()));
    }
}
