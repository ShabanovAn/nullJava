package test2;

public  class Person {

    private final Long number = 8004524532L;

    String name;

    public String getName(){ return name; }

    public Person(String name){

        this.name=name;
    }

    public void display(){
        System.out.println("Name: " + name);
    }
}


