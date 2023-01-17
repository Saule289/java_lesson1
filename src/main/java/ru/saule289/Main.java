package ru.saule289;

public class Main {
    public static void main(String[] args) {

        //математические операции
        byte a = -128;
        short b = 32767;
        int c = 1545460;
        long d = 98464654;
        float e = 9.454F;
        double f = 45987.574878;

        System.out.println(a + b + c + d);
        System.out.println(a - b - c - d);
        System.out.println(a * b * c * d);
        System.out.println(c + e);
        System.out.println(c - f);
        System.out.println(c * f);
        System.out.println(c / f);


        // логические операторы
        int varNumber = -9;
        int varNumber1 = 8569;
        if (varNumber < 0 && varNumber1 > 0) {
            System.out.println("Логическое \"и\"");
        }

        int varOr = 459;
        int varOr1 = 36447;
        if (varNumber < 100 || varNumber1 > 1000) {
            System.out.println("Логическое \"или\"");
        }


        int varNo = 9;
        int varNo1 = 89;
        if (varNo != varNo1 ) {
            System.out.println("Логическое \"не\"");
        }

        // переполнение при вычислениях

             System.out.println((byte) (a + 48778));
             System.out.println((short) (b + 789946));
    }

}