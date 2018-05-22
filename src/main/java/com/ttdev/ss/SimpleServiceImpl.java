package com.ttdev.ss;

public class SimpleServiceImpl implements SimpleService {

	@Override
	public String concat(String titulo, String tipo) {
		//Implementación del WebService

		return "el/la "+ titulo + " es un/una " + tipo + " que está de lujo";

	}

}
