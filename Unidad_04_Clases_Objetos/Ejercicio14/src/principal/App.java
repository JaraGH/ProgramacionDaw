package principal;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		GestionEmpleados g = new GestionEmpleados();
		
//		g.salarioEntre(new BigDecimal("2400"), 
//				new BigDecimal("2300"));
		
//		Empleado emp = g.buscarEmpleadoPorId("100");
////		if (emp==null) {
////			System.out.println("no encontrado");
////		} else {
//			System.out.println(emp.toString());
//		
//			System.out.println(g.actualizarSalario("111100", "1111"));
//			System.out.println(emp.toString());
////		}
//		

		
		
		g.salarioEntre(new BigDecimal("1200"), 
				new BigDecimal("2000"));
		
		
		
	}

}
