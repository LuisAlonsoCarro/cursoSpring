package profe.adivina;

import org.springframework.stereotype.Component;

@Component("generadorNumero")
public class NumGeneratorMock implements NumGenerator {

	@Override
	public int generaNum(int minimo, int maximo) {
		return 8;
	}
	
	

}
