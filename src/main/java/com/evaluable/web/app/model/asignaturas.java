package com.evaluable.web.app.model;


public class asignaturasController {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int numeroCreditos; //entre 3 y 12
	private int alumnosMatriculados; //inicialmente 0
	private String tipo;
	
	public asignaturasController(int id, String nombre, String descripcion, int numeroCreditos,String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		if (numeroCreditos < 3) {
			this.numeroCreditos = 3;
		} else if (numeroCreditos > 12) {
			this.numeroCreditos = 12;
		} else {
			this.numeroCreditos = numeroCreditos;
		}
		this.alumnosMatriculados = 0;
		this.tipo = tipo;
    }
	
	public int getId() {
		return id;
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public int getAlumnosMatriculados() {
        return alumnosMatriculados;
    }
    
    public void setalumnosMatriculados(int alumnosMatriculados) {
    	this.alumnosMatriculados = alumnosMatriculados;
    }
    
    public String getTipo() {
    	return tipo;
    }
    public void setTipos (String tipo) {
    	this.tipo = tipo;
    }
	
	
}
