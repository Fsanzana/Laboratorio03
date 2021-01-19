package com.company;

public class Persona {
    String nombre;
    String apellido;
    String rut;
    CuentaCorriente cuentaBancaria;

    public Persona(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRut() {
        return rut;
    }

    public CuentaCorriente getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaCorriente cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
