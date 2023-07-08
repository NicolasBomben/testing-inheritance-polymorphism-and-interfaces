//gerente extiende de Funcionario.
public class Gerente  extends Funcionario implements Autenticable{
    
    @Override
    public double getBonification(){
        return 2000;
    }

    @Override
    public void setClave(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setClave'");
    }

    @Override
    public boolean iniciarSesion(String clave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iniciarSesion'");
    }
}
