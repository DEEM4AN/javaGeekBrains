package attestation;

import java.util.*;

public class Main {
    static void fillSprav(HashMap<String, ArrayList> telSptav) {
        ArrayList<String> tel = new ArrayList<>();
        ArrayList<String> tel1 = new ArrayList<>();
        ArrayList<String> tel2 = new ArrayList<>();
        tel.add("8-233-32-32-323");
        telSptav.put("Вася", tel);
        tel1.add("6-666-66-66-666");
        tel1.add("6-666");
        telSptav.putIfAbsent("Boss", tel1);
        tel2.add("8-800-555-35-35");
        telSptav.putIfAbsent("Займ денег", tel2);

    }

    static void addPerson(HashMap<String, ArrayList> telSptav) {
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Введите телефон");
        String tel = scan.nextLine();
        ArrayList<String> temp = new ArrayList<>();
        temp.add(tel);
        if (telSptav.containsKey(name)) {
            temp.add(String.valueOf((telSptav.get(name))));
        }
        telSptav.put(name, temp);

    }

    static void addNumber(HashMap<String, ArrayList> telSptav) {
        System.out.println("Введите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Введите телефон");
        String tel = scan.nextLine();
//         LinkedList<String> temp = new LinkedList<>();
        try {
            System.out.println(telSptav.get(name));
            telSptav.get(name).add(tel);
            System.out.println(telSptav.get(name));
        } catch (Exception e) {
            System.out.println("Ошибка, проверьте правильность имени");
        }

    }

    static void prinSprav(HashMap<String, ArrayList> telSptav) {

        TreeMap<String, ArrayList> treeSprav = new TreeMap<>();
        for (String item : telSptav.keySet()) {
            treeSprav.put(item, telSptav.get(item));

        }
        System.out.println(treeSprav);
    }


    public static void main(String[] args) {
        HashMap<String, ArrayList> telSprav = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Что хотите сделать?");
            System.out.println("1: Внести тестовые значения");
            System.out.println("2: Внести свои значения");
            System.out.println("3: Добавитт телефон");
            System.out.println("0: Вывести на экран");
            String input = scan.nextLine();
            if (input.equals("q")) break;
            switch (input) {
                case ("1"):
                    fillSprav(telSprav);
                    break;
                case ("0"):
                    prinSprav(telSprav);
                    break;
                case ("2"):
                    addPerson(telSprav);
                    break;
                case ("3"):
                    addNumber(telSprav);
                    break;
            }
        }
    }
}