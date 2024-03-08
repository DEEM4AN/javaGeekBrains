package task2;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    String name;


    int age;


    int weight;

    List<String> vac = new ArrayList<>();
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void vaccination (String vac){
        this.vac.add(vac);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(10);
        cat.setName("Murzik");
        cat.setWeight(10);
        cat.vaccination("прививка от блох");
        System.out.println(cat);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", vac=" + vac +
                '}';
    }
}
