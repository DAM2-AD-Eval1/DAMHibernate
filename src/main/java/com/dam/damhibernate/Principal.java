package com.dam.damhibernate;

import java.io.IOException;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sf = new MetadataSources(sr).buildMetadata().buildSessionFactory();
		
		Session session = sf.openSession();
		
		//Alumno alumno1 = new Alumno(100, "Alumno1", 23);
		//Alumno alumno2 = new Alumno(200, "Alumno2", 37);
		ArrayList<Alumno> listaAlumnos = LecturaFichero.leer("D:\\PRUEBAS\\alumnos.csv");
		
		
		session.getTransaction().begin();
		
		for (int i = 0; i < listaAlumnos.size(); i++)
			session.save(listaAlumnos.get(i));
		
		session.getTransaction().commit();
		
		session.close();
		sf.close();

	}

}
