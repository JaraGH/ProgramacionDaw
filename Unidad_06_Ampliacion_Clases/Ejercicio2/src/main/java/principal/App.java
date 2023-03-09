package principal;



import org.joda.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate [] fechas = {
				new LocalDate(),
				new LocalDate(2011,11,1),
				new LocalDate(125000000)
		};
		
		mostrarFechas(fechas);
	}
	
	
	public static void mostrarFechas(LocalDate [] fechas) {
		
		
		for (LocalDate fecha : fechas) {
			System.out.println(fecha.getDayOfMonth() + 
					" de " + fecha.monthOfYear().getAsText() + 
					" de " + fecha.getYear());
		}
	}
		
	

}
