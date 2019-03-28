package profe.empleados.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import profe.empleados.negocio.EmpNegocio;

@Controller
@RequestMapping("/gestEmpleados")
public class HomeController {

	@Autowired
	private EmpNegocio empNegocio;
	
//	@RequestMapping("saludos")
	public String muestraFormulario()
	{
		
//		model.addAttribute("empleado", empNegocio.getEmpleado(cif));
		return "empleados";
	}
}
