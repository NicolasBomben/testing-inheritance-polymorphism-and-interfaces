package modelo;
//funcionario es un concepto abstracto.
public abstract class Funcionario {

    private String name;
    private String document;
    private double salary;
    private int type;

    //constructor
    public Funcionario() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    
    public abstract double getBonification(); 
    

    //getter and setter para type
        public void setType(int type){
            this.type = type;
        }

        public int getType(){
            return type;
        }




}