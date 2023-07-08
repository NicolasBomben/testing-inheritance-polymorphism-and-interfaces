public class TestReferencia {
    
    public static void main(String[] args) {
        //el elemento mas generico (funcionario) puede ser adaptable.
        //                      al elemento mas especifico.
        Funcionario funcionario = new Gerente();
        funcionario.setName("Facundo");
        
        Gerente gerente = new Gerente();
        gerente.setName("Juan");

        funcionario.setSalary(3000);
        gerente.setSalary(4000);

    }
}
