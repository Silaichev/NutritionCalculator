package com.esilaichev.nutritioncalculator;

import com.esilaichev.nutritioncalculator.utils.NutritionCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NutritionCalculatorTest {

    @Test
    void calculateDayCalories() {
        int result = NutritionCalculator.calculateDayCalories(89, 185, 25, NutritionCalculator.Sex.MALE);
        System.out.println(result);
        Assertions.assertTrue(result > 0);
    }
}
