package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {

    <T> T obternerDatos(String json, Class<T> clase);
}
