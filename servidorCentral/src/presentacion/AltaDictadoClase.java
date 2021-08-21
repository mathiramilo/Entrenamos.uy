/* Taller de Programacion - INCO/FING/UDELAR
 * Integrantes:
 *      Alexis Baladon (5.574.612-4) - alexis.baladon@fing.edu.uy
 *      Guillermo Toyos (5.139.879-9) - guillermo.toyos@fing.edu.uy
 *      Jorge Machado (4.876.616-9) - jorge.machado.ottonelli@fing.edu.uy
 *      Juan Jose Mangado (5.535.227-0) - juan.mangado@fing.edu.uy
 *      Mathias Ramilo (5.665.788-5) - mathias.ramilo@fing.edu.uy
 */

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import logica.IDictadoClaseController;


public class AltaDictadoClase extends JInternalFrame {
	
	/* Controlador de Dictado de Clase para las acciones del JInternalFrame */
	private IDictadoClaseController controlClase;
	
	/* Componentes graficas */
	// JLabel:
	private JLabel lblSeleccionInstitucion;
	private JLabel lblSeleccionActividad;
	private JLabel lblIngreseNombre;
	private JLabel lblIngreseFechaI;
	private JLabel lblSeleccionProfesor;
	private JLabel lblIngreseMin;
	private JLabel lblIngrseMax;
	private JLabel lblIngreseUrl;
	private JLabel lblIngreseFechaR;
	
	// JTextField:
	private JTextField nombreClase; // Es unico.
	private JTextField sociosMin;
	private JTextField sociosMax;
	private JTextField url;
	
	// JComboBox:
	private JComboBox<Institucion> boxInstitucion;
	private JComboBox<ActividadDeportiva> boxActividad;
	// Seleccion de Fecha de Inicio:
	private JComboBox boxIDia; // Depende de mes (y anio si se quiere trabajar con bisiestos);
	private JComboBox boxIMes;
	private JComboBox boxIAnio;
	private JComboBox boxIHora;
	private JComboBox boxIMinuto;
	private JComboBox boxProfesor;
	// Seleccion de Fecha de Registro (de alta):
	private JComboBox boxRDia; // Depende de mes (y anio si se quiere trabajar con bisiestos);
	private JComboBox boxRMes;
	private JComboBox boxRAnio;
	private JComboBox boxRHora;
	private JComboBox boxRMinuto;
	
	// JButton:
	private JButton btnAceptar;
    private JButton btnCancelar;
    
    /* Crear frame */
	public AltaDictadoClase(IDictadoClaseController idcc) {
		// Inicializa controlador Dictado de Clase:
		controlClase = idcc;
		
		// Propiedades del JInternalFrame:
		setResizable(true);
		setIconifiable(true);
		setMaximizable(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setClosable(true);
		setTitle("Alta de Dictado de Clase");
		setBounds(10, 40, 360, 150);
		
		// GridLayout:
		GridBagLayout gridBagLayout = new GridBagLayout();
	    gridBagLayout.columnWidths = new int[] { 100, 120, 120, 0 };
	    gridBagLayout.rowHeights = new int[] { 30, 30, 30, 0, 0 };
	    gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
	    gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
	    getContentPane().setLayout(gridBagLayout);
	    
	    // JLabels:
	    lblIngreseNombre = new JLabel("Nombre:");
        lblIngreseNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_lblIngreseNombre = new GridBagConstraints();
        gbc_lblIngreseNombre.fill = GridBagConstraints.BOTH;
        gbc_lblIngreseNombre.insets = new Insets(0, 0, 5, 5);
        gbc_lblIngreseNombre.gridx = 0;
        gbc_lblIngreseNombre.gridy = 1;
        getContentPane().add(lblIngreseNombre, gbc_lblIngreseNombre);
        
        // JTextField:
        nombreClase = new JTextField();
        GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
        gbc_textFieldNombre.gridwidth = 2;
        gbc_textFieldNombre.fill = GridBagConstraints.BOTH;
        gbc_textFieldNombre.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldNombre.gridx = 1;
        gbc_textFieldNombre.gridy = 1;
        getContentPane().add(nombreClase, gbc_textFieldNombre);
        nombreClase.setColumns(10);
        
        // JComboBox:
        JComboBox comboBox = new JComboBox();
        GridBagConstraints gbc_comboBox = new GridBagConstraints();
        gbc_comboBox.gridwidth = 2;
        gbc_comboBox.insets = new Insets(0, 0, 5, 5);
        gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
        gbc_comboBox.gridx = 1;
        gbc_comboBox.gridy = 2;
        getContentPane().add(comboBox, gbc_comboBox);
        
        
        // JButton:
        
	    
	}
	
}


/*      // En este caso utilizaremos el GridBagLayout que permite armar una grilla
        // en donde las filas y columnas no son uniformes.
        // Conviene trabajar este componente desde la vista de dise�o gr�fico y s�lo
        // manipular los valores para ajustar alguna cosa.

        // Una etiqueta (JLabel) indicandp que en el siguiente campo debe ingresarse 
        // el nombre del usuario. El texto est� alineado horizontalmente a la derecha para
        // que quede casi pegado al campo de texto.

        // Una campo de texto (JTextField) para ingresar el nombre del usuario. 
        // Por defecto es posible ingresar cualquier string.

        // Una etiqueta (JLabel) indicandp que en el siguiente campo debe ingresarse 
        // el apellido del usuario. El texto est� alineado horizontalmente a la derecha para
        // que quede casi pegado al campo de texto.
        lblIngreseApellido = new JLabel("Apellido:");
        lblIngreseApellido.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_lblIngreseApellido = new GridBagConstraints();
        gbc_lblIngreseApellido.fill = GridBagConstraints.BOTH;
        gbc_lblIngreseApellido.insets = new Insets(0, 0, 5, 5);
        gbc_lblIngreseApellido.gridx = 0;
        gbc_lblIngreseApellido.gridy = 1;
        getContentPane().add(lblIngreseApellido, gbc_lblIngreseApellido);

        // Una campo de texto (JTextField) para ingresar el apellido del usuario. 
        // Por defecto es posible ingresar cualquier string.
        textFieldApellido = new JTextField();
        GridBagConstraints gbc_textFieldApellido = new GridBagConstraints();
        gbc_textFieldApellido.gridwidth = 2;
        gbc_textFieldApellido.fill = GridBagConstraints.BOTH;
        gbc_textFieldApellido.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldApellido.gridx = 1;
        gbc_textFieldApellido.gridy = 1;
        getContentPane().add(textFieldApellido, gbc_textFieldApellido);
        textFieldApellido.setColumns(10);

        // Una etiqueta (JLabel) indicando que en el siguiente campo debe ingresarse 
        // la c�dula del usuario. El texto est� alineado horizontalmente a la derecha para
        // que quede casi pegado al campo de texto.
        lblIngreseCi = new JLabel("C.I.:");
        lblIngreseCi.setHorizontalAlignment(SwingConstants.RIGHT);
        GridBagConstraints gbc_lblIngreseCi = new GridBagConstraints();
        gbc_lblIngreseCi.fill = GridBagConstraints.BOTH;
        gbc_lblIngreseCi.insets = new Insets(0, 0, 5, 5);
        gbc_lblIngreseCi.gridx = 0;
        gbc_lblIngreseCi.gridy = 2;
        getContentPane().add(lblIngreseCi, gbc_lblIngreseCi);

        // Una campo de texto (JTextField) para ingresar la c�dula del usuario. 
        // Por defecto es posible ingresar cualquier string.
        // Al campo se le incluye un Tooltip que, al pasar el mouse por encima, despliega un mensaje.
        textFieldCI = new JTextField();
        textFieldCI.setToolTipText("Ingrese un n�mero sin puntos ni guiones");
        textFieldCI.setColumns(10);
        GridBagConstraints gbc_textFieldCI = new GridBagConstraints();
        gbc_textFieldCI.gridwidth = 2;
        gbc_textFieldCI.fill = GridBagConstraints.BOTH;
        gbc_textFieldCI.insets = new Insets(0, 0, 5, 0);
        gbc_textFieldCI.gridx = 1;
        gbc_textFieldCI.gridy = 2;
        getContentPane().add(textFieldCI, gbc_textFieldCI);

        // Un bot�n (JButton) con un evento asociado que permite registrar el usuario.
        // Dado que el c�digo de registro tiene cierta complejidad, conviene delegarlo
        // a otro m�todo en lugar de incluirlo directamente de el m�todo actionPerformed 
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cmdRegistroUsuarioActionPerformed(arg0);
            }
        });

        GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
        gbc_btnAceptar.fill = GridBagConstraints.BOTH;
        gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
        gbc_btnAceptar.gridx = 1;
        gbc_btnAceptar.gridy = 3;
        getContentPane().add(btnAceptar, gbc_btnAceptar);

        // Un bot�n (JButton) con un evento asociado que permite cerrar el formulario (solo ocultarlo).
        // Dado que antes de cerrar se limpia el formulario, se invoca un m�todo reutilizable para ello. 
        btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarFormulario();
                setVisible(false);
            }
        });
        GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
        gbc_btnCancelar.fill = GridBagConstraints.BOTH;
        gbc_btnCancelar.gridx = 2;
        gbc_btnCancelar.gridy = 3;
        getContentPane().add(btnCancelar, gbc_btnCancelar);
    }

    // Este m�todo es invocado al querer registrar un usuario, funcionalidad
    // provista por la operaci�n del sistem registrarUsuario().
    // Previamente se hace una verificaci�n de los campos, particularmente que no sean vac�os
    // y que la c�dula sea un n�mero. 
    // Tanto en caso de que haya un error (de verificaci�n o de registro) o no, se despliega
    // un mensaje utilizando un panel de mensaje (JOptionPane).
    protected void cmdRegistroUsuarioActionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

        // Obtengo datos de los controles Swing
        String nombreU = this.textFieldNombre.getText();
        String apellidoU = this.textFieldApellido.getText();
        String ciU = this.textFieldCI.getText();

        if (checkFormulario()) {
            try {
                controlUsr.registrarUsuario(nombreU, apellidoU, ciU);

                // Muestro �xito de la operaci�n
                JOptionPane.showMessageDialog(this, "El Usuario se ha creado con �xito", "Registrar Usuario",
                        JOptionPane.INFORMATION_MESSAGE);

            } catch (UsuarioRepetidoException e) {
                // Muestro error de registro
                JOptionPane.showMessageDialog(this, e.getMessage(), "Registrar Usuario", JOptionPane.ERROR_MESSAGE);
            }

            // Limpio el internal frame antes de cerrar la ventana
            limpiarFormulario();
            setVisible(false);
        }
    }

    // Permite validar la informaci�n introducida en los campos e indicar
    // a trav�s de un mensaje de error (JOptionPane) cuando algo sucede.
    // Este tipo de chequeos se puede realizar de otras formas y con otras librer�as de Java, 
    // por ejemplo impidiendo que se escriban caracteres no num�ricos al momento de escribir en
    // en el campo de la c�dula, o mostrando un mensaje de error apenas el foco pasa a otro campo.
    private boolean checkFormulario() {
        String nombreU = this.textFieldNombre.getText();
        String apellidoU = this.textFieldApellido.getText();
        String ciU = this.textFieldCI.getText();

        if (nombreU.isEmpty() || apellidoU.isEmpty() || ciU.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vac�os", "Registrar Usuario",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try {
            Integer.parseInt(ciU);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La CI debe ser un numero", "Registrar Usuario",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Permite borrar el contenido de un formulario antes de cerrarlo.
    // Recordar que las ventanas no se destruyen, sino que simplemente 
    // se ocultan, por lo que conviene borrar la informaci�n para que 
    // no aparezca al mostrarlas nuevamente.
    private void limpiarFormulario() {
        textFieldNombre.setText("");
        textFieldApellido.setText("");
        textFieldCI.setText("");
    }


*/