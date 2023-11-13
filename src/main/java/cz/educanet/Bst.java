package cz.educanet;

import cz.educanet.bst.BinarySearchTree;

public class Bst<T extends Comparable<T>> implements BinarySearchTree<T> {

    private T root;
    private Bst<T> left;
    private Bst<T> right;

    public Bst(T root) {
        this.root = root;
    }

    @Override
    public void insert(T item) {
        if (item == null) {
            root = item;
        }
        if (item.compareTo(root) < 0) {
            if (left == null) {
                left = new Bst<>(item);
            } else {
                left.insert(item);
            }
        } else {
            if (right == null) {
                right = new Bst<>(item);
            } else {
                right.insert(item);
            }
        }
    }

    @Override
    public int depth() {
        if (left != null && right != null) {
            return 1 + Math.max(left.depth(), right.depth()); // return 1 - musí přidat 1, aby se počítal i root
        } else if (left != null) {
            return 1 + left.depth();
        } else if (right != null) {
            return 1 + right.depth();
        }
        return 1;
    }

    @Override
    public boolean contains(T item) {
        if (item == null) {
            return false;
        }
        if (item.compareTo(root) == 0) {
            return true;
        }
        if (item.compareTo(root) < 0) {
            if (left == null) {
                return false;
            } else {
                return left.contains(item);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(item);
            }
        }
    }
}
