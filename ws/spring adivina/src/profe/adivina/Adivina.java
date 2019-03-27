package profe.adivina;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import profe.restaurante.Restaurante;

//@Component("adivina")
public class Adivina {

	@Resource(name="generadorNumero2")
	private NumGenerator numGenerator;
	private int minimo;
	private int maximo;
	
	
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"beans-adivina.xml"});
		Adivina rest = (Adivina) context.getBean("adivina");
		rest.go();
	}
	
	private void go() {
		
		int num=numGenerator.generaNum(minimo, maximo);
		for(int i=0; i<3; i++) {
			System.out.println("Introduzca el numero para comprobar si es correcto");
			int numero = Teclado.leeNumero();
			
			if(numero == num) {
				System.out.println("Has acertado");
				break;
			}else {
				System.out.println("Te has equivocado, el numero correcto es "+num);
			}
		}
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public void setMaximo(int maximo) {
		this.maximo = maximo;
	} 

}
