package sem06;

public class Cat {
    String name; // поле класса
    int age;
    int weight;

    public void voice(){
        System.out.println("Мяу " + name);
    }

    public String print(String s) {
        System.out.println(s);
        return s;
    }
}
