package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import models.ModeloUsuario;
import models.ModeloVideo;
import views.Vista;

public class ControladorVideos implements ActionListener {

	private ModeloVideo modeloVideo;
	private Vista vista;
	private JPanel vista_create_video, vista_read_video, vista_eliminar_video, vista_update_video;
	
	public ControladorVideos(ModeloVideo modeloVideo, Vista vista) {
			this.modeloVideo=modeloVideo;
			this.vista=vista;
			this.vista.boton_create_video.addActionListener(this);
			this.vista.boton_read_video.addActionListener(this);
			this.vista.boton_update_video.addActionListener(this);
			this.vista.boton_delete_video.addActionListener(this);
			this.vista.btn_eliminar_video.addActionListener(this);
			this.vista.btn_guardar_nuevo_video.addActionListener(this);
		}

	
	public void actionPerformed(ActionEvent evento) {
		if(vista.boton_read_video == evento.getSource()) {
			try {
				vista.textArea_videos.setText(null);
				
				vista.tf_titulo_crear_video.setText("");
				vista.tf_director_crear_video.setText("");
				vista.tf_idcliente_crear_video.setText("");
				
				vista.vista_menu.setVisible(false);
				
				vista.vista_el_gen_usuarios.setVisible(false);
				vista.vista_el_gen_videos.setVisible(true);
				
				vista.vista_create_video.setVisible(false);
				vista.vista_read_video.setVisible(true);
				vista.vista_update_video.setVisible(false);
				vista.vista_eliminar_video.setVisible(false);	
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete_video == evento.getSource()) {
			try {
				vista.textArea_videos.setText(null);
				
				vista.vista_menu.setVisible(false);
				
				vista.vista_el_gen_usuarios.setVisible(false);
				vista.vista_el_gen_videos.setVisible(true);
				
				vista.vista_create_video.setVisible(false);
				vista.vista_read_video.setVisible(false);
				vista.vista_update_video.setVisible(false);
				vista.vista_eliminar_video.setVisible(true);	
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);

			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update_video == evento.getSource()) {
			try {
				vista.textArea_videos.setText(null);
				
				vista.tf_titulo_update_video.setText("");
				vista.tf_director_update_video.setText("");
				vista.tf_idcliente_update_video.setText("");
				
				vista.vista_menu.setVisible(false);

				
				vista.vista_el_gen_usuarios.setVisible(false);
				vista.vista_el_gen_videos.setVisible(true);
				
				vista.vista_create_video.setVisible(false);
				vista.vista_read_video.setVisible(false);
				vista.vista_update_video.setVisible(true);
				vista.vista_eliminar_video.setVisible(false);	
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);
			} catch (Exception e) {
			}
		}
		
		if(vista.boton_read_video == evento.getSource()) {
			try {
				vista.textArea_videos.setText(null);
				
				vista.vista_menu.setVisible(false);

				
				vista.vista_el_gen_usuarios.setVisible(false);
				vista.vista_el_gen_videos.setVisible(true);
				
				vista.vista_create_video.setVisible(false);
				vista.vista_read_video.setVisible(true);
				vista.vista_update_video.setVisible(false);
				vista.vista_eliminar_video.setVisible(false);	
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);

				ArrayList<String> text = this.modeloVideo.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textArea_videos.append(text.get(i)+"\n");
				}
			} catch (Exception e) {
			}
		}
		
		
		if(vista.btn_guardar_nuevo_video == evento.getSource()) {
			String title,director;
			int cli_id;
			
			title=this.vista.tf_titulo_crear_video.getText();
			director=this.vista.tf_director_crear_video.getText();
			cli_id=Integer.parseInt(this.vista.tf_idcliente_crear_video.getText());
			
			try {
				this.modeloVideo.create(title, director, cli_id);
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_create_video.setVisible(false);
		}
		
		if(vista.btn_update_video == evento.getSource()) {
			
			String title,director;
			int id = 0,cli_id;
			
			title=this.vista.tf_titulo_update_video.getText();
			director=this.vista.tf_director_update_video.getText();
			cli_id=Integer.parseInt(this.vista.tf_idcliente_update_video.getText());		
			
			try {
				this.modeloVideo.update("title",title,id);
				this.modeloVideo.update("director",director,id);
				this.modeloVideo.update("cli_id", String.valueOf(cli_id),id);
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			this.vista.vista_update_video.setVisible(false);
		}
		
		if(vista.btn_eliminar_video == evento.getSource()) {
			
			int id;
		
			id=Integer.parseInt(this.vista.tf_id_delete_video.getText());
			try {
				this.modeloVideo.delete(id,"id");
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_eliminar_video.setVisible(false);
		}
	}
}
