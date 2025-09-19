package model;

public class Animal extends Zoologico {
    private String nombre;
    private String id;

    public Animal(String nombre, String id, String nombre1) {
        super(nombre);
        this.nombre = nombre1;
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void  hacerSonido();


}
