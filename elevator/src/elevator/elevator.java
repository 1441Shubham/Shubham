package elevator;

public class elevator {

    static int floor = 3, lift=5,choice=1;

    public static void main(String args[])
    {
    	
    	if(floor<lift){
    		System.out.println("The lift is on its way please wait...");
    		for(int i=lift;i>=floor;i--){
    			
    			if(i==floor){
    				System.out.println("The lift has arrived.");
    			}else{
    				System.out.println("Floor "+i);
    			}
    		}	
    	}else{
    		System.out.println("You already are on +floor");
    	}
    	
    	System.out.println("please get in");
    	if(floor<choice){
    		System.out.println("Moving Up...");
    		for(int i=floor;i<=choice;i++){
    			
    			if(i==choice){
    				System.out.println("The lift Reached its destination.");
    			}else{
    				System.out.println("Floor "+i);
    			}
    		}	
    	}else if(floor>choice){
    		System.out.println("Moving Down...");
    		for(int i=floor;i>=choice;i--){
    			
    			if(i==choice){
    				System.out.println("The lift Reached its destination.");
    			}else{
    				System.out.println("Floor "+i);
    			}
    		}	
    	}else{
    		System.out.println("You are on the same floor.");
    	}
    }
}


