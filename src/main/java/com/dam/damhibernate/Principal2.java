package com.dam.damhibernate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		
		ArrayList<Alumno> listaAlumnos = LecturaFichero.leer("D:\\PRUEBAS\\alumnos.csv");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/alumnos?serverTimezone=Europe/Madrid", "root", "1234.Abcd");
		
		PreparedStatement pst = conexion.prepareStatement("INSERT INTO alumno VALUES (?, ?, ?)");
		
		for (int i = 0; i < listaAlumnos.size(); i++) {
			pst.setInt(1, listaAlumnos.get(i).getCodigo());
			pst.setInt(2,  listaAlumnos.get(i).getEdad());
			pst.setString(3, listaAlumnos.get(i).getNombre());
			
			pst.executeUpdate();
		}
		
		pst.close();
		conexion.close();
	}

}
