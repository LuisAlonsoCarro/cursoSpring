package profe.empleados.negocio;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import profe.empleado.model.Empleado;
import profe.empleados.daos.EmpDAO;

@Service("empNegocio")
public class EmpleadosNegocioImpl implements EmpNegocio{

	@Resource(name="empDAO")
	private EmpDAO dao;

	public List<Empleado> getAllEmpleados() {
		return dao.getAllEmpleados();
	}

	public Empleado getEmpleado(String cif) {
		return dao.getEmpleado(cif);
	}

	public void insertaEmpleado(Empleado emp) {
		dao.insertaEmpleado(emp);
	}

	public void modificaEmpleado(Empleado emp) {
		dao.modificaEmpleado(emp);
	}

	public void eliminaEmpleado(String cif) {
		dao.eliminaEmpleado(cif);
	}
}
