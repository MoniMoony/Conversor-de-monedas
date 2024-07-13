package com.aluracursos.modelos;

import com.google.gson.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;


public class ConsultaDivisa {
    public ArrayList consulta() throws IOException {

        String url_str = "https://v6.exchangerate-api.com/v6/f87bbbe6a8cf1e0a294c7e44/latest/USD";

        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

        JsonObject req_result = jsonobj.get("conversion_rates").getAsJsonObject();
        ArrayList<Double> divisas = new ArrayList<Double>();
        divisas.add(req_result.get("ARS").getAsDouble());
        divisas.add(req_result.get("BRL").getAsDouble());
        divisas.add(req_result.get("COP").getAsDouble());
        divisas.add(req_result.get("USD").getAsDouble());
        System.out.println("Lista de divisas: " + divisas);

        return divisas;
    }
}
