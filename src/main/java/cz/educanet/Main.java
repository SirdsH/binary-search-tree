package cz.educanet;

public class Main {
    public static void main(String[] args) {
        Bst<Integer> bst = new Bst<>(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println(bst.contains(5)); // true
        System.out.println(bst.contains(6)); // true
        System.out.println(bst.contains(20));
    }
}