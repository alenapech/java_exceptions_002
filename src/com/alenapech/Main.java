package com.alenapech;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        getFloat();

//        exercise2(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
//        exercise2(new int[]{1, 2, 3});
//        exercise2(null);

//        exercise3();

        checkEmptyString();
    }

//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//    и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
//    приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    private static void getFloat(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input float:");
        try {
            System.out.println(input.nextFloat());
        } catch (InputMismatchException e) {
            System.out.println("Input is wrong. Please try again");
            getFloat();
        }
    }

//    Если необходимо, исправьте данный код (задание 2
//    https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    private static void exercise2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (NullPointerException e){
            System.out.println("Catching exception: " + e);
        }
        // it can be replaced with catch RuntimeException since the code is the same in all catches
    }

//    Дан следующий код, исправьте его там, где требуется (задание 3
//    https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    private static void exercise3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!"); // where can we get this error?!
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

//    Разработайте программу, которая выбросит Exception, когда пользователь
//    вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    private static void checkEmptyString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input string:");
        String i = input.nextLine();
        if (i == null || "".equals(i)) {
            throw new RuntimeException("Empty string is not allowed!");
        }
    }

}
