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
public class Prestamo implements Comparable<Prestamo>  {

    int id_dep;
    int id_pres;
    int tipo;
    int folio_fac;
    String fecha_pres;
    String fecha_ent;

    public Prestamo() {
    }

    public String agregar() {
        String insert;
        if (this.tipo == 1) {
            insert = "INSERT INTO `prestamo_rec`(`id_dep`, `folio_inicial`, `fecha_prestamo`, `fecha_entrega`)"
                    + " VALUES ('"
                    + this.id_dep + "','"
                    + this.folio_fac + "','"
                    + this.fecha_pres + "','"
                    + this.fecha_ent
                    + "')";
        } else {
            insert = "INSERT INTO `prestamo_fac`(`id_dep`, `id_fac`, `fecha_prestamo`, `fecha_entrega`)"
                    + " VALUES ('"
                    + this.id_dep + "','"
                    + this.folio_fac + "','"
                    + this.fecha_pres + "','"
                    + this.fecha_ent
                    + "')";
        }
        return insert;

    }

    public String modificar() {
        String Update;
        if (this.tipo == 1) {
            Update = "UPDATE `prestamo_rec` SET "
                    + "`fecha_entrega`='"
                    + this.fecha_ent + "'"
                    + " WHERE id_pres="
                    + this.id_pres;
        } else {
            Update = "UPDATE `prestamo_fac` SET "
                    + "`fecha_entrega`='"
                    + this.fecha_ent + "' WHERE id_pres ="
                    + this.id_pres;
        }
        return Update;
    }

    public String buscar() {
        String Select;
        if (this.tipo == 1) {
            Select = "SELECT * FROM `prestamo_rec` WHERE id_pres="
                    + this.id_pres;
        } else {
            Select = "SELECT * FROM `prestamo_fac` WHERE id_pres="
                    + this.id_pres;
        }
        return Select;
    }

    public String eliminar() {
        String Delete;
        if (this.tipo == 1) {
            Delete = "DELETE FROM `prestamo_rec`"
                    + " WHERE `id_pres`='"
                    + this.id_pres + "'";

        } else {
            Delete = "DELETE FROM `prestamo_fac`"
                    + " WHERE `id_pres`='"
                    + this.id_pres + "'";

        }

        return Delete;
    }

    public String verPrestamos() {
        String Select;
        if (this.tipo == 1) {
            Select = "SELECT * FROM `prestamo_rec` WHERE `id_dep`='"
                    + this.id_dep + "'";
        } else {
            Select = "SELECT * FROM `prestamo_fac` WHERE `id_dep`='"
                    + this.id_dep + "'";
        }

        return Select;
    }

    public String finalizar(){
         String Update;
        if (this.tipo == 1) {
            Update = "UPDATE `prestamo_rec` SET "
                    + "`id_dep`='"
                    + this.id_dep + "',"
                    + "`folio_inicial`='"
                    + this.folio_fac + "',"
                    + "`fecha_prestamo`='"
                    + this.fecha_pres + "',"
                    + "`fecha_entrega`='"
                    + this.fecha_ent + "'"
                    + " WHERE id_pres="
                    + this.id_pres;
        } else {
            Update = "UPDATE `prestamo_fac` SET "
                    + "`id_dep`='"
                    + this.id_dep + "',"
                    + "`id_fac`='"
                    + this.folio_fac + "',"
                    + "`fecha_prestamo`='"
                    + this.fecha_pres + "',"
                    + "`fecha_entrega`='"
                    + this.fecha_ent + "' WHERE id_pres ="
                    + this.id_pres;
        }
        return Update;
    }
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public int getId_pres() {
        return id_pres;
    }

    public void setId_pres(int id_pres) {
        this.id_pres = id_pres;
    }

    public int getFolio_fac() {
        return folio_fac;
    }

    public void setFolio_fac(int folio_fac) {
        this.folio_fac = folio_fac;
    }

    public String getFecha_pres() {
        return fecha_pres;
    }

    public void setFecha_pres(String fecha_pres) {
        this.fecha_pres = fecha_pres;
    }

    public String getFecha_ent() {
        return fecha_ent;
    }

    public void setFecha_ent(String fecha_ent) {
        this.fecha_ent = fecha_ent;
    }

    @Override
    public int compareTo(Prestamo o) {
       return this.fecha_pres.compareTo(o.getFecha_pres());
    }

}
