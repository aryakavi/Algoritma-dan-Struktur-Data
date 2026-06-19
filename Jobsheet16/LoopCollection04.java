package Jobsheet16;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection04 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        
        // Elemen terakhir di indeks (list - 1) diganti dengan Strawberry
        if (!fruits.isEmpty()) {
            fruits.set(fruits.size() - 1, "Strawberry");
        }
        
        System.out.println("\nSetelah elemen terakhir diganti Strawberry:");
        System.out.println(fruits);
        
        fruits.push("Mango");
        fruits.push("guava");
        fruits.push("avocado");
        
        // Melakukan sorting sesiao alphabet
        Collections.sort(fruits);
        System.out.println("\nSetelah penambahan 3 buah dan dilakukan Sorting:");
        System.out.println(fruits);
    }
}