package com.aluracursos.screenmatch.model;

public enum Categoria {

    ACCION("Action" , "Acción"),

    ROMANCE("Romance" , "Romance"),

    COMEDIA("Comedy" , "Comedia"),

    DRAMA("Drama" , "Drama"),

    CRIMEN("Crime" , "Crimen");

    private String categoriaOmdb;
    private String categoriaEspanol;

    Categoria (String categoriaOmdb, String categoriaEspanol){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEspanol = categoriaEspanol;
    }

    // metodo que verifica si el texto que se pasa a traves del constructor,si es igual o
    // puede ser igualado a algun elemento de las categorias definidas como atributo.
    public static Categoria fromString(String text){
        for (Categoria categoria : Categoria.values()){
            if (categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }

    public static Categoria fromEspanol(String text){
        for (Categoria categoria : Categoria.values()){
            if (categoria.categoriaEspanol.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("Ninguna categoria encontrada: " + text);
    }
}
