package model;

public class Pantera extends Animal {
    private String nombre;
    private int nBigotes;
    private String identificacion;
    private String zonaZoo;
    private int edad;

    public Pantera(String nombre, String id, String nombre1, String nombre2, int nBigotes, String identificacion, String zonaZoo, int edad) {
        super(nombre, id, nombre1);
        this.nombre = nombre2;
        this.nBigotes = nBigotes;
        this.identificacion = identificacion;
        this.edad = edad;
        this.zonaZoo = zonaZoo;
    }

    @Override
    public void hacerSonido(){
        System.out.println("rrr-ahh, rrr-ahh");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnBigotes() {
        return nBigotes;
    }

    public void setnBigotes(int nBigotes) {
        this.nBigotes = nBigotes;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
