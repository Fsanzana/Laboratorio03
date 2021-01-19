package com.company;

public class Main {

    public static void main(String[] args) {
	    SucursalBancaria sucursalBancaria = new SucursalBancaria(12345,4780000);
	    Persona persona = new Persona("Luis","Jara","20.353.885-3");

	    persona.setCuentaBancaria(sucursalBancaria.addCuentaBancarias());
		System.out.println(persona.getCuentaBancaria().lineaSobregiro);


    }
}
