package model;

public class Lobo extends Animal {
    private String nombre;
    private String id;
    private String zonaZoo;
    private int edad;

    public Lobo(String nombre, String id, String nombre1, String nombre2, String id1, String zonaZoo, int edad) {
        super(nombre, id, nombre1);
        this.nombre = nombre2;
        this.id = id1;
        this.zonaZoo = zonaZoo;
        this.edad = edad;
    }


    @Override
    public void hacerSonido(){
        System.out.println("Auuu");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
