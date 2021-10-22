package logica;

import datatypes.DtProfesor;

import datatypes.DtProfesorExt;
import datatypes.TEstado;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Profesor extends Usuario {
	
	private String descripcion,  biografia,  website;
	private Institucion instituto;
	private Map<String,  Clase> misClases;
	private Map<String,  ActividadDeportiva> misActividadesIngresadas;
	
	public Profesor(DtProfesor datos) {
		super(datos.getNickname(),  datos.getNombre(),  datos.getApellido(),  datos.getEmail(),  datos.getContrasenia(),  datos.getFechaNacimiento(),  datos.getImagen());
		this.setDescripcion(datos.getDescripcion());
		this.setBiografia(datos.getBiografia());
		this.setWebsite(datos.getLink());
		instituto = null;
		misClases = new HashMap<>();
		misActividadesIngresadas = new HashMap<>();
	}
		
	private void setDescripcion(String desc) {
		this.descripcion = desc;
	}
	
	private void setBiografia(String bio) {
		this.biografia = bio;
	}
	
	private void setWebsite(String web) {
		this.website = web;
	}
	
	public void setInstitucion(Institucion insti) {
		this.instituto = insti;
	}
	
	// Devuelve true si la Clase 'cl' se añade con exito al conjunto de Clases asociadas al Profesor.
	public boolean addClase(Clase cl) {
		if (misClases.containsKey(cl.getNombre())) {
			return false;
		} else {
			misClases.put(cl.getNombre(),  cl);
			return true;
		}
	}
	public void addActDep(ActividadDeportiva d) {
		misActividadesIngresadas.put(d.getNombre(),  d);
	}
	public String getDescripcion() {
		return descripcion;
	}
	
	public String getBiografia() {
		return biografia;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public Institucion getInstitucion() {
		return instituto;
	}
	
	public Map<String,  Clase> getClasesDictadas() {
		return misClases;
	}
	/* DISABLED OPERATION
	public DtProfesor getDt() {
		DtProfesor datos = new DtProfesor(nickname, nombre, apellido, correo, contrasenia, fechaNacimiento, instituto.getNombre(), descripcion, biografia, website, imagen);
		return datos;
	}
	*/
    public DtProfesorExt getDtExt() {
    	Set<String> clasesDictadas = new HashSet<>(misClases.keySet());
    	Map<String,  TEstado> adm = new HashMap<>();
    	Map<String, Set<String>> x = new HashMap<>();
    	for (String aa: instituto.getMiTrabajo(this)) {
    		Set<String> y = new HashSet<>();
    		x.put(aa, y);
    		for (String c: clasesDictadas) {
    			if (getClasesDictadas().get(c).tieneActividadDeportiva(aa)) {
    				y.add(c);
    			}
    		}
    	}
    	for (ActividadDeportiva ad : misActividadesIngresadas.values())
    		adm.put(ad.getNombre(),  ad.getEstado());
    	DtProfesorExt datosExt = new DtProfesorExt(getNickname(), getNombre(), getApellido(), getCorreo(), getContrasenia(), getFecha(), getInstitucion().getNombre(), 
    			getDescripcion(), getBiografia(), getWebsite(), x, getImagen(), this.getSeguidos().keySet(), this.getSeguidores().keySet(), adm);
    	return datosExt;
    }
    
    public void editarDatos(DtProfesor datos) {
    	super.editarDatos(datos);
    	this.setDescripcion(datos.getDescripcion());
    	this.setBiografia(datos.getBiografia());
    	this.setWebsite(datos.getLink());
    }
}