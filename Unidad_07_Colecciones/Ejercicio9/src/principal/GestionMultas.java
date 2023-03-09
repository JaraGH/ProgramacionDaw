package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class GestionMultas {
	
	private List<Multa> multas = new ArrayList<>();

	public GestionMultas() {
		Random rnd = new Random();
		String[] matriculas = { "1299-BMX", "3899-KML", "9099-JKL", "3737-NMS" };
		Double[] importes = { 50.0, 100.0, 150.0, 200.0, 250.0, 300.0 };
		for (int i = 0; i < 7; i++) {
			multas.add(new Multa(matriculas[rnd.nextInt(matriculas.length)],
					LocalDate.of(2019, rnd.nextInt(12) + 1, rnd.nextInt(28) + 1),
					importes[rnd.nextInt(importes.length)]));
		}
	}

	public void mostrarMultasOrdenadasPorMatricula() {
		// ordenar el array de multas x matricula, mediante una clase anónima
		
		Collections.sort(multas, new Comparator<Multa>() {
			@Override
			public int compare(Multa m1, Multa m2) {
				if (m1.getMatricula().equalsIgnoreCase(m2.getMatricula()))
					return m1.getFechaMulta().compareTo(m2.getFechaMulta());
				
				return m1.getMatricula().compareTo(m2.getMatricula());
			}

		});
		
		System.out.println("Multas ordenadas por matrícula ");
		System.out.println("**************************************");
		int i=0;
		while(i<multas.size()) {			
			String matriculaActual = multas.get(i).getMatricula();
			System.out.println("\nMatrícula: " + matriculaActual);
			
			while(i<multas.size() && matriculaActual==multas.get(i).getMatricula()) {
				System.out.printf("\tFecha %s, Importe %f\n ", multas.get(i).getFechaMulta().toString(),
						multas.get(i).getImporteMulta());
				i++;
			}
		}
		

	}

	public HashMap<String, ResumenMultas> getResumenMultas() {
		//hash: key: matricula value: ResumenMultas
		HashMap<String, ResumenMultas> resumenMultas = new HashMap<>();
		//recorro ArrayList de multas
		for (Multa multa : multas) {
			
			if (resumenMultas.containsKey(multa.getMatricula())) {
				
				ResumenMultas resMulta = resumenMultas.get(multa.getMatricula());
				
				resMulta.setSumaImportes(resMulta.getSumaImportes() + multa.getImporteMulta());
				
				resMulta.setNumeroMultas(resMulta.getNumeroMultas() + 1);
				
			} else {
				resumenMultas.put(multa.getMatricula(),
						new ResumenMultas(multa.getMatricula(), 
								1, multa.getImporteMulta()));
			}
		}
		return resumenMultas;
	}
	
}


class ResumenMultas {
    private String matricula;
    private Integer numeroMultas;
    private Double sumaImportes;

    public ResumenMultas(String matricula, Integer numeroMultas, Double sumaImportes) {
        this.matricula = matricula;
        this.numeroMultas = numeroMultas;
        this.sumaImportes = sumaImportes;
    }

    public Double getSumaImportes() {
        return sumaImportes;
    }

    public void setSumaImportes(Double sumaImportes) {
        this.sumaImportes = sumaImportes;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumeroMultas() {
        return numeroMultas;
    }

    public void setNumeroMultas(Integer numeroMultas) {
        this.numeroMultas = numeroMultas;
    }

    @Override
    public String toString() {
        return "Datos{" + "matricula=" + matricula + ", numeroMultas=" + numeroMultas + ", sumaImportes=" + sumaImportes + '}';
    }
}
