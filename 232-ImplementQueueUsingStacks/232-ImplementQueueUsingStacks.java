// Last updated: 7/9/2026, 9:50:46 AM
class MyQueue {
Queue<Integer> qu;

    public MyQueue() {
      qu=new LinkedList<>();  
    }
    
    public void push(int x) {
     qu.add(x);
    
    }
    
    public int pop() {
     
      return  qu.poll();
    
    }
    
    public int peek() {
     return qu.peek();   
    }
    
    public boolean empty() {
     return qu.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */