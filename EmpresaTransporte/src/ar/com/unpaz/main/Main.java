package ar.com.unpaz.main;
import java.util.ArrayList;
import java.util.List;

import ar.com.unpaz.exceptions.CombustibleInsuficienteException;
import ar.com.unpaz.models.*;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo auto1 = new Auto("AE345AE", "Ford", 55);
		Vehiculo camion1 = new Camion("BU6778KI", "Fiat", 30);
		Vehiculo moto1 = new Moto("JI851KO", "Kawasaki", 45);
		
		List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(auto1);
		vehiculos.add(camion1);
		vehiculos.add(moto1);
		
		for (Vehiculo vehiculo : vehiculos) {
			
			try {
				
				System.out.println("Verificando combustible...");
				vehiculo.avanzar(550);
				
			} catch (CombustibleInsuficienteException e) {
				
				System.out.println(e.getMessage());
				
			} finally {
				
				System.out.println();
				System.out.println("Datos del vehículo:");
				System.out.println();
				System.out.println("Tipo de vehículo: " + vehiculo.getClass().getSimpleName());
				System.out.println("Patente: " + vehiculo.getPatente());
				System.out.println("Combustible restante: " + vehiculo.getCantidadCombustible());
				System.out.println();
			}
			
		}
	}

}
