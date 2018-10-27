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
public class DetalleRedes implements Serializable{
    int idCliente;
    RedesSociales redes;

    public DetalleRedes() {
    }

    public DetalleRedes(int idCliente, RedesSociales redes) {
        this.idCliente = idCliente;
        this.redes = redes;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public RedesSociales getRedes() {
        return redes;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setRedes(RedesSociales redes) {
        this.redes = redes;
    }
}
