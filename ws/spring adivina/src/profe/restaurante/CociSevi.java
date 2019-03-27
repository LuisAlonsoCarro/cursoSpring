package profe.restaurante;

import org.springframework.stereotype.Component;

//@Component("cocineroSevillano")  //Equivale a tener una etiqueta bean en el fichero de configuracion. Nombre de la clase perpo la primera en minusculas
								// entre parentesis si queremos un id en concreto
public class CociSevi implements Cocinero{

	
	@Override
	public String getDesayuno() {
		// TODO Auto-generated method stub
		return "gazpacho";
	}
	
	
}
