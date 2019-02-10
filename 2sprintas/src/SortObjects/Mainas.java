package SortObjects;

import java.util.Arrays;

public class Mainas {
    public static void main(String[] args) {
        Person p1 = new Person("Test1",10);
        Person p2 = new Person("Test2",12);
        Person p3 = new Person("Test3",4);
        Person p4 = new Person("Test4",7);

        Person[] ArrayOfPersons = {p1,p2,p3,p4};
        Arrays.sort(ArrayOfPersons);

        for (Person p: ArrayOfPersons) {
            System.out.println(p.getName()+"--"+p.getAge());
        }
    }

}
