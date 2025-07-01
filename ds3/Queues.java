/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds3;

import java.util.Iterator;

public interface Queues{
  
    public boolean isEmptyQueue();
    public int sizeQueue();
    public void enqueue(Object element);
    public Object dequeue();
    public Iterator iteratorQueue();
    public void clearQueue();
    public Object getFirst();
 
}
