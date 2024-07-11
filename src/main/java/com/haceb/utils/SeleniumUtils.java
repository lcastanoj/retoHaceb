package com.haceb.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SeleniumUtils {
    public static WebElement selectRandom(List<WebElement> items) {
        Random random = new Random();
        int index = random.nextInt(items.size());
        return items.get(index);
    }

    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
