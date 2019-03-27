package profe.empleados.daos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import profe.empleado.model.Empleado;

@Repository("empDAO")
public class EmpDAOMock implements EmpDAO {

	private Map<String, Empleado> mpEmpleado = new HashMap<>();

	
	@PostConstruct
	public void inicializa() {
		Empleado emp=new Empleado("70906835C", "Luis", "Alonso", 26);
		insertaEmpleado(emp);
		emp=new Empleado("000000000", "Alberto", "El Spring master", 28);
		insertaEmpleado(emp);
		
		emp.setNombre("Spring");
		modificaEmpleado(emp);
	}
	
	
	
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
		try {
			mpEmpleado.replace(emp.getCif(), (Empleado)emp.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void eliminaEmpleado(String cif) {
		// TODO Auto-generated method stub
		mpEmpleado.remove(cif);
	}



	@Override
	public void insertaEmpleados(List<Empleado> listaEmpleados) {
		// TODO Auto-generated method stub
		
	}
	
	

}
