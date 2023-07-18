package test;
import modelo.Administrador;
import modelo.Gerente;
import modelo.SistemaInterno;

public class TestSistemaInterno {
    
    public static void main(String[] args) {
        
        SistemaInterno sistema = new SistemaInterno();
        Gerente gerente1 = new Gerente();
        Administrador admin1 = new Administrador();

        sistema.autenticado(gerente1);
        sistema.autenticado(admin1);

    }

}
