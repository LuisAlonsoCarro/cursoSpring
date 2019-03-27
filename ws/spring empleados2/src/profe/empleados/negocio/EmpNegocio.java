package profe.empleados.negocio;

import java.util.List;

import javax.xml.ws.ServiceMode;

import profe.empleado.model.Empleado;

public interface EmpNegocio {
	
	List<Empleado> getAllEmpleados();
	
	Empleado getEmpleado(String cif);
	
	void insertaEmpleado(Empleado emp);
	void modificaEmpleado(Empleado emp);
	void eliminaEmpleado(String cif);

}
