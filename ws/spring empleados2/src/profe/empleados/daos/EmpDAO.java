package profe.empleados.daos;

import java.util.List;

import profe.empleado.model.Empleado;

public interface EmpDAO {
	
	List<Empleado> getAllEmpleados();
	
	Empleado getEmpleado(String cif);
	
	void insertaEmpleado(Empleado emp);
	void modificaEmpleado(Empleado emp);
	void eliminaEmpleado(String cif);

}
