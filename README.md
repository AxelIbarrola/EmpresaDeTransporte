Una empresa de transporte necesita gestionar distintos tipos de vehículos.

## VEHÍCULOS

  

- Autos
    
- Camiones
    
- Motos
    

  

## CARACTERÍSTICAS COMPARTIDAS

  

- Patente
    
- Marca
    
- Cantidad de combustible (litros)
    

  

## ACCIÓN: AVANZAR CIERTA CANTIDAD DE KILÓMETROS

  

- Auto: consume 1 litro cada 10 km
    
- Camión: consume 1 litro cada 4 km
    
- Moto: consume 1 litro cada 20 km
    

  
  

## OBJETIVOS

  

- Herencia
    
- Clases abstractas
    
- Polimorfismo
    

  
  

## CLASE ABSTRACTA: Vehículo

  

- Atributos comunes
    
- Constructor
    
- Métodos getters
    
- Un método abstracto
    
- public abstract void avanzar (int km)
  

## CLASES HIJAS

  

- Auto
    
- Camion
    
- Moto
    

  
## MÉTODO A IMPLEMENTAR EN CADA CLASE

  

- avanzar(int km)

- Descontar el combustible correspondiente según el consumo.
    
- Si no alcanza el combustible, no debe avanzar e informar la situación.
    

  

## CLASE PRINCIPAL: main

  

- Crear al menos un objeto de cada tipo de vehículo.
    
- Guardarlos en una colección de tipo vehículo.
    
- Recorrer la colección y hacer que todos avancen la misma cantidad de kilómetros.
    
- Mostrar por pantalla: 
    

- Tipo de vehículo
    
- Patente
    
- Combustible restante
    

  

## REQUISITOS IMPORTANTES

  

- No se puede instanciar la clase vehículo.
    
- Se debe utilizar polimorfismo para recorrer el objeto.
    
- Cada vehículo debe tener su propio comportamiento al avanzar.
