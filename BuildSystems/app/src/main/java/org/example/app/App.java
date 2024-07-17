/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.app;

import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class App {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();

        String url =  "https://fakestoreapi.com/products?limit=1";

        Request request = new Request.Builder().url(url).build();

        try(Response response = client.newCall(request).execute()){
            System.out.println(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}