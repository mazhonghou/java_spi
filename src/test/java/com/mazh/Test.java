package com.mazh;

import java.util.ArrayList;
import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        // 使用Java的ServiceLoader进行加载
        ServiceLoader<Animal> load = ServiceLoader.load(Animal.class);
        load.forEach(Animal::call);
    }
}
