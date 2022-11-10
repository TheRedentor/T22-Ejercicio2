package mainApp;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import controllers.ControladorUsuarios;
import controllers.ControladorVideos;
import models.ModeloUsuario;
import models.ModeloVideo;
import views.Vista;

public class mainApp {
    public static void main( String[] args ) throws FileNotFoundException, SQLException {
    		ModeloUsuario modeloUsuario = new ModeloUsuario();
        	modeloUsuario.createDB();
        	modeloUsuario.createTable();
        	
    		ModeloVideo modeloVideo = new ModeloVideo();
    		modeloVideo.createTable();

        	Vista vista = new Vista();
        	vista.setVisible(true);
        	
    		ControladorUsuarios controladorUsuario = new ControladorUsuarios(modeloUsuario, vista);
    		ControladorVideos controladorVideos = new ControladorVideos(modeloVideo, vista);
    				

    }
}