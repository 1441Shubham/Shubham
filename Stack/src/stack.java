
public class stack {
	
	private int top=-1,maxSize=2;
	private int[] array = new int[maxSize];
	
	public boolean isFull(){
		if(top==maxSize-1){
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
		for(i=0;i<maxSize;i++){
			elem=array[i];
			arry=Integer.toString(elem);
			System.out.println(arry+" ");
		}
		return arry;
	}
	
	public int push(int i){
		if(isFull()){
			System.out.println();
			System.out.println("Push operation failed. Stack is Full");
			System.out.println("Item "+ i +" was not pushed in the stack.");
			System.out.print("Top item in Stack is: ");
		}else{
			top++;
			array[top]=i;
			System.out.print("Item pushed to the stack is: ");
		}
		return array[top];	
	}
}
