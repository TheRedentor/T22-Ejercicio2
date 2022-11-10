package models;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import connection.Conexion;

public class ModeloUsuario {
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;
	private Conexion conexion = new Conexion();


	public ModeloUsuario() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public void create(String nombre, String apellido, String direccion, int dni, String fecha) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_2","INSERT INTO Clientes (nombre, apellido, direccion, dni, fecha) VALUES('"+nombre+"', '"+apellido+"', '"+direccion+"', '"+dni+"', '"+fecha+"')");
		conexion.closeConnection();
	}
	
	public ArrayList<String> read() throws SQLException, FileNotFoundException {
		conexion.create_connection();
		ArrayList<String> text = conexion.readData("T22_2","Clientes");
		conexion.closeConnection();
		return text;
	}
	
	public void update(String campo, String campo_cambiado, String condicion) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateData("T22_2","Clientes",campo,campo_cambiado,condicion);
		conexion.closeConnection();
	}
	
	public void delete(int id, String primarykey) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteData("T22_2","Clientes", primarykey, id);
		conexion.closeConnection();
	}
	
	public void createDB() throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.createDB("T22_2");
		conexion.closeConnection();
	}
	
	public void createTable() throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.createTable("T22_2", "CREATE TABLE Clientes (id INT AUTO_INCREMENT, nombre CHAR(250), apellido CHAR(250), direccion CHAR(250), dni INT, fecha DATE, PRIMARY KEY (id))");
		conexion.closeConnection();
	}

}
