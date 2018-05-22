package com.ttdev.ss;

public class SimpleServiceImpl implements SimpleService {

	@Override
	public String concat(String titulo, String tipo) {
		//Implementación del WebService

		return "Me ha encantado el producto: "+ titulo + ". Dentro de todos los " + tipo + " de la web creo que es el que tiene mejor calidad/precio. Recomendada la compra!";

	}

}
