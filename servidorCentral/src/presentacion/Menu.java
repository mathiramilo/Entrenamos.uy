/* Taller de Programacion - INCO/FING/UDELAR
 * Integrantes:
 *      Alexis Baladon (5.574.612-4) - alexis.baladon@fing.edu.uy
 *      Guillermo Toyos (5.139.879-9) - guillermo.toyos@fing.edu.uy
 *      Jorge Machado (4.876.616-9) - jorge.machado.ottonelli@fing.edu.uy
 *      Juan Jose Mangado (5.535.227-0) - juan.mangado@fing.edu.uy
 *      Mathias Ramilo (5.665.788-5) - mathias.ramilo@fing.edu.uy
 *      
 *      "Nihil novum sub sole"
 */

package presentacion;

import logica.LaFabrica;
import logica.IUsuarioController;
import logica.IActividadDeportivaController;
import logica.IDictadoClaseController;
import logica.IDeportivaController;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu {
	
	private JFrame menuPrincipal;
	private JDesktopPane escritorio;
	private IUsuarioController IUC;
	private IActividadDeportivaController IADC;
	private IDeportivaController IDC;
	private IDictadoClaseController IDCC;
	
	// Declaracion de los JInternalFrames:
	private AltaUsuario altaUsuario;
	private AltaDictadoClase altaClase;
	private AltaInstitucionDeportiva altaIns;
	private ConsultaCuponeras consultaCup;
	private ConsultaUsuario consultaUsu;
	private ConsultaDictadoClase consultaCla;
	private ModificarDatosUsuario modificarUsu;
	
	//Run program!
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.menuPrincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create main frame.
	public Menu() {
		iniciar();
		
		LaFabrica fabrica = LaFabrica.getInstance();
		IUC = fabrica.obtenerIUsuarioController();
		IADC = fabrica.obtenerIActDeportivaController();
		IDC = fabrica.obtenerIDeportivaController();
		IDCC = fabrica.obtenerIDictadoClaseController();	
		
		//Preinicializacion de JInternalFrames con visibilidad=false
		
		//AltaUsuario:
		altaUsuario = new AltaUsuario(IUC);
		altaUsuario.setLocation(462, 25);
		altaUsuario.setVisible(false);
		escritorio.add(altaUsuario);	
		
		// AltaDictadoClase:
		altaClase = new AltaDictadoClase(IDCC);
		altaClase.setLocation(10, 11);
		altaClase.setVisible(false);
		escritorio.add(altaClase);
		
		//AltaInstitucionDeporitva:
		altaIns = new AltaInstitucionDeportiva(IDC);
		altaIns.setBounds(212, 37, 354, 344);
		altaIns.setVisible(false);
		escritorio.add(altaIns);
		
		//ConsultaCuponeras:
		consultaCup = new ConsultaCuponeras(IDC);
		consultaCup.setBounds(200, 100, 400, 200);
		consultaCup.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		consultaCup.setVisible(false);
		escritorio.add(consultaCup);
		
		//ConsultaDictadoClase
		consultaCla = new ConsultaDictadoClase(IDCC);
		consultaCla.setVisible(false);
		escritorio.add(consultaCla);
		
		//ConsultaUsuario
		consultaUsu = new ConsultaUsuario(IUC);
		consultaUsu.setVisible(false);
		escritorio.add(consultaUsu);
		
		//ModificarDatosUsuario
		modificarUsu = new ModificarDatosUsuario(IUC);
		modificarUsu.setVisible(false);
		escritorio.add(modificarUsu);
	}
	
	private void iniciar() {
        // Se crea el Frame con las dimensiones indicadas:
		menuPrincipal = new JFrame();
		menuPrincipal.setTitle("ENTRENAMOS.UY");
		menuPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		menuPrincipal.setBounds(180, 100, 1000, 800);
		menuPrincipal.setResizable(true);
		
		escritorio = new JDesktopPane();
		menuPrincipal.getContentPane().add(escritorio);
		
		// Crear la Barra del Menu:
		JMenuBar menuBar = new JMenuBar();
		menuPrincipal.setJMenuBar(menuBar);
		
		JMenu menuInicio = new JMenu("Inicio\r\n");
		menuBar.add(menuInicio);
		
		JMenuItem itemIrInicio = new JMenuItem("Ir a Inicio");
		menuInicio.add(itemIrInicio);

		JMenuItem itemSalir = new JMenuItem("Salir");
		menuInicio.add(itemSalir);
		itemSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuPrincipal.dispose();
			}
		});
		JMenu menuRegistro = new JMenu("Registros");
		menuBar.add(menuRegistro);
		
		JMenu subMenuUsuario = new JMenu("Usuario");
		menuRegistro.add(subMenuUsuario);
		
		JMenuItem itemRegistrarUsuario = new JMenuItem("Registrar Usuario");
		subMenuUsuario.add(itemRegistrarUsuario);
		itemRegistrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (altaUsuario.isVisible()) 
					altaUsuario.toFront();
				else {
					altaUsuario.clear();
					altaUsuario.setVisible(true);
				}
			}
		});		
		
		JMenu subMenuInstitucion = new JMenu("Institucion");
		menuRegistro.add(subMenuInstitucion);
		
		JMenuItem itemAltaInstitucion = new JMenuItem("Alta Institucion Deportiva");
		subMenuInstitucion.add(itemAltaInstitucion);
		itemAltaInstitucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (altaIns.isVisible()) 
					altaIns.toFront();
				else {
					altaIns.clear();
					altaIns.setVisible(true);
				}
			}
		});
		
		JMenu subMenuActDep = new JMenu("Actividad Deportiva");
		menuRegistro.add(subMenuActDep);
		
		JMenuItem itemAltaActividad = new JMenuItem("Alta Actividad Deportiva");
		subMenuActDep.add(itemAltaActividad);
//		itemAltaActividad.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (altaAct.isVisible()) 
//					altaAct.toFront();
//				else {
//					altaAct.clear();
//					altaAct.setVisible(true);
//				}
//			}
//		});		
		
		JMenu subMenuDictado = new JMenu("Dictado Clase");
		menuRegistro.add(subMenuDictado);
		
		JMenuItem itemAltaDictado = new JMenuItem("Alta Dictado Clase");
		itemAltaDictado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (altaClase.isVisible())
					altaClase.toFront();
				else {
					altaClase.cargarInstitucion();
					altaClase.setVisible(true);
				}
			}
		});
		subMenuDictado.add(itemAltaDictado);
		
		JMenuItem itemRegistroAClase = new JMenuItem("Registro a Dictado Clase");
		subMenuDictado.add(itemRegistroAClase);
		itemRegistroAClase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (altaClase.isVisible()) 
					altaClase.toFront();
				else {
					altaClase.clear();
					altaClase.setVisible(true);
				}
			}
		});
		
		JMenu subMenuCuponera = new JMenu("Cuponera");
		menuRegistro.add(subMenuCuponera);

		JMenuItem itemCrearCuponera = new JMenuItem("Crear Cuponera");
		subMenuCuponera.add(itemCrearCuponera);
//		itemCrearCuponera.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (altaCup.isVisible()) 
//					altaCup.toFront();
//				else {
//					altaCup.clear();
//					altaCup.setVisible(true);
//				}
//			}
//		});
		JMenuItem itemAgregarActividad = new JMenuItem("Agregar Actividad Deportiva");
		subMenuCuponera.add(itemAgregarActividad);
//		itemAgregarActividad.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (altaAct.isVisible()) 
//					altaAct.toFront();
//				else {
//					altaAct.clear();
//					altaAct.setVisible(true);
//				}
//			}
//		});
		JMenu menuConsultas = new JMenu("Consultas");
		menuBar.add(menuConsultas);
		
		JMenuItem itemConsultaUsuario = new JMenuItem("Consulta Usuario");
		menuConsultas.add(itemConsultaUsuario);
		itemConsultaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (consultaUsu.isVisible()) 
					consultaUsu.toFront();
				else {
					consultaUsu.clear();
					consultaUsu.setVisible(true);
				}
			}
		});
		JMenuItem itemConsultaActividad = new JMenuItem("Consulta Actividad Deportiva");
		menuConsultas.add(itemConsultaActividad);
//		itemConsultaActividad.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if (consultaAct.isVisible()) 
//					consultaAct.toFront();
//				else {
//					consultaAct.clear();
//					consultaAct.setVisible(true);
//				}
//			}
//		});
		
		JMenuItem itemConsultaClase = new JMenuItem("Consulta Dictado Clase");
		menuConsultas.add(itemConsultaClase);
		itemConsultaClase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (consultaCla.isVisible()) 
					consultaCla.toFront();
				else {
					consultaCla.clear();
					consultaCla.setVisible(true);
				}
			}
		});
		
		JMenuItem itemConsultaCuponera = new JMenuItem("Consulta de Cuponeras");
		menuConsultas.add(itemConsultaCuponera);
		itemConsultaCuponera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (consultaCup.isVisible())
					consultaCup.toFront();
				else {
					// altaClase.limpiar() //no IMplementado aun.
					consultaCup.setVisible(true);
				}
			}
		});
		
		JMenu menuModificaciones = new JMenu("Modificaciones");
		menuBar.add(menuModificaciones);
		
		JMenuItem itemModUsuario = new JMenuItem("Modificar Datos Usuario");
		menuModificaciones.add(itemModUsuario);
		itemModUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (modificarUsu.isVisible()) 
					modificarUsu.toFront();
				else {
					modificarUsu.clear();
					modificarUsu.setVisible(true);
				}
			}
		});
	}	
}

/*  ESTO ERA DE MATHI PARA DARLE COLOR CREO, POR AHORA LO SACAMOS. Guille: Apruebo. La GUI debe ser funcional y los mas aburrida posible.
JDesktopPane desktopPane_1 = new JDesktopPane();
desktopPane_1.setBorder(null);
desktopPane_1.setBackground(new Color(102, 153, 255));
contentPane.add(desktopPane_1, BorderLayout.CENTER);
GridBagLayout gbl_desktopPane_1 = new GridBagLayout();
gbl_desktopPane_1.columnWidths = new int[]{248, 451, 0};
gbl_desktopPane_1.rowHeights = new int[]{271, 93, 0};
gbl_desktopPane_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
gbl_desktopPane_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
desktopPane_1.setLayout(gbl_desktopPane_1);

JLabel lblNewLabel = new JLabel("ENTRENAMOS.UY");
lblNewLabel.setForeground(new Color(255, 255, 255));
lblNewLabel.setFont(new Font("Lucida Sans", Font.BOLD, 50));
GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
gbc_lblNewLabel.gridx = 1;
gbc_lblNewLabel.gridy = 1;
desktopPane_1.add(lblNewLabel, gbc_lblNewLabel); */