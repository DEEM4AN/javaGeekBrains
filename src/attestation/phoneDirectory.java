package attestation;

import java.sql.Array;
import java.util.*;

public class phoneDirectory {
    static HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
    static String name;
    static int number;

    public static void print(String s) {
        System.out.println(s);
    }

    public static boolean isStringInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void addPerson(HashMap<String, ArrayList<Integer>> hashMap) {
        String s = null;
        name = null;
        Scanner scanner = new Scanner(System.in);
        print("Введите имя контакта");
        name = scanner.nextLine();
        if (hashMap.containsKey(name)) {   // если контакт уже существует, то выполняем весь блок
            System.out.printf("Имя %s уже существует. Хотите добавить к нему ещё один номер? \n", name);
            print("1. Да");
            print("2. Нет");
            if (scanner.nextLine().equals("1")) {
                print("Введите номер контакта ");
                try {
                    number = scanner.nextInt();
                } catch (Exception e) {
                    while (!isStringInt(s)) {
                        s = scanner.nextLine();
                        if (!isStringInt(s)) {
                            print("Некорректный номер. Используйте цифры!");
                        }
                    }
                    number = Integer.parseInt(s);
                }
                ArrayList<Integer> copyList = hashMap.get(name);
                copyList.add(number);
                hashMap.put(name, copyList);
            }

        } else {
            print("Введите номер контакта");
            try {
                number = scanner.nextInt();
            } catch (Exception e) {
                while (!isStringInt(s)) {
                    s = scanner.nextLine();
                    if (!isStringInt(s)) {
                        print("Некорректный номер. Используйте цифры!");
                    }
                }
                number = Integer.parseInt(s);
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(number);
            hashMap.put(name, arrayList);
        }
    }

    public static void find(HashMap<String, ArrayList<Integer>> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя контакта");
        String name = scanner.nextLine();
        if (hashMap.containsKey(name)) {
            HashMap hs = new HashMap();
            hs.put(name, hashMap.get(name));
            printHashMap(hs);
        } else System.out.println("Контакт не найден");
    }




    public static void printHashMap(HashMap<String, ArrayList<Integer>> hashMap) {
        String regex = "\\[|\\]";
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList<>(sortHashMap(hashMap).keySet());

        for (int i = 0; i < arrayList.size(); i++) {
            stringBuilder.append("\n").append("name: ").append(arrayList.get(i));
            stringBuilder.append("\n").append("number: ").append(String.valueOf(hashMap.get(arrayList.get(i))).replaceAll(regex, " "));
            stringBuilder.append("\n__________________________________\n");
        }
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(hashMap);

        System.out.println(stringBuilder);
    }

    public static TreeMap<String, ArrayList<Integer>> sortHashMap(HashMap<String, ArrayList<Integer>> hashMap) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (hashMap.get(o2).size() - hashMap.get(o1).size() == 0) {
                    return 1;
                }
                return hashMap.get(o2).size() - hashMap.get(o1).size();
            }
        };
        TreeMap<String, ArrayList<Integer>> treeMap = new TreeMap<>(comparator);
        treeMap.putAll(hashMap);
        return treeMap;
    }

    public static void removePerson (HashMap<String, ArrayList<Integer>> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя контакта для удаления");
        String s = scanner.nextLine();
        if (hashMap.containsKey(s)) {
            hashMap.remove(s);
        } else {
            System.out.println("Контакт не найден");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Что хотите сделать?");
            System.out.println("1: Добавить контакт");
            System.out.println("2: Отобразить все контакты на экран");
            System.out.println("3: Найти контакт");
            System.out.println("4: Удалить контакт");
            String input = sc.nextLine();

            if (input.equals("q")) break;
            switch (input) {
                case ("1"):
                    addPerson(hashMap);
                    break;
                case ("2"):
                    printHashMap(hashMap);
                    break;
                case ("3"):
                    find(hashMap);
                    break;
                case ("4"):
                    removePerson(hashMap);
                    break;
            }
        }
    }
}