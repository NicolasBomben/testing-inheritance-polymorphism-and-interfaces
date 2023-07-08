public class TestFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario nicolas = new Contador();
        nicolas.setName("nicolas");
        nicolas.setDocument("39323720");
        nicolas.setSalary(2000);
        nicolas.setType(0);

        System.out.println(nicolas.getSalary());
        System.out.println(nicolas.getBonification());

    }
}
