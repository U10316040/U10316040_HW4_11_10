import java.util.ArrayList;

public class MyStack<Object> extends ArrayList<Object> {

	//Get the top of object, not remove 
	public Object peek(){
		return super.get(super.size() - 1);
	}
	//Take the top object of stack
	public Object pop(){
		Object o = get(super.size() - 1);
		super.remove(super.size() - 1);
		return o;
	}
	
	//Push an object to the top of stack.
	public void push(Object o){
		super.add(o);
	}
	
	public ArrayList<Object> reverse(ArrayList<Object> List){
		int initialSize = super.size();
		for(int i = 0; i < initialSize; i++){
			List.add(i, pop());
		}
		return List;
	}
	
}
