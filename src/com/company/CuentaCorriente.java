package com.company;

public class CuentaCorriente extends CuentaBancaria{
    int lineaSobregiro;

    public CuentaCorriente(int numeroCuenta, String fechaApertura, int lineaSobregiro) {
        super(numeroCuenta, fechaApertura);
        this.lineaSobregiro = lineaSobregiro;
    }
}
