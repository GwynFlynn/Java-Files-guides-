import java.util.Stack;

public class StacksRFun {

	public static void main(String[] args) {
		
		// Y
		// B
		// R
		
		Stack<Character> tower = new Stack<Character>();
		
		tower.add('R');
		tower.add('B');
		tower.add('Y');
		
		System.out.println(tower.size());
		// /\
		// || the number of components in this vector 
		
		System.out.println(tower.peek());
		//Looks at the object at the top of this stack without removing it from the stack.
		//the object at the top of this stack (the last item of the Vector object).
		
		System.out.println(tower.pop());
		//Removes the object at the top of this stack and returns that object as the value of this function.
		//The object at the top of this stack (the last item of the Vector object).
		
		System.out.println(tower.get(1));
		//Returns the element at the specified position in this Vector.
		//object at the specified index
		
		System.out.println(tower.set(1, 'A'));
		//Replaces the element at the specified position in this Vector with the specified element.
		
		
		
	}

}
