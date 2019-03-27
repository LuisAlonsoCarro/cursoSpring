package profe.empleados.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import profe.empleado.model.Empleado;

@Repository("empDAO2")
public class EmpDAOJDBCTemplate implements EmpDAO {

	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Empleado> empMapper = (rs, row) -> {
		Empleado emp = new Empleado();
		emp.setCif(rs.getString("cif"));
		emp.setNombre(rs.getString("nombre"));
		emp.setApellidos(rs.getString("apellidos"));
		emp.setEdad(rs.getInt("edad"));
		return emp;
	};
	
	private interface ConstantesSQL{
		String GET_ALL_EMPLEADOS = "select * FROM empleados";
		 String GET_EMPLEADO = "select * from empleados where cif =?";
		 String INSERTA_EMPLEADO = "insert into empleados values (?, ?, ?, ?)";
		 String UPDATE_EMPLEADO = "UPDATE empleados set nombre=?, apellidos=?, edad=? WHERE cif = ?";
		 String DELETE_EMPLEADO = "DELETE FROM empleados WHERE cif = ?";
	}
	
	@Autowired
	public void setDataSource(DataSource ds) {
		jdbcTemplate = new JdbcTemplate(ds);
	}
	@Override
	public List<Empleado> getAllEmpleados() {
		 
		return this.jdbcTemplate.query(ConstantesSQL.GET_ALL_EMPLEADOS, empMapper);
	}

	@Override
	public Empleado getEmpleado(String cif) {
		return this.jdbcTemplate.queryForObject(ConstantesSQL.GET_EMPLEADO, new Object[] {cif}, empMapper);

	}

	@Override
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void insertaEmpleado(Empleado emp) {
		this.jdbcTemplate.update(ConstantesSQL.INSERTA_EMPLEADO,
				new Object[] {emp.getCif(), emp.getNombre(), emp.getApellidos(), emp.getEdad()});
	}

	@Override
	public void modificaEmpleado(Empleado emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminaEmpleado(String cif) {
		// TODO Auto-generated method stub

	}
	@Override
	//@Transactional(propagation=Propagation.REQUIRED)
	public void insertaEmpleados(List<Empleado> listaEmpleados) {
//		listaEmpleados.forEach(emp -> insertaEmpleado(emp));
	}

}
