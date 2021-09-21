function cambioNavegador( next ) {
	cambiarPerfil( next );
	colorearBoton( next );
}

function cambiarPerfil( next ) {
  var x1 = document.getElementById( "user-consultaInscriptos" );
  var y = document.getElementById( next );
  
  x1.style.display = "none";
  y.style.display = "block";
}

function colorearBoton( next ) {
  var x1 = document.getElementById( "user-consultaInscriptos" );
  var y = document.getElementById( next );
  
  y.focus();
  y.click();
}