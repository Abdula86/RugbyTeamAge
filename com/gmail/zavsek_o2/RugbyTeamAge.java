package com.gmail.zavsek_o2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RugbyTeamAge {
    public static void main(String[] args) {
        List<Integer> firstTeamAges = generateRandomAges(25, 18, 40);
        List<Integer> secondTeamAges = generateRandomAges(25, 18, 40);

        System.out.println("Вік гравців першої команди: ");
        printAges(firstTeamAges);
        System.out.println("Вік гравців другої команди: ");
        printAges(secondTeamAges);

        int firstAveragesAge = (int) calculateAverageAge(firstTeamAges);
        int secondAveragesAge = (int) calculateAverageAge(secondTeamAges);

        System.out.println("Середній вік первої команди: " + firstAveragesAge);
        System.out.println("Середній вік другої команди: " + secondAveragesAge);
    }


    public static List<Integer> generateRandomAges(int count, int minAge, int maxAge) {
        List<Integer> ages = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int age = random.nextInt(maxAge - minAge + 1) + minAge;
            ages.add(age);
        }
        return ages;
    }

    public static void printAges(List<Integer> ages) {
        for (int age : ages) {
            System.out.println(age + " ");
        }
        System.out.println();
    }


    public static double calculateAverageAge(List<Integer> ages) {
        double sum = 0;
        for(int age : ages) {
            sum += age;
        }
        return sum / ages.size();
    }
}