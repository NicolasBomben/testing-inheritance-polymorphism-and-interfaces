class TestCuenta {

    public static void main(String[] args) {
        
        CuentaCorriente cc = new CuentaCorriente(1, 1);
        CajaDeAhorro ca = new CajaDeAhorro(1, 2);

        //DOPOSITO
        cc.depositar(2000);
        //TRANSFIERO A CA
        cc.transferir(1500, ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());



    }
}