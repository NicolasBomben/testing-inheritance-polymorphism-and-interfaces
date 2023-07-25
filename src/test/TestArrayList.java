package test;

import java.util.*;
import modelo.Cuenta;
import modelo.CuentaCorriente;

public class TestArrayList {
    
    public static void main(String[] args) {
        
        // <> Forzando a que acepte solo un tipo de objeto.
        ArrayList<Cuenta> lista = new ArrayList<>();
        // referencia           //objeto -> HEAP
        Cuenta cc = new CuentaCorriente(10, 30);
        Cuenta cc2 = new CuentaCorriente(23, 66);
        Cuenta cc3 = new CuentaCorriente(10, 30);

        lista.add(cc);
        lista.add(cc2);

        Cuenta obtenerCuenta = lista.get(0);
        System.out.println(obtenerCuenta);
        //la diferencia de lenght con .size es que retorna la cantida de parametros del array.
        for( int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        //por cada cuenta : lista es una buena forma de hacer for cuando usamos arraylist.
        for(Cuenta cuenta : lista){
            System.out.println(cuenta);
        }

        //metodo contains. para saber si una lista contiene un elemento. retorna un tipo booleano.
        boolean contiene = lista.contains(cc);
        //por referencia.
        if(contiene){
            System.out.println("Si contiene");
        }
        //por valores.
        if(cc.equals(cc3)){
            System.out.println("Si, son iguales.");
        }

    }
}
