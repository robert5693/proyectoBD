/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author root
 */
public class Cliente {
    int cedula;
    String nombre;
    int telefono;
    int tarjeta_id;

    public Cliente(int ced, String nom, int telf, int tarjeta_id){
      this.cedula = ced;
      this.nombre = nom;
      this.telefono = telf;
      this.tarjeta_id = tarjeta_id;
    }

    public int getCedula(){
      return cedula;
    }

    public String getNombre(){
      return nombre;
    }

    public int getTelefono(){
      return telefono;
    }

    public int getTarjeta_id(){
      return tarjeta_id;
    }

    public void setNombre(String nom){
      this.nombre = nom;
    }
}
