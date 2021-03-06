package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.9
 * 2021-11-09T16:09:53.081-03:00
 * Generated source version: 2.7.9
 * 
 */
@WebService(targetNamespace = "http://webServices/", name = "WSActividadController")
@XmlSeeAlso({ObjectFactory.class, net.java.dev.jaxb.array.ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WSActividadController {

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public DtClaseWS seleccionarClase(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1,
        @WebParam(partName = "arg2", name = "arg2")
        java.lang.String arg2
    ) throws ActividadDeportivaException_Exception, ClaseException_Exception, InstitucionException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerCategorias();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerActividades(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    ) throws InstitucionException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerActDepIngresadas();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public DtInstitucionWS obtenerDatosInstitucion(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    ) throws InstitucionException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerDeltaInstituciones(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1
    ) throws InstitucionException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public DtActividadWS getActDepExt(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1
    ) throws ActividadDeportivaException_Exception, InstitucionException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerSocios();

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public DtActividadWS buscarActDep(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    ) throws ActividadDeportivaException_Exception;

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public net.java.dev.jaxb.array.StringArray obtenerInstituciones();

    @WebMethod
    public void finalizarActividad(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    );

    @WebMethod
    @WebResult(name = "return", targetNamespace = "http://webServices/", partName = "return")
    public boolean ingresarDatosActividadDep(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0,
        @WebParam(partName = "arg1", name = "arg1")
        DtActividadWS arg1
    ) throws ActividadDeportivaException_Exception, InstitucionException_Exception;
}
