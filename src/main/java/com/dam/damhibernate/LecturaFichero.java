package com.dam.damhibernate;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LecturaFichero {
	
	static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public static ArrayList leer(String ruta) throws IOException {
		
		Path path = Paths.get(ruta);
		
		BufferedReader br = Files.newBufferedReader(path);
		Stream<String> lineas = br.lines();
		
		lineas.forEach(l -> {
			
			String[] campos = l.split(",");
			//Alumno alumno = new Alumno(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2]));
			alumnos.add(new Alumno(Integer.parseInt(campos[0]), campos[1], Integer.parseInt(campos[2])));
			
		});
		
		return alumnos;
		
		
		
		
		
		
		
		
		
		
		
	}

}
