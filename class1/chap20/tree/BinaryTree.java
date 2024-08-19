package com.whoo.chap20.tree;

public class BinaryTree <T extends Comparable<T>>{
    private Node<T> root;

    private static class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;

        Node(T date){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(T data){
        root = insertRec(root, data);
    }

    private Node<T> insertRec(Node<T> root, T data){
        if(root == null){
            root = new Node<>(data);
            return root;
        }
        if(data.compareTo(root.data) < 0){
            root.left = insertRec(root.left, data);
        } else{
            root.right = insertRec(root.right,data);
        }
        return root;
    }

    public boolean search(T data){
        return searchRec(root, data);
    }

    private boolean searchRec(Node<T> root, T data){
        if(root == null) return false;
        if(root.data.equals(data)) return true;
        if(data.compareTo(root.data) < 0){
            return searchRec(root.left, data);
        }else{
            return searchRec(root.right,data);
        }
    }


}
