package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
	int[] arr = {8,2,8,3,2,8,1};
        System.out.printf("Число, яке повторюється найбільшу кількість разів:%d",Exercise.Calculate(arr));      

    }
}