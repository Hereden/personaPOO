
public class Principal {

	public static void main(String[] args) {
		//System.out.println("Hola mundo!");
		Persona carlos= new Persona();
		carlos.name="Carlos Eduardo";
		carlos.edad=30;
		System.out.println(carlos.saludar());
		System.out.println(carlos.miEdad());
		Persona rogelio= new Persona();
		rogelio.name="Rogelio";
		rogelio.edad=23;
		System.out.println(rogelio.saludar());
		System.out.println(rogelio.miEdad());
		

	}

}
