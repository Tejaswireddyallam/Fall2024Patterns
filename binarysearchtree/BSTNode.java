/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchtree;

/**
 *
 * @author davidmonismith
 * @param <E>
 */
public class BSTNode<E extends Comparable<E>> implements Comparable<BSTNode<E>>
{
    E data;
    BSTNode<E> left;
    BSTNode<E> right;
    BSTNode<E> parent;
    
    public BSTNode()
    {
        this.data = null;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
    
    public BSTNode(E data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BSTNode<E> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<E> left) {
        this.left = left;
    }

    public BSTNode<E> getRight() {
        return right;
    }

    public void setRight(BSTNode<E> right) {
        this.right = right;
    }
    
    public BSTNode<E> getParent()
    {
        return parent;
    }
    
    public void setParent(BSTNode<E> parent)
    {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "  BSTNode{" + "data=" + data + '}' + '\n';
    }
    
    @Override
    public int compareTo(BSTNode<E> node)
    {
        return node.getData().compareTo(this.getData());
    }
}
