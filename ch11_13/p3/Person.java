package homework.ch11_13.p3;

import java.util.Objects;

public class Person extends Object implements Cloneable{
    private int age;
    private String name;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "age=" + age + ", name='" + name + '\'' ;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person)
            return  (age== ((Person) obj).age && Objects.equals(this.name,((Person)obj).name));
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person newObj = (Person)super.clone();
        newObj.age = this.age;
        newObj.name = new String(name);
        return newObj;
    }

}
