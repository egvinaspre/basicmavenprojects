package es.egv.core.jsf2webapp.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class holamundoBean implements Serializable {

	/** Serial Version UID generado*/
	private static final long serialVersionUID = 2410731828542102979L;

	/** Nombre que vamos a recoger en la pantalla hola y vamos a mostrar en la pantalla bienvenida. */
	private String nombre;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
