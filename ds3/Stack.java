/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds3;

import java.util.Iterator;

public interface Stack {
    
    public boolean isEmptyStack();
    public Object getTop();
    public void push(Object element);
    public Object pop();
    public void clearStack();
    public int sizeStack();
    public Iterator iteratorStack();
    
    
}
