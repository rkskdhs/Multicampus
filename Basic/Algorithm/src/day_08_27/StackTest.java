package day_08_27;

public class StackTest{
	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			System.out.println(stack.pop());
		}
	}
}

class MyStack<e>{
	e[] stack;
	int idx = 0;

	public MyStack() {

		stack = (e[]) new Object[10];
	}

	public MyStack(int size) {

		stack = (e[]) new Object[size>0?size:10];
	}
	public boolean isFull() {

		return idx == 1 ? true: false;
	}

	public boolean isEmpty() {
		return idx == stack.length ? true: false;
	}


	public e pop() {
		if(isEmpty()) {
			return null;
		}else {
			return stack[idx--];	
		}
	}
	public int top() {
		if(isEmpty()) {
			return -1;
		}else {
		
			return isEmpty()?null: ;
		}
	}



	public void push(e data) {
		if(isFull()) {
			System.out.println("resize");
			e[] temp = (e[]) new Object[stack.length*2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
			stack = temp;
		}else {
			stack[idx++] = data;
		}
	}



}