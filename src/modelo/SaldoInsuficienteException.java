package modelo;
//exception para manejar error.
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

