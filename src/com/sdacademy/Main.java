package com.sdacademy;

public class Main {

    public static void main(String[] args) {
	float weight = 50f;
    double height =1.55;
    double bmi = weight/ (height * height);

    if (weight > 0 && height > 0) {
        System.out.println("BMI je: " + bmi);

        // women
        if (bmi < 19) {
            System.out.println("Underweight woman");
        } else if (bmi < 24) {
            System.out.println("Normal weight woman");
        } else if (bmi < 29) {
            System.out.println("Overweight woman");
        } else if (bmi < 39) {
            System.out.println("Obese woman");
        } else {
            System.out.println("Extremely obese woman");
        }
        // men
        if (bmi < 20) {
            System.out.println("Underweight man");
        } else if (bmi < 25) {
            System.out.println("Normal weight man");
        } else if (bmi < 30) {
            System.out.println("Overweight man");
        } else if (bmi < 40) {
            System.out.println("Obese man");
        } else {
            System.out.println("Extremely obese man");
        }
    } else {
        System.out.println("Chyba: špatně zadané hodnoty. Weight = " + weight + " , height = " + height);
    }
    }
}
