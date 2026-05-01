package Trees;

import java.util.Scanner;

public class BTImplementation {

    public Node root;

    public class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public void populate(Scanner scanner){
        System.out.println("Enter root value:");
        int value =  scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want node on the left");
        boolean left = Boolean.parseBoolean(scanner.next());
        if(left){
            System.out.println("Enter left value");
            int value = scanner.nextInt();
            root.left = new Node(value);
            populate(scanner, root.left);
        }
        else{
            System.out.println("Enter right value:");
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(scanner, root.right);
        }

    }
}
