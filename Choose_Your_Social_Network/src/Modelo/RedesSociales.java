/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author cesars
 */
public class RedesSociales implements Serializable{
    int id;
    String nombre;
    String URL;

    public RedesSociales() {
    }

    public RedesSociales(int id, String nombre, String URL) {
        this.id = id;
        this.nombre = nombre;
        this.URL = URL;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getURL() {
        return URL;
    }
}
