public class CajaDeAhorro extends Cuenta{

    public CajaDeAhorro(int agencia, int numero) {
        super(agencia, numero);
        
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
    
}
