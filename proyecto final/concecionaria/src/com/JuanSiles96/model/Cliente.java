package com.JuanSiles96.model;

public class Cliente {
    private String nif;
    private String nombre;
    private String direccion;
    private String ciudad;
    private int telefono;

    public Cliente(){

    }

    public Cliente(String nif, String nombre, String direccion, String ciudad, int telefono) {
        this.setNif(nif);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setCiudad(ciudad);
        this.setTelefono(telefono);
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
