package modelo;

public abstract class Cuenta {
	
	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente titular; 
	private static int total = 0;
	
	
	public Cuenta(int agencia, int numero){
		if(agencia <= 0){
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else{
			this.agencia = agencia;
		}total ++;
		System.out.println("Cantidad de cuentas " + total);
	}
	
	
	
	public abstract void depositar( double valor);

	
	//metodo retirar
	public void retirar(double valor) throws SaldoInsuficienteException{
		if(this.saldo < valor){
			//exception
			throw new SaldoInsuficienteException("No tienes saldo");
		}
		this.saldo -= valor;
	}


	
	 public boolean transferir(double valor, Cuenta cuenta) {
		 if(this.saldo >= valor) {
			 this.saldo = this.saldo - valor;
			 cuenta.depositar(valor);
			 return true;
		 }else {
			 return false;
		 }
	 }
	
	 //metodo obtener saldo... en esto lo que se hace es crear un  getSaldo para ser usado en todo el proyecto ya que en el objeto cuenta el saldo es private
	 public double getSaldo() {
		return this.saldo;
	 }

	 //metodo set para asignar.
	 /*public void setAgencia(int agencia){
		if( agencia > 0){
			this.agencia = agencia;
		}else{
			System.out.println("No se puede asignar este valor a la agencia seleccionada");
		}
	 }*/

	 //metodo para obtener.
	 public int getAgencia() {
		 return agencia;
	 }

	 //metodo para asignar un titular en la cuenta.
	 public void setTitular(Cliente titular) {
		 this.titular = titular;
	 }

	 public Cliente getTitular() {
		 return titular;
	 }

	 //metodo para obtener el total de cuentas que se crearon.
	 public static int getTotal() {
		 return total;
	 }

}
