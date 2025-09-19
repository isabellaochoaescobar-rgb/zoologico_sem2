package model;

public class Mono extends Animal{

    private String nombre;
    private String identificacion;
    private String zonaZoo;
    private int edad;


    public Mono(String nombre, String id, String nombre1, String nombre2, String identificacion, int edad, String zonaZoo) {
        super(nombre, id, nombre1);
        this.nombre = nombre2;
        this.identificacion = identificacion;
        this.zonaZoo = zonaZoo;
    }

    @Override
    public void hacerSonido(){
        System.out.println("uh, uh, ah, ah");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getZonaZoo() {
        return zonaZoo;
    }

    public void setZonaZoo(String zonaZoo) {
        this.zonaZoo = zonaZoo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
