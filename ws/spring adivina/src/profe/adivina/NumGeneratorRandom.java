package profe.adivina;

import org.springframework.stereotype.Component;

@Component("generadorNumero2")
public class NumGeneratorRandom implements NumGenerator {

	@Override
	public int generaNum(int minimo, int maximo) {
		return (int)(Math.random()*(maximo-minimo+1)+(minimo));
	}

}
