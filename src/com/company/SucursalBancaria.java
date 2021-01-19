package com.company;

import java.util.ArrayList;
import java.util.Random;

public class SucursalBancaria {
    private  int codigoSucursal;
    private int codigoPostal;
    ArrayList<CuentaCorriente> cuentasBancarias = new ArrayList<CuentaCorriente>();

    public SucursalBancaria(int codigoSucursal, int codigoPostal) {
        this.codigoSucursal = codigoSucursal;
        this.codigoPostal = codigoPostal;
    }

    public ArrayList<CuentaCorriente> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public CuentaCorriente addCuentaBancarias() {
        Random rnum = new Random();
        CuentaCorriente cuentaBancaria = new CuentaCorriente(rnum.nextInt(1000000),"1/2/2021",1000000);
        this.cuentasBancarias.add(cuentaBancaria);
        return cuentaBancaria;
    }

    public int getCodigoSucursal() {
        return codigoSucursal;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }
}
