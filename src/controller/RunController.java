package controller;

import models.BasicData;
import models.CarData;

import java.util.Arrays;
import java.util.Scanner;

public class RunController extends BasicData {
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz co chcesz stworzyć: samochód (wpisz car) czy motocykl (wpisz bike) ? ");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "car" -> {
                CarData CarData = new CarData();
                CarData.welcome(decision);
                CarData.breakLine();
                System.out.println("Podaj nazwę modelu pojazdu: ");
                CarData.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj rodzaj samochodu:");
                CarData.car_class = String.valueOf(scanner.nextLine());
                System.out.println("Podaj rocznik pojazdu:");
                Integer integer = null;
                CarData.setAge(integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(CarData.carData));
            }
            case "bike" -> {
                Bike bike = new Bike();
                bike.welcome(decision);
                bike.breakline();
                System.out.println("Podaj nazwę modelu");
                bike.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj rodzaj motocykla:");
                bike.setType(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj rocznik motocykla:");
                bike.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(bike.bikeData));
            }
            default -> {
                System.out.println("Zły wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Naura");
    }
}
