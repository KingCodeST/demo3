package za.ac.cputassignment;

public class Person implements Prototype {


    String name;

    public Person(String name){
        this.name =name;
    }




    public String toString(){
        return "This person is named " + name;
    }

    @Override
    public Prototype doClone() {
        return new Person(name);
    }
}
