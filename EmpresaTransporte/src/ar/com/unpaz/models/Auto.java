package ar.com.unpaz.models;

import ar.com.unpaz.exceptions.CombustibleInsuficienteException;

public class Auto extends Vehiculo {
	
	public Auto(String patente, String marca, double cantidadCombustible) {
		super(patente, marca, cantidadCombustible);
	}
	
	
	@Override
	public void avanzar(int km) {
		
		double combustibleNecesario = km / 10;
		
		if (combustibleNecesario <= this.cantidadCombustible) {
			
			System.out.println("Combustible suficiente, auto avanzando (" + km + "km)...");
			this.cantidadCombustible -= combustibleNecesario;
			
		} else {
			
			throw new CombustibleInsuficienteException("Combustible insuficiente");
		}
	}
}
