
public abstract class Cuenta {
	
	private int agencia;
	private int numero;
	protected double saldo;
	private Cliente titular; // aca estoy referenciando el objeto cliente que es parte del objeto cuenta...
	//static nos dice que esta variable no va a ser de la instancia. Va a ser de la clase.
	private static int total = 0;
	

	//constructor obliga a informar parametros. aca ninguna cuenta no va ser creada hasta que no se le de informacion.
	//en esto ya no necesito el metodo setAgencia(); Ej: si necesitara por regla de negocio crear una nueva cuenta.
	public Cuenta(int agencia, int numero){
		if(agencia <= 0){
			System.out.println("No se permite 0");
			this.agencia = 1;
		}else{
			this.agencia = agencia;
		}total ++;
		System.out.println("Cantidad de cuentas " + total);
	}
	
	
	//metodo void   recibe el valor que va a ser el saldo.
	public abstract void depositar( double valor);

	
	//metodo retirar
	public boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}else {
			return false;
		}
	}
	//metodo transferir 					aca usamos el objeto tipo cuenta
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
