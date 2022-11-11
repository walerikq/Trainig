package com.walerikq.trainig.clientRequest;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class SecondNoRelativityRequest {
    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)    // максимальное время ожидание подключения к серверу
                        .setSocketTimeout(30000)    // максимальное время ожидания получения данных
                        .setRedirectsEnabled(false) // возможность следовать редиректу в ответе
                        .build())
                .build();


        //данный запрос всегда выдаёт ошибку 500, я посмотрел в тырнетах, там сказали, что трока при валидации
        //всегда будет выдавать 500 ошибку
        HttpGet request = new HttpGet("http://localhost:8080/requestCounter/testPost");

        CloseableHttpResponse response =
                httpClient.execute(request);

        String result = EntityUtils.toString(response.getEntity());
        System.out.println(result);

    }
}
