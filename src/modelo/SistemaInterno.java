package modelo;
public class SistemaInterno {

    private String clave = "nfgk123";

    public boolean autenticado(Autenticable gerente) {
        boolean puedeInicarSesion = gerente.iniciarSesion(clave);
        if(puedeInicarSesion){
            System.out.println("login exitoso!");
            return true;
        }else{
            System.out.println("error en login");
            return false;
        }
    }


    }

