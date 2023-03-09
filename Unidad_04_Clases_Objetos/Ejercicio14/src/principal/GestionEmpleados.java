package principal;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class GestionEmpleados {

	private Empleado [] empleados;
	
	public GestionEmpleados() {
		try {
			List<String> lines = Files.readAllLines(Paths.get("empleados.csv"), 
					StandardCharsets.UTF_8);
			empleados = new Empleado[lines.size()];
			int i=0;
			for (String string : lines) {
				empleados[i] = new Empleado(string);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public Empleado buscarEmpleadoPorId(String id) {	
		
		for (Empleado empleado : empleados) {
			if (empleado.getId().equalsIgnoreCase(id)) {
				return empleado;
			}
		}
		return null; //no encontrado
	}
	
	
	
	
	public void mostrarEmpleadosPorCorreo(String patronCorreo) {
		
		for (Empleado empleado : empleados) {
			if (empleado.getCorreo().contains(patronCorreo)) {
				System.out.println(empleado);
			}
		}
	}
	

	public boolean actualizarSalario(String id, String nuevoSalario) {
		
		
		Empleado empBuscado = this.buscarEmpleadoPorId(id);
		
		if (empBuscado!=null) {
			empBuscado.setSalario(new BigDecimal(nuevoSalario));
			return true;
		} else {
			return false;
		}
		
		
//		
	} 
	
	public void nacidosEn(int anio) {
		System.out.println("Empleados nacidos en el año: "+ anio);
		for (Empleado empleado : empleados) {
			if (empleado.getFechaNac().getYear()==anio) {
				System.out.println(empleado.toString());
			}
		}
	}
	
	public void nacidosEn(int anio, int mes) {
		System.out.println("Empleados nacidos en el año: "+ anio + 
				" y mes: " + mes);
		for (Empleado empleado : empleados) {
			if (empleado.getFechaNac().getYear()==anio
					&& empleado.getFechaNac().getMonthValue()==mes) {
				System.out.println(empleado.toString());
			}
		}
	}

	
	public void salarioEntre (BigDecimal min, BigDecimal max) {
		
		if (min.compareTo(max)>0) {
			BigDecimal aux = min;
			min= max;
			max=aux;
		}
		
		for (Empleado empleado : empleados) {
			if (empleado.getSalario().compareTo(min)> 0 && 
					empleado.getSalario().compareTo(max)< 0)
				System.out.println(empleado.toString());
		}
		
	}
	
	
	
		
}
