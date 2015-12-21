package elevator;
import java.util.ArrayList;

public class Elevator {
	int currentEleFloor;
	public Elevator(int no_of_floors) {
		// TODO Auto-generated constructor stub
		ArrayList elevatorPanel = new ArrayList(no_of_floors);
		
		for(int i=0;i<=no_of_floors;i++){
			elevatorPanel.add(i);
			
		}
		//System.out.println(elevatorPanel.size());
		//System.out.println(elevatorPanel);
		int randomIndex = (int)(Math.random() * elevatorPanel.size());
		currentEleFloor=(int) elevatorPanel.get(randomIndex);
	}
	
	public void move(int passangerFloor){
		String elevatrFloor= th(currentEleFloor);
		String pssngrFloor= th(passangerFloor);
		if(currentEleFloor<passangerFloor){	
			
			if(passangerFloor==0){
				System.out.println("Requested through "+ pssngrFloor +" floor panal");
			}else{
				System.out.println("Requested through "+ passangerFloor+ pssngrFloor +" floor panal");
			}
			
			if(currentEleFloor==0){
				System.out.println("Requested through "+ elevatrFloor +" floor panal");
			}else{
				System.out.println("Elevator was on "+ currentEleFloor+ elevatrFloor +" floor");
			}
			
			System.out.println("The Elevator is on Moving UP.");
			
			for(int i=currentEleFloor;i<=passangerFloor;i++){
    			if(i==passangerFloor){
    				System.out.println("The lift Reached.");
    				System.out.println("Doors Opened. Please Enter.");
    				System.out.println("Doors Closed.");
    			}else{
    				System.out.println("Floor "+i);
    			}
			}
			
		}else if(currentEleFloor>passangerFloor){
			if(passangerFloor==0){
				System.out.println("Requested through "+ pssngrFloor +" floor panal");
			}else{
				System.out.println("Requested through "+ passangerFloor+ pssngrFloor +" floor panal");
			}
			
			if(currentEleFloor==0){
				System.out.println("Requested through "+ elevatrFloor +" floor panal");
			}else{
				System.out.println("Elevator was on "+ currentEleFloor+ elevatrFloor +" floor");
			}
			System.out.println("The Elevator is Moving Down.");
			
			for(int i=currentEleFloor;i>=passangerFloor;i--){
    			
    			if(i==passangerFloor){
    				System.out.println("The lift Reached.");
    				System.out.println("Doors Opened. Please Enter.");
    				System.out.println("Doors Closed.");
    			}else{
    				System.out.println("Floor "+i);
    			}
    		}
		}else{
			if(passangerFloor==0){
				System.out.println("Requested through "+ pssngrFloor +" floor panal");
			}else{
				System.out.println("Requested through "+ passangerFloor+ pssngrFloor +" floor panal");
			}
			
			if(currentEleFloor==0){
				System.out.println("Requested through "+ elevatrFloor +" floor panal");
			}else{
				System.out.println("Elevator was on "+ currentEleFloor+ elevatrFloor +" floor");
			}
			
			System.out.println("Doors Opened. Please Enter.");
			System.out.println("Doors Closed.");
		}
		
	}
	
	public String th(int floor){
		String str=null;
		
		if(floor==0){
			str="ground";
		}else if(floor==1){
			str="st";
		}else if(floor==2){
			str="nd";
		}else if(floor==3){
			str="rd";
		}else{
			str="th";
		}
	
		return str;
	}

}
