package test;

public class TestMain {

    public static void main(String[] args) {
        
        int[] edades = new int[5];
        edades[3] = 66;
        int edadesGuardadas = edades.length;

        System.out.println(edadesGuardadas);

        for( int i = 0; i < edadesGuardadas; i++){
            System.out.println(edades[i]);
        }

        

    }
    
}
