package elevator;

import java.util.ArrayList;

public class FloorPanel {
	public ArrayList fPanal(){
		ArrayList floorPanel = new ArrayList(5);
		for(int i=0;i<=5;i++){
			floorPanel.add(i);
		}
		return floorPanel;
		
	}
	public int btnPress(ArrayList floorPanel){

		int randomIndex = (int)(Math.random() * floorPanel.size());
		int currentFloor=(int) floorPanel.get(randomIndex);
		
		return currentFloor;
	}
}