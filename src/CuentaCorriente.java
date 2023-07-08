public class CuentaCorriente extends Cuenta{

    
	public CuentaCorriente(int agencia, int numero) {
        //llamo al consutrctor con sus parametros.
        //super accede a los metodos de la clase padre (CUENTA)
		super(agencia, numero);
	}

	//override de metodo que viene de la clase padre (CUENTA).
	//aca le aplicamos una nueva regla para clase hija (CUENTA CORRIENTE)
	//ES UN EJEMPLO DE POLIMORFISMO.
	
	@Override
	public boolean retirar(double valor){
		double comisionPorTransferencia = valor + 0.5;
		return super.retirar(comisionPorTransferencia);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
    
}
