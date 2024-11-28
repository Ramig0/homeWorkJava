package org.example;


public class Main {


//    public static void main(String[] args) {
//
//    }
//        String myString = new String("I study Basic Java!");
//
//        processString(myString);
//    }
//
//    public static void processString(String str) {
//        System.out.println("Исходная строка: " + str);
//
//        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
//
//        System.out.println("Содержит 'Java': " + str.contains("Java"));
//
//        String replaced = str.replace('a', 'o');
//        System.out.println("После замены 'a' на 'o': " + replaced);
//
//        System.out.println("Верхний регистр: " + str.toUpperCase());
//
//        System.out.println("Нижний регистр: " + str.toLowerCase());
//
//        int javaIndex = str.indexOf("Java");
//        if (javaIndex != -1) {
//            String substring = str.substring(javaIndex, javaIndex + 4);
//            System.out.println("Вырезанная подстрока: " + substring);
//        } else {
//            System.out.println("Подстрока 'Java' не найдена");
//        }

    public static class MathOperations {

        public static double add(double a, double b) {
            return a + b;
        }


        public static double subtract(double a, double b) {
            return a - b;
        }


        public static double multiply(double a, double b) {
            return a * b;
        }

        public static double divide(double a, double b) {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Ошибка: деление на ноль!");
                return Double.NaN; // Not a Number
            }
        }

        public static void main(String[] args) {
            double num1 = 10;
            double num2 = 5;

            System.out.println("Сложение: " + add(num1, num2));
            System.out.println("Вычитание: " + subtract(num1, num2));
            System.out.println("Умножение: " + multiply(num1, num2));
            System.out.println("Деление: " + divide(num1, num2));

            System.out.println("Деление на ноль: " + divide(num1, 0));
        }
    }
}






