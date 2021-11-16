package logica.persistencia.Entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * Entity implementation class for Entity: Registros
 *
 */


@Entity
@Table(name = "REGISTROS")
public class Registros implements Serializable {
    private static final long serialVersionUID = 1L;
    //@EmbeddedId
    //private RegistrosId primaryKey;
    
    //@Embeddable
    //private class RegistrosId {
    	@Id
		@ManyToOne(fetch = FetchType.EAGER,
     		   	   cascade=CascadeType.PERSIST)
        @JoinColumn(name = "ID_SOCIO")
        private Socios socio;
        
    	@Id
    	@ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "ID_CLASE")
        private Clases clase;
        
		
		public Socios getSocio() {
			return socio;
		}

		public void setSocio(Socios socio) {
			this.socio = socio;
		}

		public Clases getClase() {
			return clase;
		}

		public void setClase(Clases clase) {
			this.clase = clase;
		}


    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_REGISTRO")
    private Calendar fechaRegistro;
    
    @Column(name = "COSTO")
    private Float costo;
    
    public Long getIdSocio() {
        return socio.getId();
    }

    public void setId(Long idSocio) {
    	socio.setId(idSocio);;
    }
    
    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    /*public Socios getSocio() {
		return primaryKey.getSocio();
	}

	public void setSocio(Socios socio) {
		primaryKey.setSocio(socio);
	}

	public Clases getClase() {
		return primaryKey.getClase();
	}

	public void setClase(Clases clase) {
		primaryKey.setClase(clase);
	}*/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getIdSocio() != null ? this.getIdSocio().hashCode() : 0); //ojo
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registros)) {
            return false;
        }
        Registros other = (Registros) object; //ojo
        if ((this.getIdSocio() == null && other.getIdSocio() != null) || (this.getIdSocio() != null && !this.getIdSocio().equals(other.getIdSocio()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Registros[idSocio=" + getIdSocio() +
        		", " + "nadadada" +
        		", " + fechaRegistro +
        		", " + costo +
                "]";
    }

    
}

