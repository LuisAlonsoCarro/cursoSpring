package profe.empleados.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

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
		System.out.println(empNegocio.getAllEmpleados().toString());
	}

}
