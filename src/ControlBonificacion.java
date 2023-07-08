public class ControlBonificacion {

    private double suma;

    //usando el principio de polimorfismo podedemos utilizar ese metodo en todos los Fucionarios (Gerente, contador)
    //ya que todos heredan de Funcionario.
    
    public double registrarSalario( Funcionario funcionario ) {
        this.suma = funcionario.getBonification() + this.suma;
        System.out.println("Calculo actual: " + this.suma);
        return this.suma;
    }

}
