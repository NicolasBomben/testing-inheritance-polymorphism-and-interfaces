package modelo;
public class AutenticacionUtil {
    private String clave;

    public void setContraseña(String clave) {
        this.clave = clave;
    }

    public boolean autenticar(String clave) {
        if (this.clave == clave) {
            return true;
        } else {
            return false;
        }
    }

}


