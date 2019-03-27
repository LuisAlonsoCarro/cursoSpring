package profe.empleados.ui;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import profe.empleado.model.Empleado;
import profe.empleados.negocio.EmpNegocio;

@Component("gestor")
public class GestorUI {

	
	@Autowired
	private EmpNegocio empNegocio;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"beans-empleados.xml"});
		GestorUI rest = (GestorUI) context.getBean("gestor");
		rest.go();
	}
	
	
	private void go() {
		
		//System.out.println(empNegocio.getAllEmpleados().toString());
		try {
			testInsertaEmpleados();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		listaEmpleados(empNegocio.getAllEmpleados());
		
	}


	private void listaEmpleados(List<Empleado>  allEmpleados) {
		allEmpleados.forEach(emp -> System.out.println(emp.toString()));
	}
	
	private void testInsertaEmpleados() {
		List<Empleado> listaEmpleados=new ArrayList<Empleado>();
		
		listaEmpleados.add(new Empleado("000000000", "Luis", "Alonso", 12));
		listaEmpleados.add(new Empleado("111111111", "Luisws", "Alsdonso", 12));
		listaEmpleados.add(new Empleado("222222222", "we", "asfag", 12));
		listaEmpleados.add(new Empleado("333333333", "fffa", "cvn", 12));
		listaEmpleados.add(new Empleado("444444444", "iiii", "cvbnmcdf", 12));
		
		empNegocio.insertaEmpleados(listaEmpleados);
		
		
	}

	
}
