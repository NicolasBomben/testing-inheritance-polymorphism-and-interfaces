package test;

import modelo.Cuenta;
import modelo.CuentaCorriente;
import modelo.GuardaCuentas;

public class TestGuardarCuentas {
    
    public static void main(String[] args) {

        GuardaCuentas guardaCuentas = new GuardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 22);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(22, 44);
        guardaCuentas.adicionar(cc2);
        
        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));
    }

}
