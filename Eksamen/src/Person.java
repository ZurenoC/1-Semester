public class Person {

    private String name;

    Person (String name){
       this.name = name;
    }

public void present(){
        System.out.println("Ladies and Gentlemen, let me present: " + name);
}


@Override
    public String toString(){
        return name;
}



}




