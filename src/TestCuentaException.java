public class TestCuentaException {
    
    public static void main(String[] args) {
        
        Cuenta cuenta = new CuentaCorriente(3, 20);
        cuenta.depositar(2500);
        try {
            cuenta.retirar(2500);
            cuenta.retirar(200);
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
