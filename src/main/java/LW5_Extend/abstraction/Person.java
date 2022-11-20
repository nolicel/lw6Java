package LW5_Extend.abstraction;

public class Person {

    protected String surname;
    protected String name;
    protected int age;

    public Person(String surname, String name, int age){
        this.surname = surname;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String printInfo(){
        return "Person "+surname+" "+name+", Age: "+age;
    }
}
