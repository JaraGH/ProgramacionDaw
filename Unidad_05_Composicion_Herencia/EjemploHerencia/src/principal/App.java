package principal;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo [] array  = {
			new Furgoneta("1234BBC", "Mercedes", "Vito", 100, 6, 2000),
			new Deportivo("3232BMC", "Mercedes", "S", 120, 3),
			new Furgoneta("1224BBC", "Mercedes", "Vito", 100, 6, 2000)
//			new Vehiculo("3333KLC", "XXX", "YYY", 100)
		};
		
		for (Vehiculo vehiculo : array) {
			
			if (vehiculo instanceof Deportivo) {
				Deportivo depor = (Deportivo) vehiculo;
				
			}
//			System.out.println(vehiculo.toString());
			
//			if (vehiculo instanceof Vehiculo)
//				System.out.println("Si");
//			
//			if (vehiculo instanceof Furgoneta)
//				System.out.println("Furgoneta");
//			else if (vehiculo instanceof Deportivo) {
//				System.out.println("Deportivo");
//				
//				Deportivo depor = (Deportivo) vehiculo;
//				depor.setPuertas(5);
//				
//			}
		}
		
	}

}
