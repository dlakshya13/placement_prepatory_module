class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    
   
    public void push(int x) {
        Stack<Integer> tempStack = new Stack<Integer>();
        if(stack1.empty()) stack1.push(x);
        else{
           
            while(!stack1.empty()){
                tempStack.push(stack1.pop());
            }
            stack1.push(x);
            while(!tempStack.empty()){
                stack1.push(tempStack.pop());
            }
        }
    }

   
    public int pop() {
        return stack1.pop();
    }

    
    public int peek() {
        return stack1.peek();
    }

    
    public boolean empty() {
        return stack1.empty();
    }
}
