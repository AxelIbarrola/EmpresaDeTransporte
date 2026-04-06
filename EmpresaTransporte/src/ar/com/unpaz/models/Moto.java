package ar.com.unpaz.models;

import ar.com.unpaz.exceptions.CombustibleInsuficienteException;

public class Moto extends Vehiculo {

	public Moto(String patente, String marca, double cantidadCombustible) {
		
		super(patente, marca, cantidadCombustible);
	}
	
	@Override
	public void avanzar(int km) {
		
		double combustibleNecesario = km / 20;
		
		if (combustibleNecesario <= this.getCantidadCombustible()) {
			
			System.out.println("Combustible suficiente, moto avanzando(" + km + "km)...");
			this.cantidadCombustible -= combustibleNecesario;			
			
		} else {
			
			throw new CombustibleInsuficienteException("Combustible insuficiente. El vehículo no avanzará y el combustible se mantendrá igual.");
		}
	}

}
