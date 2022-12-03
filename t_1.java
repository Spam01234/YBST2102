package com.company;

public class t_1 {
    public static void main(String[] args) {
        System.out.println("1. remaider: " + remaider(1, 3));
        System.out.println("2. triArea: " + triArea(3,2 ));
        System.out.println("3. animals: " + animals(1,3,5));
        System.out.println("4. profitablegamble: " + profitablegamble(0.2,50,9));
        System.out.println("5. operation: " + operation(24,15,9));
        System.out.println("6.ctoa: " + ctoa('A'));
        System.out.println("7.addUpTo: " + addUpTo(3));
        System.out.println("8.nextEdge: " + nextEdge(8,10));
        System.out.println("9.sumOfCubes: " + sumOfCubes(new int[] {1,2,3}));
        System.out.println("10.abcmath: " + abcmath(42,5,10));
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_1
    public static int remaider(int first, int second){
        //Возвращает остаток от деления
        return first % second;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_2
    public static int triArea(int base, int height){
        // Возвращает площадь треугольника по формуле
        return (base * height)/2;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_3
    public static int animals(int chickens, int cows, int pigs){
        return (chickens * 2) + (cows * 4) + (pigs * 4);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_4
    public static boolean profitablegamble(double prob, double prize, double pay){
        return (prob * prize  > pay) ? true : false;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_5
    public static String operation(int N, int a, int b){
        if((a + b) == N){
            return "added";
        }
        else if ((a - b) == N){
            return "subtracted";
        }
        else if ((a / b) == N){
            return "divided";
        }
        else if ((a * b) == N){
            return "multiplied";
        }
        else{
            return "none";
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_6
    public static int ctoa(char Symbol ){
        return (int)Symbol; // Возвращает преобразованный в int символ - ASCII код
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_7
    public static int addUpTo(int num){
        int result = 0;
        for (int i = 1; i <= num; i++) { // Циклом складываем числа и возвращаем результат
            result = result + i;
        }
        return result;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_8
    public static int nextEdge(int side1, int side2){
        return (side1+side2) - 1;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_9
    public static int sumOfCubes(int[] nums){
        int resault = 0;
        for (int i = 0; i < nums.length; i++){// Циклом проходимся по массиву и суммируется квадраты цифр
            resault += Math.pow(nums[i],3);
        }
        return resault;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //1_10
    public static boolean abcmath(int a, int b, int c){
        int resault = a;
        for (int i = 0; i < b; i++){ // Циклом складываем А
            a = resault;
            resault += a;
        }
        return (resault % c == 0) ? true : false;// Возвращаем результат деления А на С
    }
}
