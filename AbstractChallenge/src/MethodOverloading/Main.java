package MethodOverloading;

public class Main {

    public static void main(String[] args) {
        SearchTree Tree = new SearchTree(null);
        Tree.traverse(Tree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split("   ");
        for(String s : data){
            Tree.addItem(new Node(s));

        }
        Tree.traverse(Tree.getRoot());
    }
}
