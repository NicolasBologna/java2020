package logic;

import java.util.LinkedList;

import data.*;
import entities.*;

public class Login {
	private DataPersona dp;
	private DataRol dr;
	
	public Login() {
		dp=new DataPersona();
	    dr=new DataRol();
	}
	
	public Persona validate(Persona p) {
		/* para hacer m�s seguro el manejo de passwords este ser�a un lugar 
		 * adecuado para generar un hash de la password utilizando un cifrado
		 * asim�trico como sha256 y utilizar el hash en lugar de la password en plano 
		 */
		return dp.getByUser(p);
	}

	public LinkedList<Persona> getAll(){
		return dp.getAll();
	}

	public Persona getByDocumento(Persona per) {
		return dp.getByDocumento(per);
		
	}
	
	public LinkedList<Persona> getBySurname(String surname){
		return dp.getBySurname(surname);
	}
	
	public boolean add(Persona p, int id) {
		return dp.add(p,id);
	
	}
	
	public boolean update(Persona p) {
		return dp.update(p);
		
	}
	
	public boolean delete(Persona p) {
		return dp.delete(p);
		
	}
	
	public LinkedList<Rol> getAllrol(){
		return dr.getAllrol();
		
	}
}