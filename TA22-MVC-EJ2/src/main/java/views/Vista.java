package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Component;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;	
	//----MENU----
	//PANELES MENU
	public JPanel vista_menu;
	//BOTONES MENU
	public JButton btn_menu_usuarios, btn_menu_videos;

	//---USUARIOS---
	//PANELES USUARIOS
	public JPanel contentPane, vista_create_usuarios, vista_update_usuarios, vista_delete_usuarios, vista_el_gen_usuarios, vista_read_usuarios;
	//CAMPOS DE TEXTO EDITAR USUARIO
	public JTextField editNombreField, editApellidoField, editDireccionField, editDniField, editFechaField, editIdField;
	//CAMPOS DE TEXTO CREAR USUARIO
	public JTextField createFechaField, createDniField, createApellidoField, createNombreField, createDireccionField;
	//CAMPO DE TEXTO ELIMINAR USUARIO
	public JTextField deleteIdField;
	//BOTONES USUARIOS
	public JButton boton_update, boton_read, boton_create, boton_delete;
	public JButton boton_borrar, boton_guardar, boton_guardar1, btn_volver_usuario;
	//OTROS ELEMENTOS USUARIOS
	public JSeparator separador_videos;
	public JTextArea textArea;
	
	//---VIDEOS---
	//PANELES VIDEOS
	public JPanel vista_el_gen_videos, vista_create_video, vista_read_video, vista_eliminar_video, vista_update_video;
	//BOTONES VIDEOS
	public JButton boton_update_video, boton_read_video, boton_create_video, boton_delete_video, btn_guardar_nuevo_video, btn_eliminar_video, btn_update_video, btn_volver_videos;
	//OTROS ELEMENTOS VIDEOS
	public JSeparator separador_usuarios;
	public  JTextArea textArea_videos;

	
	public JLabel lblNewLabel;
	
	//CAMPOS DE TEXTO CREATE VIDEO
	public JTextField tf_titulo_crear_video, tf_director_crear_video, tf_idcliente_crear_video;
	//CAMPOS DE TEXTO DELETE VIDEO
	public JTextField tf_id_delete_video;
	//CAMPOS DE TEXTO UPDATE VIDEO
	public JTextField tf_idcliente_update_video, tf_idvideo_update_video, tf_director_update_video, tf_titulo_update_video;


	public Vista() {
		setTitle("Control usuarios / videos");
		setLocationRelativeTo(null);
		setBounds(100, 100, 643, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
								
								
								//ELEMENTOS VISTA MENU 
								vista_menu = new JPanel();
								vista_menu.setBounds(0, 0, 627, 529);
								contentPane.add(vista_menu);
								vista_menu.setLayout(null);
								vista_menu.setVisible(true);
								
								btn_menu_usuarios = new JButton("USUARIOS");
								btn_menu_usuarios.setBounds(245, 179, 123, 46);
								vista_menu.add(btn_menu_usuarios);
								
								btn_menu_videos = new JButton("VIDEOS");
								btn_menu_videos.setBounds(245, 302, 123, 46);
								vista_menu.add(btn_menu_videos);
								
								JLabel txt_menu1 = new JLabel("CONTROL USUARIOS / VIDEOS");
								txt_menu1.setFont(new Font("Tahoma", Font.BOLD, 17));
								txt_menu1.setBounds(174, 64, 332, 46);
								vista_menu.add(txt_menu1);
						
								
								
								//ELEMENTOS VISTA READ VIDEOS		
								vista_read_video = new JPanel();
								vista_read_video.setBounds(300, 61, 317, 457);
								contentPane.add(vista_read_video);
								vista_read_video.setLayout(null);
								vista_read_video.setVisible(false);
								
								
								JLabel lblNewLabel_1 = new JLabel("Registro de videos: ");
								lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
								lblNewLabel_1.setBounds(20, 21, 118, 14);
								vista_read_video.add(lblNewLabel_1);
								
								textArea_videos = new JTextArea();
								textArea_videos.setEditable(false);
								textArea_videos.setBounds(20, 47, 287, 344);
								vista_read_video.add(textArea_videos);
								
								JScrollPane scroll =new JScrollPane(textArea_videos, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
								scroll.setBounds(20, 47, 287, 344);
								vista_read_video.add(scroll);
								

		
				//ELEMENTOS VISTA ELIMINAR VIDEOS
				vista_eliminar_video = new JPanel();
				vista_eliminar_video.setBounds(300, 61, 317, 457);
				contentPane.add(vista_eliminar_video);
				vista_eliminar_video.setLayout(null);
				
				tf_id_delete_video = new JTextField();
				tf_id_delete_video.setBounds(101, 136, 86, 20);
				vista_eliminar_video.add(tf_id_delete_video);
				tf_id_delete_video.setColumns(10);
				
				btn_eliminar_video = new JButton("Eliminar");
				btn_eliminar_video.setBounds(81, 184, 127, 40);
				vista_eliminar_video.add(btn_eliminar_video);
				
				JLabel lblNewLabel_3 = new JLabel("Id del video");
				lblNewLabel_3.setBounds(115, 95, 93, 14);
				vista_eliminar_video.add(lblNewLabel_3);
				
				JLabel lblNewLabel_2 = new JLabel("Eliminar video: ");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblNewLabel_2.setBounds(37, 21, 110, 14);
				vista_eliminar_video.add(lblNewLabel_2);
				vista_eliminar_video.setVisible(false);
		
		//ELEMENTOS UPDATE VIDEOS
		vista_update_video = new JPanel();
		vista_update_video.setBounds(300, 61, 317, 457);
		contentPane.add(vista_update_video);
		vista_update_video.setLayout(null);
		vista_update_video.setVisible(false);
		
		btn_update_video = new JButton("Actualizar");
		btn_update_video.setBounds(91, 299, 127, 40);
		vista_update_video.add(btn_update_video);
		
		JLabel lblNewLabel_4 = new JLabel("Actualizar video:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(42, 23, 124, 14);
		vista_update_video.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ID del video*");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(42, 70, 96, 14);
		vista_update_video.add(lblNewLabel_5);
		
		tf_idvideo_update_video = new JTextField();
		tf_idvideo_update_video.setBounds(124, 67, 86, 20);
		vista_update_video.add(tf_idvideo_update_video);
		tf_idvideo_update_video.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Título");
		lblNewLabel_6.setBounds(42, 110, 72, 14);
		vista_update_video.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Director");
		lblNewLabel_7.setBounds(42, 168, 72, 14);
		vista_update_video.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("ID del cliente");
		lblNewLabel_8.setBounds(40, 224, 98, 14);
		vista_update_video.add(lblNewLabel_8);
		
		tf_idcliente_update_video = new JTextField();
		tf_idcliente_update_video.setBounds(52, 249, 86, 20);
		vista_update_video.add(tf_idcliente_update_video);
		tf_idcliente_update_video.setColumns(10);
		
		tf_director_update_video = new JTextField();
		tf_director_update_video.setBounds(52, 193, 86, 20);
		vista_update_video.add(tf_director_update_video);
		tf_director_update_video.setColumns(10);
		
		tf_titulo_update_video = new JTextField();
		tf_titulo_update_video.setBounds(52, 135, 86, 20);
		vista_update_video.add(tf_titulo_update_video);
		tf_titulo_update_video.setColumns(10);
		
		
		
		//ELEMENMTOS VISTA CREAR VIDEOS
		vista_create_video = new JPanel();
		vista_create_video.setBounds(300, 61, 317, 457);
		contentPane.add(vista_create_video);
		vista_create_video.setLayout(null);
		vista_create_video.setVisible(false);
		
		btn_guardar_nuevo_video = new JButton("Guardar");
		btn_guardar_nuevo_video.setBounds(100, 295, 127, 40);
		vista_create_video.add(btn_guardar_nuevo_video);
		
		JLabel txt_nuevo_video = new JLabel("Nuevo video:");
		txt_nuevo_video.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_nuevo_video.setBounds(123, 21, 86, 14);
		vista_create_video.add(txt_nuevo_video);
		
		JLabel txt_titulo_nuevo_video = new JLabel("Título");
		txt_titulo_nuevo_video.setBounds(67, 67, 61, 14);
		vista_create_video.add(txt_titulo_nuevo_video);
		
		JLabel txt_director_nuevo_video = new JLabel("Director");
		txt_director_nuevo_video.setBounds(67, 136, 61, 14);
		vista_create_video.add(txt_director_nuevo_video);
		
		JLabel txt_idcliente_nuevo_video = new JLabel("ID Cliente");
		txt_idcliente_nuevo_video.setBounds(67, 205, 79, 14);
		vista_create_video.add(txt_idcliente_nuevo_video);
		
		tf_titulo_crear_video = new JTextField();
		tf_titulo_crear_video.setBounds(77, 92, 86, 20);
		vista_create_video.add(tf_titulo_crear_video);
		tf_titulo_crear_video.setColumns(10);
		
		tf_director_crear_video = new JTextField();
		tf_director_crear_video.setBounds(77, 163, 86, 20);
		vista_create_video.add(tf_director_crear_video);
		tf_director_crear_video.setColumns(10);
		
		tf_idcliente_crear_video = new JTextField();
		tf_idcliente_crear_video.setBounds(77, 230, 86, 20);
		vista_create_video.add(tf_idcliente_crear_video);
		tf_idcliente_crear_video.setColumns(10);
		
		//ELEMENTOS VISTA UPDATE
		vista_update_usuarios = new JPanel();
		vista_update_usuarios.setLayout(null);
		vista_update_usuarios.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update_usuarios.setBounds(292, 61, 325, 457);
		contentPane.add(vista_update_usuarios);
		vista_update_usuarios.setVisible(false);
		
		boton_guardar1 = new JButton("Guardar");
		boton_guardar1.setBounds(87, 355, 127, 40);
		vista_update_usuarios.add(boton_guardar1);
		
		editNombreField = new JTextField();
		editNombreField.setBounds(62, 100, 86, 20);
		vista_update_usuarios.add(editNombreField);
		editNombreField.setColumns(10);
		
		JLabel txt_usuario_upd1 = new JLabel("Nombre");
		txt_usuario_upd1.setBounds(52, 75, 71, 14);
		vista_update_usuarios.add(txt_usuario_upd1);
		
		editApellidoField = new JTextField();
		editApellidoField.setBounds(62, 156, 86, 20);
		vista_update_usuarios.add(editApellidoField);
		editApellidoField.setColumns(10);
		
		JLabel txt_usuario_upd2 = new JLabel("Apellido");
		txt_usuario_upd2.setBounds(52, 131, 86, 14);
		vista_update_usuarios.add(txt_usuario_upd2);
		
		editDireccionField = new JTextField();
		editDireccionField.setBounds(62, 212, 86, 20);
		vista_update_usuarios.add(editDireccionField);
		editDireccionField.setColumns(10);
		
		JLabel txt_usuario_upd3 = new JLabel("Dirección");
		txt_usuario_upd3.setBounds(52, 187, 86, 14);
		vista_update_usuarios.add(txt_usuario_upd3);
		
		editDniField = new JTextField();
		editDniField.setBounds(62, 268, 86, 20);
		vista_update_usuarios.add(editDniField);
		editDniField.setColumns(10);
		
		JLabel txt_usuario_upd4 = new JLabel("DNI (sin letra)");
		txt_usuario_upd4.setBounds(52, 243, 96, 14);
		vista_update_usuarios.add(txt_usuario_upd4);
		
		JLabel txt_usuario_upd5 = new JLabel("Fecha (YYYY/MM/DD)");
		txt_usuario_upd5.setBounds(52, 299, 118, 14);
		vista_update_usuarios.add(txt_usuario_upd5);
		
		editFechaField = new JTextField();
		editFechaField.setBounds(62, 324, 86, 20);
		vista_update_usuarios.add(editFechaField);
		editFechaField.setColumns(10);
		editIdField = new JTextField();
		editIdField.setBounds(141, 47, 86, 20);
		vista_update_usuarios.add(editIdField);
		editIdField.setColumns(10);
		
		JLabel txt_usuario_upd6 = new JLabel("Busca por id*");
		txt_usuario_upd6.setForeground(Color.RED);
		txt_usuario_upd6.setBounds(52, 50, 118, 14);
		vista_update_usuarios.add(txt_usuario_upd6);
		
		JLabel txt_usuario_del7 = new JLabel("Actualizar usuario:");
		txt_usuario_del7.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_usuario_del7.setBounds(53, 25, 134, 14);
		vista_update_usuarios.add(txt_usuario_del7);
			
	
		// ELEMENTOS VISTA DELETE USUARIO
		vista_delete_usuarios = new JPanel();
		vista_delete_usuarios.setLayout(null);
		vista_delete_usuarios.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete_usuarios.setBounds(300, 61, 317, 457);
		contentPane.add(vista_delete_usuarios);
		vista_delete_usuarios.setVisible(false);
		
		
		boton_borrar = new JButton("Eliminar");
		boton_borrar.setBounds(82, 223, 135, 44);
		vista_delete_usuarios.add(boton_borrar);
		
		JLabel txt_usuario_del1 = new JLabel("Id del usuario:");
		txt_usuario_del1.setBounds(82, 82, 105, 14);
		vista_delete_usuarios.add(txt_usuario_del1);
		
		deleteIdField = new JTextField();
		deleteIdField.setColumns(10);
		deleteIdField.setBounds(107, 131, 67, 20);
		vista_delete_usuarios.add(deleteIdField);
		
		JLabel txt_usuario_del2 = new JLabel("Eliminar usuario");
		txt_usuario_del2.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_usuario_del2.setBounds(27, 28, 110, 14);
		vista_delete_usuarios.add(txt_usuario_del2);
		
		
		
		//ELEMENTOS VISTA READ USUARIOS
		vista_read_usuarios = new JPanel();
		vista_read_usuarios.setBounds(292, 61, 325, 457);
		contentPane.add(vista_read_usuarios);
		vista_read_usuarios.setLayout(null);
		vista_read_usuarios.setVisible(false);
		
		JLabel txt_usuario_read1 = new JLabel("Registro de usuarios:");
		txt_usuario_read1.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_usuario_read1.setBounds(10, 30, 140, 14);
		vista_read_usuarios.add(txt_usuario_read1);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 55, 295, 328);
		vista_read_usuarios.add(textArea);
		
		JScrollPane scroll2 =new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll2.setBounds(20, 55, 295, 328);
		vista_read_usuarios.add(scroll2);
		
			// ELEMENTOS VISTA CREATE USUARIO
			vista_create_usuarios = new JPanel();
			vista_create_usuarios.setLayout(null);
			vista_create_usuarios.setBorder(new EmptyBorder(5, 5, 5, 5));
			vista_create_usuarios.setBounds(300, 61, 317, 457);
			contentPane.add(vista_create_usuarios);
			vista_create_usuarios.setVisible(false);
			
			boton_guardar = new JButton("Guardar");
			boton_guardar.setBounds(94, 376, 127, 40);
			vista_create_usuarios.add(boton_guardar);
			
			createNombreField = new JTextField();
			createNombreField.setBounds(63, 83, 86, 20);
			vista_create_usuarios.add(createNombreField);
			createNombreField.setColumns(10);
			
			JLabel txt_usuario_cre4 = new JLabel("Nombre");
			txt_usuario_cre4.setBounds(53, 58, 77, 14);
			vista_create_usuarios.add(txt_usuario_cre4);
			
			createApellidoField = new JTextField();
			createApellidoField.setBounds(63, 151, 86, 20);
			vista_create_usuarios.add(createApellidoField);
			createApellidoField.setColumns(10);
			
			JLabel txt_usuario_cre1 = new JLabel("Apellidos");
			txt_usuario_cre1.setBounds(53, 126, 77, 14);
			vista_create_usuarios.add(txt_usuario_cre1);
			
			createDniField = new JTextField();
			createDniField.setBounds(63, 263, 86, 20);
			vista_create_usuarios.add(createDniField);
			createDniField.setColumns(10);
			
			JLabel txt_usuario_cre2 = new JLabel("DNI (sin letra)");
			txt_usuario_cre2.setBounds(53, 238, 77, 14);
			vista_create_usuarios.add(txt_usuario_cre2);
			
			JLabel txt_usuario_cre3 = new JLabel("Fecha (YYYY/MM/DD)");
			txt_usuario_cre3.setBounds(53, 294, 124, 14);
			vista_create_usuarios.add(txt_usuario_cre3);
			
			createFechaField = new JTextField();
			createFechaField.setBounds(63, 320, 86, 20);
			vista_create_usuarios.add(createFechaField);
			createFechaField.setColumns(10);
			
			JLabel txt_usuario_cre6 = new JLabel("Nuevo usuario");
			txt_usuario_cre6.setFont(new Font("Tahoma", Font.BOLD, 11));
			txt_usuario_cre6.setBounds(106, 25, 91, 14);
			vista_create_usuarios.add(txt_usuario_cre6);
			
			JLabel txt_usuario_cre7 = new JLabel("Dirección");
			txt_usuario_cre7.setBounds(53, 182, 77, 14);
			vista_create_usuarios.add(txt_usuario_cre7);
			
			createDireccionField = new JTextField();
			createDireccionField.setBounds(63, 207, 86, 20);
			vista_create_usuarios.add(createDireccionField);
			createDireccionField.setColumns(10);
					
					
					// ELEMENTOS GENERALES USUARIOS
					vista_el_gen_usuarios = new JPanel();
					vista_el_gen_usuarios.setLayout(null);
					vista_el_gen_usuarios.setBounds(0, 0, 627, 529);
					contentPane.add(vista_el_gen_usuarios);
					vista_el_gen_usuarios.setVisible(false);
					
					boton_read = new JButton("Mostrar registro");
					boton_read.setBounds(83, 132, 127, 43);
					vista_el_gen_usuarios.add(boton_read);
					
					boton_update = new JButton("Actualizar usuario");
					boton_update.setBounds(83, 290, 127, 40);
					vista_el_gen_usuarios.add(boton_update);
					
					boton_create = new JButton("Crear usuario");
					boton_create.setBounds(83, 215, 127, 40);
					vista_el_gen_usuarios.add(boton_create);
					
					boton_delete = new JButton("Eliminar usuario");
					boton_delete.setBounds(83, 369, 127, 40);
					vista_el_gen_usuarios.add(boton_delete);
					
					JLabel txt_usuario_gen1 = new JLabel("Opciones: ");
					txt_usuario_gen1.setFont(new Font("Tahoma", Font.BOLD, 11));
					txt_usuario_gen1.setBounds(64, 93, 78, 14);
					vista_el_gen_usuarios.add(txt_usuario_gen1);
					
					JLabel txt_usuario_gen2 = new JLabel("REGISTRO DE CLIENTES");
					txt_usuario_gen2.setFont(new Font("Tahoma", Font.BOLD, 13));
					txt_usuario_gen2.setBounds(233, 11, 158, 14);
					vista_el_gen_usuarios.add(txt_usuario_gen2);
					
					separador_usuarios = new JSeparator();
					separador_usuarios.setOrientation(SwingConstants.VERTICAL);
					separador_usuarios.setBounds(309, 68, 29, 374);
					vista_el_gen_usuarios.add(separador_usuarios);
					
					btn_volver_usuario = new JButton("Volver");
					btn_volver_usuario.setBounds(10, 495, 89, 23);
					vista_el_gen_usuarios.add(btn_volver_usuario);
					


					
					//ELEMENTOS GENERALES VIDEOS
					vista_el_gen_videos = new JPanel();
					vista_el_gen_videos.setBounds(0, 0, 627, 529);
					contentPane.add(vista_el_gen_videos);
					vista_el_gen_videos.setLayout(null);
					vista_el_gen_videos.setVisible(false);
					
							
							boton_delete_video = new JButton("Eliminar video");
							boton_delete_video.setBounds(70, 395, 127, 40);
							vista_el_gen_videos.add(boton_delete_video);
							
							boton_update_video = new JButton("Actualizar video");
							boton_update_video.setBounds(70, 306, 127, 40);
							vista_el_gen_videos.add(boton_update_video);
							
							boton_create_video = new JButton("Crear video");
							boton_create_video.setBounds(70, 216, 127, 40);
							vista_el_gen_videos.add(boton_create_video);
							
							boton_read_video = new JButton("Mostrar lista videos");
							boton_read_video.setBounds(70, 128, 127, 43);
							vista_el_gen_videos.add(boton_read_video);
							
							JLabel txt_video_gen1 = new JLabel("Opciones: ");
							txt_video_gen1.setFont(new Font("Tahoma", Font.BOLD, 11));
							txt_video_gen1.setBounds(64, 81, 78, 14);
							vista_el_gen_videos.add(txt_video_gen1);
							
							JLabel txt_video_gen2 = new JLabel("GESTOR DE VIDEOS");
							txt_video_gen2.setFont(new Font("Tahoma", Font.BOLD, 13));
							txt_video_gen2.setBounds(237, 11, 158, 14);
							vista_el_gen_videos.add(txt_video_gen2);
							
							separador_videos = new JSeparator();
							separador_videos.setOrientation(SwingConstants.VERTICAL);
							separador_videos.setBounds(289, 81, 14, 374);
							vista_el_gen_videos.add(separador_videos);
							
							btn_volver_videos = new JButton("Volver");
							btn_volver_videos.setBounds(10, 495, 89, 23);
							vista_el_gen_videos.add(btn_volver_videos);
		
		
		
	}
}
