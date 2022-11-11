package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import models.ModeloUsuario;
import views.Vista;

public class ControladorUsuarios implements ActionListener {

	private ModeloUsuario modeloUsuario;
	private Vista vista;
	private JPanel vista_create_usuarios, vista_delete_usuarios, vista_update_usuarios, vista_read_usuarios;
	
	public ControladorUsuarios(ModeloUsuario modeloUsuario, Vista vista) {
			this.modeloUsuario=modeloUsuario;
			this.vista=vista;
			this.vista.btn_menu_usuarios.addActionListener(this);
			this.vista.btn_menu_videos.addActionListener(this);
			this.vista.boton_create.addActionListener(this);
			this.vista.boton_create.addActionListener(this);
			this.vista.boton_delete.addActionListener(this);
			this.vista.boton_read.addActionListener(this);
			this.vista.boton_update.addActionListener(this);
			this.vista.boton_borrar.addActionListener(this);
			this.vista.boton_guardar.addActionListener(this);
			this.vista.boton_guardar1.addActionListener(this);
			this.vista.btn_volver_usuario.addActionListener(this);
			
		}

	
	public void actionPerformed(ActionEvent evento) {
		if(vista.btn_menu_usuarios == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(false);

				vista.vista_el_gen_usuarios.setVisible(true);
				vista.vista_el_gen_videos.setVisible(false);
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.btn_volver_usuario == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(true);

				vista.vista_el_gen_usuarios.setVisible(false);
				vista.vista_el_gen_videos.setVisible(false);
				
				vista.vista_create_video.setVisible(false);
				vista.vista_read_video.setVisible(false);
				vista.vista_update_video.setVisible(false);
				vista.vista_eliminar_video.setVisible(false);	;
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		
		if(vista.boton_create == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(false);

				vista.createNombreField.setText("");
				vista.createApellidoField.setText("");
				vista.createDireccionField.setText("");
				vista.createDniField.setText("");
				vista.createFechaField.setText("");

				vista.vista_el_gen_usuarios.setVisible(true);
				vista.vista_el_gen_videos.setVisible(false);
				
				vista.vista_create_usuarios.setVisible(true);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(false);

				vista.vista_el_gen_usuarios.setVisible(true);
				vista.vista_el_gen_videos.setVisible(false);

				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(true);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(false);

			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(false);

				vista.textArea.setText(null);
				vista.editNombreField.setText("");
				vista.editApellidoField.setText("");
				vista.editDireccionField.setText("");
				vista.editDniField.setText("");
				vista.editFechaField.setText("");
				
				vista.vista_el_gen_usuarios.setVisible(true);
				vista.vista_el_gen_videos.setVisible(false);
						
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(true);
				vista.vista_read_usuarios.setVisible(false);

			} catch (Exception e) {
			}
		}
		
		if(vista.boton_read == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_menu.setVisible(false);

				vista.vista_el_gen_usuarios.setVisible(true);
				vista.vista_el_gen_videos.setVisible(false);
				
				vista.vista_create_usuarios.setVisible(false);
				vista.vista_delete_usuarios.setVisible(false);
				vista.vista_update_usuarios.setVisible(false);
				vista.vista_read_usuarios.setVisible(true);
				
				ArrayList<String> text = this.modeloUsuario.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textArea.append(text.get(i)+"\n");
				}
			} catch (Exception e) {
			}
		}
		
		
		if(vista.boton_guardar == evento.getSource()) {
			String nombre,apellido,fecha,direccion;
			int dni;
			
			nombre=this.vista.createNombreField.getText();
			apellido=this.vista.createApellidoField.getText();
			direccion = this.vista.createDireccionField.getText();
			dni=Integer.parseInt(this.vista.createDniField.getText());
			fecha=this.vista.createFechaField.getText();
			try {
				this.modeloUsuario.create(nombre, apellido, direccion, dni, fecha);
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_create_usuarios.setVisible(false);
		}
		
		if(vista.boton_guardar1 == evento.getSource()) {
			
			String nombre,apellido,fecha,direccion,id;
			int dni;
			
			nombre=this.vista.editNombreField.getText();
			apellido=this.vista.editApellidoField.getText();
			direccion = this.vista.editDireccionField.getText();
			dni=Integer.parseInt(this.vista.editDniField.getText());
			fecha=this.vista.editFechaField.getText();
			id=this.vista.editIdField.getText();
			
			try {
				this.modeloUsuario.update("nombre",nombre,id);
				this.modeloUsuario.update("apellido",apellido,id);
				this.modeloUsuario.update("direccion",direccion,id);
				this.modeloUsuario.update("dni", String.valueOf(dni),id);
				this.modeloUsuario.update("fecha",fecha,id);
				JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			this.vista.vista_update_usuarios.setVisible(false);
		}
		
		if(vista.boton_borrar == evento.getSource()) {
			
			int id;
		
			id=Integer.parseInt(this.vista.deleteIdField.getText());
			try {
				this.modeloUsuario.delete(id,"id");
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_delete_usuarios.setVisible(false);
		}
	}
}
