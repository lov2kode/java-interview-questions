package com.lov2kode.jiq;

import java.util.HashSet;

public class Solution2
{
  static class Node
  {
    int data;
    Node next;

    Node(int x)
    {
      data = x;
      next = null;
    }
  }

  static class GFG
  {
    static Node head;

    // Function to print the linked list
    void printList(Node node)
    {
      while (node != null)
      {
        System.out.print(node.data + " ");
        node = node.next;
      }
    }

    // Method to detect and remove loop from linked list
    static void removeLoop(Node head)
    {
      HashSet<Node> s = new HashSet<>();
      Node prev = null;
      while (head != null)
      {
        // If we have already seen this node in hash set, it means there is a cycle.
        // Set the next of the previous pointer to null to remove the cycle.
        if (s.contains(head))
        {
          prev.next = null;
          return;
        }
        // If we are seeing the node for the first time, insert it in hash set.
        else
        {
          s.add(head);
          prev = head;
          head = head.next;
        }
      }
    }
  }

  public static void main(String[] args)
  {
    GFG llist = new GFG();

    llist.head = new Node(50);
    llist.head.next = new Node(20);
    llist.head.next.next = new Node(15);
    llist.head.next.next.next = new Node(4);
    llist.head.next.next.next.next = new Node(10);

    // Create loop for testing
    llist.head.next.next.next.next.next = llist.head.next.next;

    llist.removeLoop(llist.head);
    System.out.println("Linked List after removing loop");
    llist.printList(llist.head);
  }
}
