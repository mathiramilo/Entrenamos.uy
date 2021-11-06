package datatypesWS;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import datatypes.DtActividadDeportivaExt;
import datatypes.DtFecha;
import datatypes.TEstado;

@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
public class DtActividadWS implements Serializable {
	
	private String[] clases;
	private String[] cup;
	private String[] categorias;
	private String nombre, descripcion, creador, imgName;
	private int duracionMinutos;
	private float costo;
	private DtFecha fechaRegistro;
	private TEstado estado;
	
	public DtActividadWS() {}
	public DtActividadWS(DtActividadDeportivaExt d) {
		this.setClases(d.getClases().toArray(new String[0]));
		this.setCup(d.getCuponeras().toArray(new String[0]));
		this.setCategorias(d.getCategorias().toArray(new String[0]));
		this.setNombre(d.getNombre());
		this.setDescripcion(d.getDescripcion());
		this.setCreador(d.getCreador());
		this.setCosto(d.getCosto());
		this.setDuracionMinutos(d.getDuracionMinutos());
		this.setImgName(d.getImgName());
		this.setFechaRegistro(d.getFechaRegistro());
		this.setEstado(d.getEstado());
	}
	public DtActividadDeportivaExt adapt() {
		return new DtActividadDeportivaExt(nombre,descripcion,duracionMinutos,costo,fechaRegistro,
		new HashSet<>(Arrays.asList(categorias)),new HashSet<>(Arrays.asList(clases)),new HashSet<>(Arrays.asList(cup)),estado,creador);
	}
	public String[] getClases() {
		return clases;
	}

	public void setClases(String[] clases) {
		this.clases = clases;
	}

	public String[] getCup() {
		return cup;
	}

	public void setCup(String[] cup) {
		this.cup = cup;
	}

	public String[] getCategorias() {
		return categorias;
	}

	public void setCategorias(String[] categorias) {
		this.categorias = categorias;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TEstado getEstado() {
		return estado;
	}

	public void setEstado(TEstado estado) {
		this.estado = estado;
	}

	public DtFecha getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(DtFecha fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
}
