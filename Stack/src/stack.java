
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
	
	public int push(int i){
		if(isFull()){
			System.out.println("Array Full");
			System.out.print("Top item in array is: ");
		}else{
			top++;
			array[top]=i;
			System.out.print("Item pushed to the stack is: ");
		}
		return array[top];	
	}
}