package test;
import modelo.Funcionario;
import modelo.Gerente;

public class TestGerente {
    
    public static void main(String[] args) {

        Gerente facundo = new Gerente();
        facundo.setClave("bomben123");
        
        Funcionario gerente = new Gerente();
        gerente.setSalary(6000);
        gerente.setType(1);

        System.out.println(gerente.getBonification());
        System.out.println(facundo.iniciarSesion("bomben123"));

    }
}
