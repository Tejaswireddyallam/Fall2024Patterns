/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author davidmonismith
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST<String> bst = new BST<String>();
        

        bst.insert("e");
        bst.insert("b");
        bst.insert("c");
        bst.insert("a");
        bst.insert("g");
        bst.insert("d");
        bst.insert("h");
        
        System.out.println(bst);
        
        BST<Integer> bst2 = new BST<>();
        
        //for(int i = 1; i <= 20; i++)
        //    bst2.insert(i);

        bst2.insert(10);
        bst2.insert(5);
        bst2.insert(15);
        bst2.insert(3);
        bst2.insert(7);
        bst2.insert(13);
        bst2.insert(17);
        bst2.insert(1);
        bst2.insert(4);
        bst2.insert(6);
        bst2.insert(8);
        bst2.insert(11);
        bst2.insert(14);
        bst2.insert(16);
        bst2.insert(19);
        bst2.insert(2);
        bst2.insert(9);
        bst2.insert(12);
        bst2.insert(18);
        bst2.insert(20);
        System.out.println(bst2);
        System.out.println(bst2.toStringPreOrder());
        System.out.println(bst2.toStringPostOrder());
        System.out.println(bst2.toStringBFS());
        
        bst2.remove(20);
        bst2.remove(18);
        bst2.remove(12);
        bst2.remove(9);
        
        System.out.println(bst2);
        bst2.remove(19);
        bst2.remove(1);
        bst2.remove(10);
        bst2.remove(11);
        bst2.remove(12);
        bst2.remove(13);
        bst2.remove(14);
        bst2.remove(15);
        bst2.remove(16);
        bst2.remove(17);
        bst2.remove(18);
        bst2.remove(19);
        bst2.remove(20);
        bst2.remove(2);
        bst2.remove(3);
        bst2.remove(4);
        bst2.remove(5);
        bst2.remove(6);
        bst2.remove(7);
        bst2.remove(8);
        bst2.remove(19);
        System.out.println(bst2);
        
    }
}
