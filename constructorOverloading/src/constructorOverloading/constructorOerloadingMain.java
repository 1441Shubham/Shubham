package constructorOverloading;

public class constructorOerloadingMain {

	public static void main(String[] args) {
		
		constructorOerloading coverLoadWithOutPara = new constructorOerloading();
		System.out.println("Output from Construtor Without Parameter: Name: "+coverLoadWithOutPara.name+" Role: "+coverLoadWithOutPara.role);

		constructorOerloading coverLoadWithPara = new constructorOerloading("Me","Driver");
		System.out.println("Output from Parameterized Construtor: Name: "+coverLoadWithPara.name+" Role: "+coverLoadWithPara.role);

	}
}
