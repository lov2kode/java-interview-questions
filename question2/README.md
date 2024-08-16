# Detect and Remove Loop in Linked List
Given a linked list, the task is to check if there is a loop present in it and remove it.

## Example:

Consider the below linked list where the node 5 links to node 3 forming a loop in the linked list. The task is to remove the loop in the linked list by updating the next pointer of node 5 point to NULL.
![image.jpg](static%2Fimage.jpg)

# Solution Description 
### O(N) Time and O(N) Space

Traverse through the Linked List and while traversing insert each node into the hash set. Also, maintain a prev pointer which points to the previous node of the current node. If there is a loop present in the Linked List, there will be a node which will be already present in the hash set.

If there is a node which is already present in the hash set, then update the next pointer of prev to NULL to remove the loop from the linked list.
Else, If there is no node which is already present in the hash set, then there is no loop in the linked list.
