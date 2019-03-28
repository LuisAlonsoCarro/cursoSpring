package profe.empleados.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import profe.empleados.negocio.EmpNegocio;

@Controller
@RequestMapping("/gestEmpleados")
public class HomeController {

	@Autowired
	private EmpNegocio empNegocio;
	
//	@RequestMapping("saludos")
	@RequestMapping(method = RequestMethod.GET)
	public String muestraFormulario()
	{
//		model.addAttribute("empleado", empNegocio.getEmpleado(cif));
		return "empleados";
	}
	
	@RequestMapping(params = {"listar"}, method = RequestMethod.POST)
	public String muestraRespuestaLista(Model model) {
		model.addAttribute("listaEmpleados", empNegocio.getAllEmpleados());
		model.addAttribute("opcion", "muestraTodos");
		return "empleados";
	}
}
