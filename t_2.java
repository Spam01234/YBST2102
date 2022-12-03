package com.company;
import java.util.Arrays;

public class t_2 {
    public static void main(String[] args) {
        System.out.println("1. repeat: " + repeat("mice", 5));
        System.out.println("2. dofferenceMaxMin: " + dofferenceMaxMin(new int[] {44,32,86,19}));
        System.out.println("3. asAvgWhile: " + asAvgWhile(new int[] {1,3}));
        System.out.println("4. cumulativeSum: " + cumulativeSum(new int[] {1,2,3}));
        System.out.println("5. getDecimalPlaces: " + getDecimalPlaces("33.111"));
        System.out.println("6. Fibonacci: " + Fibonacci(3));
        System.out.println("7.isValid: " + isValid("593311"));
        System.out.println("8.isStrangeParir: " + isStrangeParir("a","a"));
        System.out.println("9.1.isPrefix: " + isPrefix("automation","auto-"));
        System.out.println("9.2.isSuffix: " + isSuffix("retrospect","spect"));
        System.out.println("10.hexLattice: \n" + hexLattice(19));
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_1
    public static String repeat(String word, int number){
        String resault = "";
        // Проходит по слову и добавляет в результату букву повторенную number раз
        for (int i = 0; i < word.length(); i++){
            for(int j = 0; j < number; j++){
                resault += word.charAt(i);
            }
        }
        return resault;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_2
    public static int dofferenceMaxMin(int[] array){
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++){// Находит максимальное и минимальное значение в массиве
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }
        return Math.abs(max - min);// Возвращает разницу между максимальным и минимальным значением
    }

    //2_3
    public static boolean asAvgWhile(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){// Суммируем числа в массиве
            sum += array[i];
        }
        return ((sum/array.length) % 1 == 0) ? true : false;// Возвращаем являетя ли число целым
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_4
    public static String cumulativeSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {// В цикле суммируем числа затем меняем получившаяся число
            sum += array[i];
            array[i] = sum;
        }
        return Arrays.toString(array);//import java.util.Arrays;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_5
    public static int getDecimalPlaces(String number){
        if(!number.contains(".")) return 0;// Если строка не имеет точки выходим из функции с 0
        return (number.length() -1 ) - (number.indexOf("."));  // Возвращаем число символов после точки
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_6
    public static int Fibonacci(int number){
        if (number <= 2) return number;// Если число меньше или равно двух возвращаем число
        return Fibonacci(number - 1) + Fibonacci(number - 2);// Рекурсивно вызываем функцию для нахождения числа Фибоначи
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_7
    public static boolean isValid(String number){
        return ((number.length() > 5) || !number.matches("[0-9]+")) ? false : true;// Возвращаем удовалетваряет ли строка заданным условиям
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_8
    public static boolean isStrangeParir(String first, String second){
        if(first.isEmpty() && second.isEmpty()) return true;// Проверка на пустые строки
        else if(first.isEmpty() || second.isEmpty()) return false;
        return (first.charAt(0) == second.charAt(second.length() - 1) && // Проверяем равно ли условие
                second.charAt(0) == first.charAt(first.length() - 1));

    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_9
    public static boolean isPrefix(String word, String prefix){
        return (word.startsWith(prefix.substring(0, prefix.length()-1))) ? true : false;
    }
    public static boolean isSuffix(String word, String suffix){
        return (word.endsWith(suffix.substring(1))) ? true : false;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //2_10
    public static String hexLattice(int number){
        String resault = "";
        // Проверяем по формуле центрированного шестиугольника является ли число центрированным шестиугольником
        if(((3 + Math.sqrt(12 * number - 3)) / 6) % 1 != 0) return "Invalid";
        // Получаем число кругов в первой строчке
        int someVar = (int)(1 + Math.sqrt(number / 3));
        // Присваиваем в результат верхние строки без середины
        for (int i = someVar ; i < 2 * someVar - 1; i++) {
            resault += " ".repeat(2 * someVar - 2 - i) + " o".repeat(i) + System.lineSeparator();
        }
        resault += "o " + "o ".repeat( 2 * someVar - 2) + System.lineSeparator();  // Присваиваем в результат значение средней строки
        for (int i = 2 * someVar - 2; i >= someVar; i--) {        // Присваиваем в результат нижних строк
            resault += " ".repeat(2 * someVar - 2 - i) + " o".repeat(i) + System.lineSeparator();
        }
        return resault;
    }
}
