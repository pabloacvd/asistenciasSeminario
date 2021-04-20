package ar.com.xeven;

public class Asistencia { // esto es un bean

    private int id;
    private String nombre;
    private Estado presente;

    public Asistencia() {
    }

    public Asistencia(String nombre, Estado presente) {
        this.nombre = nombre;
        this.presente = presente;
    }

    public Asistencia(int id, String nombre, Estado presente) {
        this.id = id;
        this.nombre = nombre;
        this.presente = presente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getPresente() {
        return presente;
    }

    public void setPresente(Estado presente) {
        this.presente = presente;
    }

    @Override
    public String toString() {
        return "Asitencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", presente=" + presente +
                '}';
    }
}
