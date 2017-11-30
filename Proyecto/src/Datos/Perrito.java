package Datos;

import java.io.FileInputStream;

public class Perrito {

    public int Id;
    public String Raza;
    public String Descripcion;
    public FileInputStream fis;
    public long longitudByteFoto;

    public Perrito() {
    }

    public int getId() {
        return Id;
    }

    public Perrito(int Id, String Raza) {
        this.Id = Id;
        this.Raza = Raza;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the fis
     */
    public FileInputStream getFis() {
        return fis;
    }

    /**
     * @param fis the fis to set
     */
    public void setFis(FileInputStream fis) {
        this.fis = fis;
    }

    /**
     * @return the longitudByteFoto
     */
    public long getLongitudByteFoto() {
        return longitudByteFoto;
    }

    /**
     * @param longitudByteFoto the longitudByteFoto to set
     */
    public void setLongitudByteFoto(long longitudByteFoto) {
        this.longitudByteFoto = longitudByteFoto;
    }

    public String toString() {
        return this.Raza;
    }
}
