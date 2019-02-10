package SortObjects;

public class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age){
        this.name=name; this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person other) {
        if(this.getAge() > other.getAge())
            return 1;
        else if (this.getAge() == other.getAge())
            return 0 ;
        return -1 ;
    }
}
