/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds3;

import java.util.Iterator;

public class DS3 {

    
    public static void main(String[] args) {
        
       QueueStack a = new QueueStack(6);
        a.enqueue(3);
        a.enqueue(6);
        a.enqueue(10);
        a.enqueue(7);
        a.enqueue(8);
        a.enqueue(2);
        
//        System.out.println("First element: "+a.getFirst());
//        System.out.println("is it empty? "+a.isEmptyQueue());
//        System.out.println("dequeue element "+a.dequeue());
//        System.out.println("First element: "+a.getFirst());
//        a.clearQueue();
//        System.out.println("is it empty? "+a.isEmptyQueue());
        
        
        System.out.println("Queue: ");
          Iterator<Integer>it=a.iteratorQueue();
         while(it.hasNext()){
             System.out.println(it.next());
         }
          
       System.out.println("Revers Queue: ");
       a.reversesQueue(); 
     
       
       
    }
    
}
