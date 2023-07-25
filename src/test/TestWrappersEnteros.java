package test;

import java.util.ArrayList;
import java.util.List;

public class TestWrappersEnteros {

    public static void main(String[] args) {
        

        int[] numeros = new int[10];

        int numero = 40;

        //WRAPPER
        Integer numeroObjeto = Integer.valueOf(40);

        List<Integer> lista = new ArrayList<Integer>();
        lista.add(numero); //autoboxing
        lista.add(Integer.valueOf(40));
        lista.add(numeroObjeto);

        //unboxing
        int valorPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
    
}
