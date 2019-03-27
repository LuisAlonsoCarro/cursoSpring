package profe.empleados.daos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import profe.empleado.model.Empleado;

public class EmpDAOMock implements EmpDAO {

	private Map<String, Empleado> mpEmpleado = new HashMap<>();

	@Override
	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		return new ArrayList<>(mpEmpleado.values());
	}

	@Override
	public Empleado getEmpleado(String cif) {
		// TODO Auto-generated method stub
		Empleado eReturn = mpEmpleado.get(cif);
		
		if(null!=eReturn) {
			try {
				return (Empleado)eReturn.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public void insertaEmpleado(Empleado emp) {		
		try {
			mpEmpleado.put(emp.getCif(), ((Empleado)emp.clone()));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void modificaEmpleado(Empleado emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminaEmpleado(String cif) {
		// TODO Auto-generated method stub

	}

}
