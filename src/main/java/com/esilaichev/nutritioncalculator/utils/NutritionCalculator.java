package com.esilaichev.nutritioncalculator.utils;

public class NutritionCalculator {

    public enum Sex {
        MALE,
        FEMALE
    }

    public static int calculateDayCalories(int weight, int height, int age, Sex sex) {
        int result = 0;
        switch (sex) {
            case MALE:
                result = (int) ((10 * weight) + (6.25 * height) - (5 * age) + 5);
                break;
            case FEMALE:
                result = (int) ((10 * weight) + (6.25 * height) - (5 * age) - 161);
                break;
        }
        return result;
    }
}

