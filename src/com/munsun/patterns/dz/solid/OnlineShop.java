package com.munsun.patterns.dz.solid;

import java.util.List;
import java.util.Random;
import java.util.UUID;

public class OnlineShop extends Shop implements Online, Tracking{
    public OnlineShop(List<String> products, Recommendations recommendations) {
        super(products, recommendations);
    }

    public UUID order(String product, int count) {
        System.out.println("Заказ: "+product+" Количество: "+count+" --> Обработан");
        return UUID.randomUUID();
    }

    @Override
    public String tracking(UUID idOrder) {
        int countOperation = 4;
        return List.of("Сборка", "Обработка", "Доставка", "Готово")
                .get(new Random().nextInt(countOperation));
    }
}
