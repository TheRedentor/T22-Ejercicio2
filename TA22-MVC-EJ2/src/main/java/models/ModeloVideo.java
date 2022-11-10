package models;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import connection.Conexion2;

public class ModeloVideo {

	private int id;
	private String title;
	private String director;
	private int cli_id;
	private Conexion2 conexion = new Conexion2();
	

	public ModeloVideo() {
	}
	
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getCli_id() {
		return cli_id;
	}
	public Conexion2 getConexion() {
		return conexion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public void setConexion(Conexion2 conexion) {
		this.conexion = conexion;
	}
	
	

	public void create(String title, String director, int cli_id) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_2","INSERT INTO Videos (title, director, cli_id) VALUES('"+title+"', '"+director+"', "+cli_id+");");
		conexion.closeConnection();
	}
	
	public ArrayList<String> read() throws SQLException, FileNotFoundException {
		conexion.create_connection();
		ArrayList<String> text = conexion.readData("T22_2","Clientes");
		conexion.closeConnection();
		return text;
	}
	
	public void update(String campo, String campo_cambiado, int condicion) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateData("T22_2","Clientes",campo,campo_cambiado,condicion);
		conexion.closeConnection();
	}
	
	public void delete(int id, String primarykey) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteData("T22_2","Clientes", primarykey, id);
		conexion.closeConnection();
	}
	
	public void createTable() throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.createTable("T22_2", "CREATE TABLE Videos (id INT(11) AUTO_INCREMENT, title VARCHAR(250), director VARCHAR(250), cli_id INT(11), PRIMARY KEY (id), FOREIGN KEY (cli_id) REFERENCES Clientes (id) "
				+ "ON DELETE SET NULL ON UPDATE CASCADE);");
		conexion.closeConnection();

	}


}
