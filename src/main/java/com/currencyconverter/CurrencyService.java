package com.currencyconverter;

import com.google.gson.Gson;

public class CurrencyService {
    private final ApiClient apiClient;
    private final Gson gson;

    public CurrencyService() {
        this.apiClient = new ApiClient();
        this.gson = new Gson();
    }

    public void convertCurrency(double amount, String targetCurrency) {
        String jsonResponse = apiClient.getExchangeRates();

        if (jsonResponse == null) {
            System.out.println("Error al obtener los datos de la API. Inténtalo más tarde.");
            return;
        }

        ExchangeRateResponse exchangeRateResponse = gson.fromJson(jsonResponse, ExchangeRateResponse.class);
        Double rate = exchangeRateResponse.getRates().get(targetCurrency);

        if (rate == null) {
            System.out.println("Moneda no compatible. Inténtalo con otra.");
            return;
        }

        double convertedAmount = amount * rate;
        System.out.printf("Monto convertido: %.2f USD = %.2f %s%n", amount, convertedAmount, targetCurrency);
    }
}
