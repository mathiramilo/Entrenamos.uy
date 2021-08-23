/* Taller de Programacion - INCO/FING/UDELAR
 * Integrantes:
 *      Alexis Baladon (5.574.612-4) - alexis.baladon@fing.edu.uy
 *      Guillermo Toyos (5.139.879-9) - guillermo.toyos@fing.edu.uy
 *      Jorge Machado (4.876.616-9) - jorge.machado.ottonelli@fing.edu.uy
 *      Juan Jose Mangado (5.535.227-0) - juan.mangado@fing.edu.uy
 *      Mathias Ramilo (5.665.788-5) - mathias.ramilo@fing.edu.uy
 */

package logica;

import java.util.Set;
import datatypes.DtClase;

public interface IDictadoClaseController {
	
	public Set<String> obtenerInstituciones();
	
	public int ingresarDatosClase(String ins,String actDep,DtClase datos);
		
	//public void modificarDatosClase(String ins,String actDep,DtClase datos);
}