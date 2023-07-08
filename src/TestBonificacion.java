public class TestBonificacion {
    
    public static void main(String[] args) {
        
        Funcionario nicolas = new Contador();

        nicolas.setSalary(4000);

        Gerente juan = new Gerente();
        juan.setSalary(2000);

        Contador jimena = new Contador();
        jimena.setSalary(3400);


        ControlBonificacion controlBonificacion = new ControlBonificacion();
        controlBonificacion.registrarSalario(nicolas);
        controlBonificacion.registrarSalario(juan);
        controlBonificacion.registrarSalario(jimena);

    }
}
