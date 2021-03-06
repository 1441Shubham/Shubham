
public class stack {
	
	int top=-1,maxSize;
	int[] array;
	
	public stack(int i) {
		// TODO Auto-generated constructor stub
		array= new int[i];
		maxSize=i;
	}

	public boolean isFull(){
		if(top==maxSize-1){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isEmpty(){
		if(top==-1){
			return true;
		}else{
			return false;
		}
	}
	
	public String display(){
		int i,elem;
		String arry = "";
		System.out.println();
		System.out.println("Elements in the stack are: ");
		for(i=0;i<=top;i++){
			elem=array[i];
			arry=Integer.toString(elem);
			System.out.println(arry+" ");
		}
		return arry;
	}
	
	public void push(int i){
		if(isFull()){
			System.out.println();
			System.out.println("Push operation failed. Stack is Full.");
			System.out.println("Item "+ i +" was not pushed in the stack.");
			display();
	
		}else{
			top++;
			array[top]=i;
			System.out.print("Item pushed to the stack is: "+ array[top]);
			display();
		}
	}
	
	public void pop(){
		
		if(isEmpty()){
			System.out.println();
			System.out.println("Pop operation failed. Stack is Empty.");
			
		}else{
			int popedElement=array[top];
			top--;
			System.out.println();
			System.out.println("Poped Element is: "+ popedElement);
			if(top!=-1){
				display();
			}else{
				System.out.println("Stack became Empty.");
			}
		}
		
	}
}
