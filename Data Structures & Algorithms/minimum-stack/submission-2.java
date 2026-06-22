class MinStack {

    private ArrayList<Integer[]> stack;
    private int min;

    public MinStack() {
        this.stack = new ArrayList<>();
        min = Integer.MAX_VALUE;

        
    }
    
    public void push(int val) {
        stack.add(0, new Integer[]{val, min});
        if (val < min) {
            min = val;
        }


        
    }
    
    public void pop() {
        Integer[] temp = stack.remove(0);
        min = temp[1];
        
    }
    
    public int top() {
        return stack.get(0)[0];
    }
    
    public int getMin() {
        return min;
    }
}
