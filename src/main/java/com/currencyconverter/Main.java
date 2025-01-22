package com.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService service = new CurrencyService();

        System.out.println("Bienvenido al Conversor de Monedas! 🌍");
        System.out.println("Por favor, selecciona una opción:");
        System.out.println("1. Convertir USD a ARS");
        System.out.println("2. Convertir USD a BRL");
        System.out.println("3. Convertir USD a COP");
        System.out.println("4. Salir");

        boolean running = true;
        while (running) {
            System.out.print("Tu elección: ");
            int option = scanner.nextInt();

            if (option == 4) {
                System.out.println("¡Gracias por usar el Conversor de Monedas! 👋");
                running = false;
                continue;
            }

            System.out.print("Introduce el monto en USD: ");
            double amount = scanner.nextDouble();

            switch (option) {
                case 1 -> service.convertCurrency(amount, "ARS");
                case 2 -> service.convertCurrency(amount, "BRL");
                case 3 -> service.convertCurrency(amount, "COP");
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
