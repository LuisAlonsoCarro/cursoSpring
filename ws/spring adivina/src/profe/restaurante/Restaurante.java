package profe.restaurante;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurante {
	
//	@Resource(name="cocineroEsp	")
	private Cocinero cocinero; 
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"Beans.xml"});
		Restaurante rest = (Restaurante) context.getBean("restaurante");
		rest.go();
	}
	
	private void go() {
		System.out.println("Hoy vamos a desayunar "+cocinero.getDesayuno());
	}
	
	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}


}
