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
public class Recopilador implements  Comparable<Recopilador>{

    int f_inicial;
    int f_final;
    String mes;
    int anio;
    String Localizacion;
    String Banco;
    int no_caja;
    int estado;
    int folio;
    int id_rec;

    public String agregar() {
        String insert;
        insert = "INSERT INTO `recopilador`(`folio_inicial`, `folio_final`, `mes`, `año`, `id_caja`, `localizacion`, `estado`, `banco`) "
                + "VALUES ('"
                + this.f_inicial
                + "','" + this.f_final
                + "','" + this.mes
                + "','" + this.anio
                + "','" + this.no_caja
                + "','" + this.Localizacion
                + "','" + this.estado
                + "','" + this.Banco
                + "')";
        return insert;

    }

    public String modificar() {
        String Update;

        Update = "UPDATE `recopilador` "
                + "SET `folio_inicial`='" + this.f_inicial + "'"
                + ",`folio_final`='" + this.f_final + "'"
                + ",`mes`='" + this.mes + "'"
                + ",`año`='" + this.anio + "'"
                + ",`id_caja`='" + this.no_caja + "'"
                + ",`localizacion`='" + this.Localizacion + "'"
                + ",`estado`='" + this.estado + "'"
                + ",`banco`='" + this.Banco + "'"
                + " WHERE id_rec="
                + "'" + this.id_rec + "'";
        return Update;

    }

    public String eliminar() {
        String Delete;
        Delete = "DELETE FROM `recopilador` WHERE `folio_inicial`='"
                + this.f_inicial + "'";

        return Delete;
    }

    public String buscar() {
        String Select;
        Select = "SELECT * FROM `recopilador` WHERE "
                + "folio_inicial='"
                + this.f_inicial + "' || "
                + "folio_final='"
                + this.f_final + "'";

        return Select;
    }

    public String buscarFolio() {
        String Select;
        Select = "SELECT * FROM `recopilador` WHERE "
                + "folio_inicial <='"
                + this.folio + "' && "
                + "folio_final >='"
                + this.folio + "'";

        return Select;
    }

    public String mostrar() {
        String Select;
        Select = "SELECT * FROM `recopilador` WHERE "
                + "año ='"
                + this.anio+ "' && "
                + "banco ='"
                + this.Banco+ "'";

        return Select;
    }

    public String estado() {
        String Update;

        Update = "UPDATE `recopilador` "
                + "SET"
                + "`estado`='" + this.estado + "'"
                + " WHERE folio_inicial="
                + "'" + this.f_inicial + "'";
        return Update;
    }

    public Recopilador() {
    }

    public int getId_rec() {
        return id_rec;
    }

    public void setId_rec(int id_rec) {
        this.id_rec = id_rec;
    }

    public String getBanco() {
        return Banco;
    }

    public void setBanco(String Banco) {
        this.Banco = Banco;
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public int getF_inicial() {
        return f_inicial;
    }

    public void setF_inicial(int f_inicial) {
        this.f_inicial = f_inicial;
    }

    public int getF_final() {
        return f_final;
    }

    public void setF_final(int f_final) {
        this.f_final = f_final;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getLocalizacion() {
        return Localizacion;
    }

    public void setLocalizacion(String Localizacion) {
        this.Localizacion = Localizacion;
    }

    public int getNo_caja() {
        return no_caja;
    }

    public void setNo_caja(int no_caja) {
        this.no_caja = no_caja;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Recopilador o) {
        return (this.f_inicial- o.getF_inicial());  
                }

}
