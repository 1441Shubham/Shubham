package elevator;
import java.util.ArrayList;

public class elevatorPassanger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevator ele= new Elevator(5);
		FloorPanel fp=new FloorPanel();
		
		ArrayList floorPanel= fp.fPanal();
		
		int passangerFloor = fp.btnPress(floorPanel);
		
		ele.move(passangerFloor);
	}

}
