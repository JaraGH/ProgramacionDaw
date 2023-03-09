package main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Equipo {

	private String nombre;
	private int anioFundacion;
	private String ciudad;
	private String tipoDeporte;
	
}
