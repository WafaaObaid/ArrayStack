/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds3;

import java.util.Iterator;

  public class QueueStack implements Stack, Queues {
 
      Object arrStack[];
      int top=-1;
      
      public QueueStack(int size){
          arrStack= new Object[size];
          arrQueue = new Object[size];
      }
      
      
    public boolean isEmptyStack() {
        return top<0;
    }

     @Override
    public int sizeStack() {
        return top+1;
    }
    
    @Override
    public Object getTop() {
        if(isEmptyStack()){
            return null;
        }
        return arrStack[top];
    }

    @Override
    public void push(Object element) {
        if(top==arrStack.length)
           throw new RuntimeException("No more space for push element");
        arrStack[++top]=element;
    }

    @Override
    public Object pop() {
        if(isEmptyStack()){
            return null;
        }
        Object element = arrStack[top];
        arrStack[top--]=null;
        return element;
    }

    @Override
    public void clearStack() {
        while(!isEmptyStack()){
            arrStack[top--]=null;
        }
    }
    
     @Override
    public Iterator iteratorStack() {
       return new Iterator(){
           int position=top;
           @Override
           public boolean hasNext() {
               return position>=0;
           }

           @Override
           public Object next() {
               return arrStack[position--];
           }
           
       };
    
    }



    Object arrQueue[];
    int front=0;
    int size=0;
    
    @Override
    public void enqueue(Object element) {
        if(size==arrQueue.length)
             throw new RuntimeException("No more space in Queue");
        int rear=(front+size)%arrQueue.length;
        arrQueue[rear]=element;
        size++;
    }

    public boolean isEmptyQueue(){
        return size==0;
    }
      @Override
    public int sizeQueue() {
        return size;
    }

    
    @Override
    public Object dequeue() {
        if(isEmptyQueue())
          return null;
        Object element = arrQueue[front];
        arrQueue[front]=null;
        front=(front+1)%arrQueue.length;
        size--;
        return element;
    }

    @Override
    public Object getFirst() {
        if(isEmptyQueue())
          return null;
        return arrQueue[front];
    }
    
    public int reversesQueue(){
        //queue to stack
        int queueSize = size;
        for(int i=0; i<queueSize; i++){
             
            Object element=dequeue();
            push(element);
        }
        //stack to queue
        while(!isEmptyStack()){
            Object element = pop();
            enqueue(element);
        }
        //print revers queue
        for(int i=0; i<size; i++){
            int q =(front+i)%arrQueue.length;
            System.out.println(arrQueue[q]);
            
        }
          
        return size;
    }

    @Override
    public Iterator iteratorQueue() {
        return new Iterator(){
            int position=front;
            int count=0;
            @Override
            public boolean hasNext() {
                return arrQueue[position] != null && count<size;
            }

            @Override
            public Object next() {
                Object element=arrQueue[position];
                position=(position+1)%arrQueue.length;
                count++;
                return element;
            }
            
        };
         
    }

    @Override
    public void clearQueue() {
         while(!isEmptyQueue())
            this.dequeue();
    }

   
  

  
    
        
    
      
}
