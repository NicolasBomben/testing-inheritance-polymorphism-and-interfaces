package test;

import modelo.CuentaCorriente;

public class TestArrayObjeto {
    

    public static void main(String[] args) {
        
        //creo una nueva instancia del obejo cuenta corriente.
        CuentaCorriente cuentaNicolas = new CuentaCorriente(22, 12);
        //creo la instancia de mi array donde voy a guardar las cuentas corrientes.
        CuentaCorriente[] cuentas = new CuentaCorriente[5];

        //la cuenta corriente va a ocupar el indice 1 de mi array.
        cuentas[1] = cuentaNicolas;
        System.out.println(cuentaNicolas);
        //desde el array instanciado (cuentas) puedo crear una nueva istancia de cuenta.
        cuentas[3] = new CuentaCorriente(23, 045);

        //for para iterar las cuentas corrientes
        for(int i = 0; i < cuentas.length; i++){
            System.out.println(cuentas[i]);

        }



    }
}
