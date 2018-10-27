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
public class Cliente implements Serializable {

    int idCliente;
    String nombre;
    String dni;
    String Telefono;
    String Fecha_nacimiento;
    String User;
    String Password;

    public Cliente() {
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Cliente(int idCliente, String nombre, String dni, String Telefono, String Fecha_nacimiento, String User, String Password) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.Telefono = Telefono;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.User = User;
        this.Password = Password;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
