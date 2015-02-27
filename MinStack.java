class MinStack {

	Stack<Integer> s = new Stack<>();
	Stack<Integer> sMin = new Stack<>();

    public void push(int x) {
        s.push(x);
        if(sMin.empty()) sMin.push(x);
        else {
            int com = sMin.peek().intValue();
            if(com >= x) sMin.push(x);
        }
    }

    public void pop() {
		int com = s.peek().intValue();
		int comp = sMin.peek().intValue();
		if(com == comp) sMin.pop();
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return sMin.peek();
    }

}