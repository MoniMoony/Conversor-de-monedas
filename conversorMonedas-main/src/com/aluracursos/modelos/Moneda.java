package com.aluracursos.modelos;
import com.google.gson.JsonObject;

public record Moneda(JsonObject conversion_rates) {
}
