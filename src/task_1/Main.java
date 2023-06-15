package task_1;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        print();
        outputSet(createSet());
        outputSet(addNewElement(createSet()));
    }

    public static void print() {
        System.out.println("Current set: ");
    }

    public static HashSet<String> createSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Plum");
        set.add("Peach");
        set.add("Tomato");
        set.add("Lemon");
        return set;
    }

    public static HashSet<String> addNewElement(HashSet<String> set) {
        String str = "Watermelon";
        System.out.println("\nAdded " + str);
        System.out.println("\nNew set: ");
        set.add(str);
        return set;
    }

    public static void outputSet(HashSet<String> set) {
        int count = 1;
        for (String element : set) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
