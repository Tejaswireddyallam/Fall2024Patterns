/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarysearchtree;

import java.util.Queue;
import java.util.LinkedList;
/**
 *
 * @author davidmonismith
 */
public class BST<E extends Comparable<E>> 
{
    private BSTNode<E> root;

    public BST()
    {
        this.root = null;
    }
    
    public BST(LinkedList<E> list)
    {
        this.root = null;
        for(E element : list)
            this.insert(element);
    }
    
    public BST(E rootData)
    {
        this.root = new BSTNode<>(rootData);
    }
    
    public BST(BSTNode<E> root) 
    {
        this.root = root;
    }
    
    public void insert(E data)
    {
        BSTNode<E> newNode = new BSTNode<>(data);
        BSTNode<E> currentNode = root;
        
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            while(currentNode != null)
            {
                if(newNode.compareTo(currentNode) > 0)
                {
                    if(currentNode.left == null)
                    {
                        currentNode.setLeft(newNode);
                        newNode.setParent(currentNode);
                    }
                    currentNode = currentNode.getLeft();                
                }
                else if(newNode.compareTo(currentNode) < 0)
                {
                    if(currentNode.right == null)
                    {
                        currentNode.setRight(newNode);
                        newNode.setParent(currentNode);
                    }
                    currentNode = currentNode.getRight();
                }
                else
                {
                    break;
                }
            }
        }
    }
    
    private BSTNode<E> getSuccessor(BSTNode<E> current)
    {
        while(current.getLeft() != null)
            current = current.getLeft();
        return current;
    }
    
    public void remove(E data)
    {
        BSTNode<E> current = findNode(data);
        
        removeNode(current);
    }
    
    private void removeNode(BSTNode<E> current)
    {
        if(current != null)
        {
            if(current.getLeft() != null && current.getRight() != null)
            {
                BSTNode<E> successor = getSuccessor(current.getRight());
                current.setData(successor.getData());
                
                //Remove successor node from the tree
                removeNode(successor);
            }
            else if(current.getLeft() != null)
            {
                replaceInParent(current, current.getLeft());
            }
            else if(current.getRight() != null)
            {
                replaceInParent(current, current.getRight());
            }
            else
            {
                replaceInParent(current, null);
            }
        }
    }
    
    public void replaceInParent(BSTNode<E> current, BSTNode<E> child)
    {
        if(current != null && current.getParent() != null)
        {
            if(current == current.getParent().getLeft())
                current.getParent().setLeft(child);
            else
                current.getParent().setRight(child);
        }
        if(child != null)
        {
            if(child.getParent() != null)
            {
                child.setParent(current.getParent());
                if(current.getParent() == null)
                    root = child;
            }
            else
                child.setParent(null);
        }else if(current.getParent() == null)
            root = null;
    }
    
    public BSTNode<E> findNode(E data)
    {
        return findData(root, data);
    }
    
    public boolean find(E data)
    {
        if(root == null)
            return false;
        else
            return findTraversal(root, data);
    }
    
    private boolean findTraversal(BSTNode<E> current, E data)
    {
        if(current == null)
            return false;
        else if(current.getData().compareTo(data) > 0)
            return findTraversal(current.getLeft(), data);
        else if(current.getData().compareTo(data) < 0)
            return findTraversal(current.getRight(), data);
        else
            return true;
    }
    
    private BSTNode<E> findData(BSTNode<E> current, E data)
    {
        if(current == null)
            return null;
        else if(current.getData().compareTo(data) > 0)
            return findData(current.getLeft(), data);
        else if(current.getData().compareTo(data) < 0)
            return findData(current.getRight(), data);
        else
            return current;
    }
    
    @Override
    public String toString()
    {
        //Traverse tree
        String retStr = toStringTraversal(root);
        
        
        return retStr;
    }
    
    public String toStringPostOrder()
    {
        return postOrderToStringTraversal(root);
    }
    
    public String toStringPreOrder()
    {
        return preOrderToStringTraversal(root);
    }
    
    public String toStringBFS()
    {
        return bfsToStringTraversal(root);
    }
    
    private String toStringTraversal(BSTNode<E> node)
    {
        if(node == null)
            return "";
        else
        {
            String retString = "";
            retString = toStringTraversal(node.left);
            retString = retString + node;
            retString = retString + toStringTraversal(node.right);
            return retString;
        }
    }
    
    private String bfsToStringTraversal(BSTNode<E> node)
    {
        Queue<BSTNode<E>> queue = new LinkedList<BSTNode<E>>();
        if(node == null)
            return "";
        else
        {
            String retString = "";
            queue.clear();
            queue.add(node);
            while(!queue.isEmpty())
            {
                BSTNode<E> tempNode = queue.remove();
                if(tempNode != null)
                {
                    retString = retString + tempNode + '\n';
                    if(tempNode.getLeft() != null)
                        queue.add(tempNode.getLeft());
                    if(tempNode.getRight() != null)
                        queue.add(tempNode.getRight());
                }
            }

            return retString;
        }
    }
    
    private String postOrderToStringTraversal(BSTNode<E> node)
    {
        if(node == null)
            return "";
        else
        {
            String retString = "";
            retString = retString + postOrderToStringTraversal(node.left);
            retString = retString + postOrderToStringTraversal(node.right);
            retString = retString + node;
            return retString;
        }
    }
    
    private String preOrderToStringTraversal(BSTNode<E> node)
    {
        if(node == null)
            return "";
        else
        {
            String retString = "";
            retString = retString + node;
            retString = retString + preOrderToStringTraversal(node.left);
            retString = retString + preOrderToStringTraversal(node.right);
            
            return retString;
        }
    }
}
