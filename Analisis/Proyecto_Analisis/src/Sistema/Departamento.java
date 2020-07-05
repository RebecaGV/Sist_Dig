/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

/**
 *
 * @author flore
 */
public class Departamento {
    int id_dep;
    String nom_encargado;

    public Departamento() {
    }
    
    public String encargado(){
        String Select;
        Select = "SELECT encargado FROM `departamento` WHERE id_dep="
                + this.id_dep ;

        return Select;
    }
   
    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public String getNom_encargado() {
        return nom_encargado;
    }

    public void setNom_encargado(String nom_encargado) {
        this.nom_encargado = nom_encargado;
    }
    
}
