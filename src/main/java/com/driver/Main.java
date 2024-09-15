package com.driver;

public class Main {
    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        System.out.println("Product of two integers: " + p.product(10, 20));
        System.out.println("Product of three integers: " + p.product(10, 20, 30));
        System.out.println("Product of two doubles: " + p.product(10.5, 20.5));
    }
}
