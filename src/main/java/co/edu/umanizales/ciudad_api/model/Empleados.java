package co.edu.umanizales.ciudad_api.model;
// AGREGADO
import java.util.ArrayList;
import java.util.List;

public class Empleados {
    private int codigo;
    private String rol;
    private String nombre;
    private List<Empleados> empleados;

    public Empleados(int Codigo , String Rol, String Nombre) {
        this.codigo = Codigo;
        this.nombre= Nombre;
        this.rol= Rol;
    }
    public int getCodigo(){ return this.codigo;}
    public String getNombre() { return this.nombre; }
    public String getRol() { return this.rol;}




}

