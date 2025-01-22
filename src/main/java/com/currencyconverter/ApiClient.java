package com.currencyconverter;

import java.io.IOException;
import java.util.Properties;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private final String apiUrl;

    public ApiClient() {
        this.apiUrl = loadApiUrl();
    }

    private String loadApiUrl() {
        Properties properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
            return properties.getProperty("api.url");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al cargar la URL de la API desde application.properties");
        }
    }

    public String getExchangeRates() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .GET()
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
