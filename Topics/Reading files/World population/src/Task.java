import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Population {
   int year;
   long population;

    public Population(int year, long population) {
        this.year = year;
        this.population = population;
    }

    public int getYear() {
        return year;
    }

    public long getPopulation() {
        return population;
    }
}

public class Task {
    public static void main(String[] args) {
        File file = new File(".\\Topics\\Reading files\\World population\\dataset_91069.txt");
        ArrayList<Population> populations = new ArrayList<>();

        try (Scanner scanner = new Scanner(file)) {
            System.out.println(scanner.nextLine());
            while (scanner.hasNext()) {
                populations.add(new Population(scanner.nextInt(), Long.parseLong(scanner.next().replaceAll(",", ""))));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        long largestIncreaseYearPopulation = Integer.MIN_VALUE;
        int yearWithLargestIncrease = 0;

        for (int i = 0; i < populations.size() - 1; i++) {

            if (largestIncreaseYearPopulation < populations.get(i + 1).getPopulation() - populations.get(i).getPopulation()) {
                largestIncreaseYearPopulation = Math.max(largestIncreaseYearPopulation, populations.get(i + 1).getPopulation() - populations.get(i).getPopulation());
                yearWithLargestIncrease = populations.get(i + 1).getYear();
            }
        }

        System.out.println(yearWithLargestIncrease + "\t" + largestIncreaseYearPopulation);
    }
}
