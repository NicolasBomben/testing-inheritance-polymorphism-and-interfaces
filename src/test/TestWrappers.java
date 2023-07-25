package test;

public class TestWrappers {

    public static void main(String[] args) {
        
        Double numeroDoble = 33.0; //autoboxing
        Boolean verdadero = true; //autoboxing

        Double numeroDouble2 = Double.valueOf(33);
        System.out.println(numeroDouble2);

        String numeroString = "44";

        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);

        System.out.println(stringToDouble);
        System.out.println(stringToInteger);

    }
    
}
