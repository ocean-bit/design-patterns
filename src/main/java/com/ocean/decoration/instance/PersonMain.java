package com.ocean.decoration.instance;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Shoes(new TShirt(new Person("m")));
        Person person2 = new TShirt(new Shoes(new Person("f")));
        person1.show();
        person2.show();
    }
}
