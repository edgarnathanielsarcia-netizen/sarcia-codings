package Stacks;

public class stack {
    private int maxSize;
    private long [] stackArray;
    private int top;

    public stack(int size){
        this.maxSize = size;
        this.stackArray = new long [maxSize];
        this.top = -1;

    }
    // push and pop operations
    public void push(long j){ // adds a value to the stack by incrementing the top
        top++;
        stackArray[top] = j;
    }

    public long pop(){ // removes top and returns the removed top
        int old_top = top;
        top--;
        return stackArray[old_top];
    }

    public long peek(){ // points at the current top
        return stackArray[top];
    }

    public boolean isEmpty(){ // checks if the stack is empty 
        return top == -1;
    }
}
