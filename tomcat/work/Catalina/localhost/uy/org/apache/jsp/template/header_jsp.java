/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-11-11 02:55:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import servlets.Login;
import datatypes.DtUsuarioExt;
import datatypes.DtProfesorExt;
import java.util.Set;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 @SuppressWarnings("unchecked") 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("servlets.Login");
    _jspx_imports_classes.add("datatypes.DtUsuarioExt");
    _jspx_imports_classes.add("datatypes.DtProfesorExt");
    _jspx_imports_classes.add("java.util.Set");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav id=\"header\" class=\"col-12 navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand fs-2 me-5 mb-2 mt-2 text-primary\" href=\"");
      out.print(request.getContextPath());
      out.write("/home\">\r\n");
      out.write("            <img src=\"");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/iconoEntrenamos-uy.png\" alt=\"EUimg\" width=\"40\" height=\"30\" class=\"d-inline-block align-text-top img-fluid me-2 ms-2 mb-3\">\r\n");
      out.write("            Entrenamos.uy\r\n");
      out.write("        </a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <form class=\"d-flex me-5 pe-5 container-fluid\" action=\"");
      out.print(request.getContextPath());
      out.write("/search?actividades=yes&cuponeras=yes\" method=\"POST\">\r\n");
      out.write("            <input class=\"form-control me-2\" type=\"search\" id=\"campoTexto\" name=\"campoTexto\" placeholder=\"Actividades Deportivas,  Cuponeras\" aria-label=\"Search\">\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-outline-primary\">Buscar</button>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        ");
 if (request.getSession().getAttribute("loggedUser")==null){ 
      out.write("\r\n");
      out.write("        <ul id=\"nav-iniReg\"  class=\"navbar-nav me-auto mb-2 mb-lg-0 d-flex text-right\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <button type=\"button\" id=\"btn-inicio-sesion\" class=\"btn-ir btn btn-primary mt-3 ms-3 mb-3\" data-bs-toggle=\"modal\" data-bs-target=\"#inicioSesionModal\">\r\n");
      out.write("                Iniciar Sesion\r\n");
      out.write("              </button>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("              <button type=\"button\" id=\"btn-registrarse\" class=\"btn-ir btn btn-primary mt-3 ms-3 mb-3\" data-bs-toggle=\"modal\" data-bs-target=\"#registroModal\">\r\n");
      out.write("                Registrarse\r\n");
      out.write("              </button>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        ");
 } else { 
        	DtUsuarioExt u = (DtUsuarioExt)request.getSession().getAttribute("loggedUser");
        	String f = "default.png";
        	if (u.getImagen()!=null)
        		f = new String(u.getImagen(), "UTF-8");
        		
        
      out.write("\r\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 d-flex text-right\">\r\n");
      out.write("               <li id=\"wtm\">\r\n");
      out.write("            		<a href=\"");
      out.print(request.getContextPath());
      out.write("/usuarios?nickname=");
      out.print(u.getNickname());
      out.write("\"><img id=\"profilePicCreator\" \r\n");
      out.write("            		onerror=\"this.onerror=null; this.src='");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/loading.gif'\" alt=\"");
      out.print(u.getNickname());
      out.write("\" id=\"img-perfil\" src=\"");
      out.print(request.getContextPath());
      out.write("/api/content?c=usu&id=");
      out.print(u.getNickname());
      out.write("\"></img></a>\r\n");
      out.write("           	   </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0 d-flex text-right\">\r\n");
      out.write("               <li>\r\n");
      out.write("               	 <form id=\"logout-session\" action=\"");
      out.print(request.getContextPath());
      out.write("/api/logout\" method=\"GET\">\r\n");
      out.write("                 	<button class=\"btn-ir btn btn-primary mt-3 ms-3 mb-3\" type=\"submit\">\r\n");
      out.write("                   		Cerrar Sesion\r\n");
      out.write("                 	</button>\r\n");
      out.write("                 </form>\r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>        \r\n");
      out.write("        ");
 } 
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
 if (request.getSession().getAttribute("loggedUser")==null){ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--MODAL INICIAR SESION-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"inicioSesionModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("          <div class=\"modal-content\">\r\n");
      out.write("              <div class=\"modal-header\">\r\n");
      out.write("                  <img src=\"");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/iconoEntrenamos-uy.png\" alt=\"EntrenamosUYLogo\" width=\"40\" height=\"30\" class=\"d-inline-block align-text-top img-fluid me-2 ms-2 mb-3\">\r\n");
      out.write("                  <h2 class=\"fw-bold mb-0\">Entrenamos.uy</h2>\r\n");
      out.write("                  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-body\">\r\n");
      out.write("                  <form id=\"formulario-sesion\" action=\"");
      out.print(request.getContextPath());
      out.write("/login\" method=\"POST\" onsubmit=\"return login()\" data-root=\"");
      out.print(request.getContextPath());
      out.write("\"> \r\n");
      out.write("                      <div class=\"form-floating mb-3\">\r\n");
      out.write("                          <input type=\"text\" class=\"form-control rounded-4\" id=\"user\" name=\"nick-login\" placeholder=\"name@example.com\">\r\n");
      out.write("                          <label for=\"user\">Correo electrónico / Nickname</label>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"form-floating mb-3\">\r\n");
      out.write("                          <input type=\"password\" class=\"form-control rounded-4\" id=\"pass\" name=\"pass-login\" placeholder=\"Password\">\r\n");
      out.write("                          <label for=\"pass\">Contraseña</label>                  \r\n");
      out.write("                      </div>\r\n");
      out.write("                      <input style=\"display: none;\" class=\"form-control miurl\" name=\"miurl\" type=\"text\">\r\n");
      out.write("                      <button class=\"w-100 mb-2 btn btn-lg rounded-4 btn-primary\" type=\"submit\">Iniciar Sesión</button>\r\n");
      out.write("                  </form>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"modal-footer\">\r\n");
      out.write("                  <hr class=\"my-6\">\r\n");
      out.write("                  <div>\r\n");
      out.write("                      <i>Aún no tienes cuenta? </i>\r\n");
      out.write("                      <a id=\"regLink\" href=\"#\">Registrarte Aquí</a>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!--MODAL REGISTRO-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"registroModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("      <div class=\"modal-dialog\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <img src=\"");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/iconoEntrenamos-uy.png\" alt=\"EntrenamosUYLogo\" width=\"40\" height=\"30\" class=\"d-inline-block align-text-top img-fluid me-2 ms-2 mb-3\">\r\n");
      out.write("                <h2 class=\"fw-bold mb-0\">Unéte a Entrenamos.uy</h2>\r\n");
      out.write("                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <form id=\"formulario-registro\" action=\"");
      out.print(request.getContextPath());
      out.write("/signup\" method=\"POST\" data-root=\"");
      out.print(request.getContextPath());
      out.write("\" onsubmit=\"return registrarse()\" accept-charset=\"UTF-8\" enctype=\"multipart/form-data\">\r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <h5>Que eres?</h5>\r\n");
      out.write("                        <div id=\"socioRadio\" class=\"form-check float-left\">\r\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"tipoU\" value=\"0\" name=\"radioSocio\" id=\"radioSocio\" checked>\r\n");
      out.write("                            <label class=\"form-check-label\" for=\"radioSocio\">\r\n");
      out.write("                            Socio\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"profeRadio\" class=\"form-check float-left\">\r\n");
      out.write("                            <input class=\"form-check-input\" type=\"radio\" name=\"tipoU\" value=\"1\" name=\"radioProfe\" id=\"radioProfe\">\r\n");
      out.write("                            <label class=\"form-check-label\" for=\"radioProfe\">\r\n");
      out.write("                            Profesor\r\n");
      out.write("                            </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control rounded-4\" id=\"nickk\" name=\"nickk\" >\r\n");
      out.write("                        <label for=\"nickk\">Nickname</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"email\" class=\"form-control rounded-4\" id=\"emaill\" name=\"emaill\">\r\n");
      out.write("                        <label for=\"emaill\">Correo electrónico</label>                  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control rounded-4\" id=\"pas1\" name=\"pas1\">\r\n");
      out.write("                        <label for=\"pas1\">Contraseña</label>                  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"password\" class=\"form-control rounded-4\" id=\"pas2\" name=\"pas2\">\r\n");
      out.write("                        <label for=\"pas2\">Confirmar Contraseña</label>                  \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h5>Sobre ti</h5>\r\n");
      out.write("                    <div id=\"nombreCompletoDiv\" class=\"row form-floating mb-3\">\r\n");
      out.write("                        <div id=\"divNombre\" class=\"col-6 form-check float-left\">\r\n");
      out.write("                            <div class=\"form-floating mb-2\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control rounded-4\" id=\"nomm\" name=\"nomm\">\r\n");
      out.write("                                <label for=\"nomm\">Nombre</label>           \r\n");
      out.write("                            </div>      \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id=\"divApellido\" class=\"col-6 form-check float-left\">\r\n");
      out.write("                            <div class=\"form-floating mb-2\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control rounded-4\" id=\"ape\" name=\"ape\" >\r\n");
      out.write("                                <label for=\"ape\">Apellido</label>           \r\n");
      out.write("                            </div>                           \r\n");
      out.write("                        </div>             \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"date\" class=\"form-control rounded-4\" id=\"nac\" name=\"nac\" >\r\n");
      out.write("                        <label for=\"nomm\">Fecha de nacimiento</label>     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"institDiv\" class=\"form-floating mb-3\">\r\n");
      out.write("                        <select name=\"instit\" id=\"instit\" class=\"form-select\" data-live-search=\"true\">\r\n");
      out.write("							  ");

							  Set<String> s = (Set<String>)request.getAttribute("stdInstituciones");
							  for (String t: s){ 
      out.write("\r\n");
      out.write("                            <option data-tokens=\"");
      out.print(t);
      out.write('"');
      out.write('>');
      out.print(t);
      out.write("</option>\r\n");
      out.write("                        ");
 } 
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <label for=\"instit\">Institución asociada</label>                               \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"descDiv\" class=\"form-group form-floating mb-3\">\r\n");
      out.write("                        <textarea class=\"form-control\" id=\"desc\" rows=\"15\" oninput='this.style.height = \"\";this.style.height = this.scrollHeight +3+ \"px\"' name=\"descRU\" ></textarea>\r\n");
      out.write("                        <label for=\"desc\">Descripción</label>     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"bioDiv\" class=\"form-group form-floating mb-3\">\r\n");
      out.write("                        <textarea class=\"form-control\" id=\"bio\" rows=\"15\" oninput='this.style.height = \"\";this.style.height = this.scrollHeight +3+ \"px\"' name=\"bioRU\" ></textarea>\r\n");
      out.write("                        <label for=\"desc\">Biografía <i style=\"font-size:0.7rem;\"> (opcional)</i></label>     \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"webDiv\" class=\"form-floating mb-3\">\r\n");
      out.write("                        <input type=\"text\" class=\"form-control rounded-4\" id=\"webs\" name=\"websRU\" >\r\n");
      out.write("                        <label for=\"webs\">Sitio web <i style=\"font-size:0.7rem;\"> (opcional)</i></label>\r\n");
      out.write("                    </div>\r\n");
      out.write("					<div class=\"mb-3\">\r\n");
      out.write("					  <label for=\"formFile\" class=\"form-label\">Imagen de perfil <i style=\"font-size:0.7rem;\"> (opcional)</i></label>\r\n");
      out.write("					  <input class=\"form-control\" type=\"file\" id=\"imgPerfil\" name=\"imgPerfil\" accept=\".jpg, .jpeg, .png, .webp, .gif, .tiff\">\r\n");
      out.write("					</div>\r\n");
      out.write("					<input style=\"display: none;\" class=\"form-control miurl\" name=\"miurl\" type=\"text\">\r\n");
      out.write("                    <button class=\"w-100 mb-2 btn btn-lg rounded-4 btn-primary\" type=\"submit\">Registrarse</button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <hr class=\"my-6\">\r\n");
      out.write("                <div>\r\n");
      out.write("                    <i>Ya tienes cuenta? </i>\r\n");
      out.write("                    <a id=\"iniLink\" href=\"#\">Inicia Sesión Aquí</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
 } else{
	DtUsuarioExt u = (DtUsuarioExt)request.getSession().getAttribute("loggedUser");
	if (u instanceof DtProfesorExt){ 
      out.write("\r\n");
      out.write("    <div class=\"modal fade\" id=\"altaActModal\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <img src=\"");
      out.print(request.getContextPath());
      out.write("/assets/images/misc/iconoEntrenamos-uy.png\" alt=\"EntrenamosUYLogo\" width=\"40\" height=\"30\" class=\"d-inline-block align-text-top img-fluid me-2 ms-2 mb-3\">\r\n");
      out.write("                    <h2 class=\"fw-bold mb-0\">Alta Actividad Deportiva</h2>\r\n");
      out.write("                    <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <form id=\"formulario-altaAD\" action=\"");
      out.print(request.getContextPath());
      out.write("/alta_ad\" data-root=\"");
      out.print(request.getContextPath());
      out.write("\" method=\"post\" onsubmit=\"return altaAD()\" enctype=\"multipart/form-data\" accept-charset=\"UTF-8\">\r\n");
      out.write("                        <div class=\"form-floating mb-3\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control rounded-4\" name=\"nombreAD\" id=\"nombreAD\" placeholder=\"\">\r\n");
      out.write("                            <label for=\"floatingInput\">Nombre</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                                            <div id=\"descDiv\" class=\"form-group form-floating mb-3\">\r\n");
      out.write("                        <textarea class=\"form-control\" name=\"descAD\" id=\"descAD\" rows=\"15\" oninput='this.style.height = \"\";this.style.height = this.scrollHeight +3+ \"px\"' ></textarea>\r\n");
      out.write("                        <label for=\"desc\">Descripción</label>     \r\n");
      out.write("                    </div>\r\n");
      out.write("                        <div id=\"nombreCompletoDiv\" class=\"row form-floating mb-3\">\r\n");
      out.write("                            <div id=\"divNombre\" class=\"col-6 form-check float-left\">\r\n");
      out.write("                                <div class=\"form-floating mb-2\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control rounded-4\" name=\"costoAD\" id=\"costoAD\" >\r\n");
      out.write("                                    <label for=\"nomm\">Costo</label>           \r\n");
      out.write("                                </div>      \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"divApellido\" class=\"col-6 form-check float-left\">\r\n");
      out.write("                                <div class=\"form-floating mb-2\">\r\n");
      out.write("                                    <input type=\"number\" class=\"form-control rounded-4\" name=\"durAD\" id=\"durAD\" >\r\n");
      out.write("                                    <label for=\"ape\">Duración <i style=\"font-size:0.7rem;\"> (min)</i></label>           \r\n");
      out.write("                                </div>                           \r\n");
      out.write("                            </div>           \r\n");
      out.write("                         </div>  \r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("						  <label for=\"formFile\" class=\"form-label\">Imagen asociada <i style=\"font-size:0.7rem;\"> (opcional)</i></label>\r\n");
      out.write("						  <input class=\"form-control\" type=\"file\" name=\"imgAD\" id=\"imgAD\" accept=\".jpg, .jpeg, .png, .webp, .gif, .tiff\">\r\n");
      out.write("						</div>\r\n");
      out.write("                        <div id=\"catDiv\" class=\"form-floating mb-3\">\r\n");
      out.write("                        <p>Categorías asociadas <i style=\"font-size:0.7rem;\"> (opcional)</i></p>\r\n");
      out.write("							<select style=\"width:29em;\" name=\"catAD\" id=\"catAD\" class=\"cat\" multiple aria-label=\"multiple select example\">\r\n");
      out.write("							  ");

							  Set<String> s = (Set<String>)request.getAttribute("stdCategorias");
							  for (String x: s){ 
      out.write("\r\n");
      out.write("							  	<option value=\"");
      out.print(x);
      out.write('"');
      out.write('>');
      out.print(x);
      out.write("</option>\r\n");
      out.write("							  ");
} 
      out.write("\r\n");
      out.write("							</select>                          \r\n");
      out.write("                    </div>\r\n");
      out.write("                        <input style=\"display: none;\" class=\"form-control miurl\" name=\"miurl\" type=\"text\">\r\n");
      out.write("                        <button class=\"w-100 mb-2 btn btn-lg rounded-4 btn-primary\" type=\"submit\">Confirmar Registro</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <hr class=\"my-6\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <i>Entrenamos.uy - Alta Actividad Deportiva</i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("	");
} 
      out.write('\r');
      out.write('\n');
}
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
