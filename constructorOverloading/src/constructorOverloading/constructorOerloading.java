package constructorOverloading;

public class constructorOerloading {
	String name ,role;
	
	public constructorOerloading() {
		this.name ="Tana";
		this.role = "Navigator";
	}
	
	public constructorOerloading(String parameterName, String parameterRole) {
		this.name = parameterName;
		this.role = parameterRole;
	}
}
