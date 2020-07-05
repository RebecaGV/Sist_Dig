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
public class Factura {

    int id;
    int id_fac;
    int tipo;
    int proveedor;
    int estado;

    public Factura() {
    }

    public String agregar() {
        String insert;
        insert = "INSERT INTO `factura`(`id_fac`, `proveedor`, `tipo`) VALUES "
                + "('"
                + this.id_fac + "','"
                + this.proveedor + "','"
                + this.tipo
                + "')";
        return insert;

    }

    public String modificar() {
        String Update;

        Update = "UPDATE `factura` SET "
                + "`id_fac`='"
                + this.id_fac + "',"
                + "`proveedor`='"
                + this.proveedor + "',"
                + "`tipo`='"
                + this.tipo + "' WHERE id='"
                + this.id + "'";
        return Update;

    }

    public String eliminar() {
        String Delete;
        Delete = "DELETE FROM `factura`"
                + " WHERE `id`='"
                + this.id + "'";

        return Delete;
    }

    public String buscar() {
        String Select;
        Select = "SELECT * FROM `factura`"
                + " WHERE `id`='"
                + this.id + "' || "
                + "id_fac='"
                + this.id_fac + "'";

        return Select;
    }

    public String estado() {
        String Update;

        Update = "UPDATE `factura` "
                + "SET"
                + "`estado`='" + this.estado + "'"
                + " WHERE id_fac="
                + "'" + this.id_fac + "'";
        return Update;
    }
    
    public String mostrar() {
        String Select;
        Select = "SELECT * FROM `factura`"
                + " WHERE `tipo`='"
                + this.tipo+ "'";

        return Select;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_fac() {
        return id_fac;
    }

    public void setId_fac(int id_fac) {
        this.id_fac = id_fac;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }

}
