package model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Optional;


public class Zoologico {
    private String nombre;
    private ArrayList<Animal> listaAnimales;

    public Zoologico (String nombre){
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
    }

    public String getNombre(){ return nombre;}
    public void setNombre(String nombre){ this.nombre = nombre;}

    public ArrayList<Animal> getListaAnimales(){ return listaAnimales;}
    public void setListaAnimales(ArrayList<Animal> listaAnimales){ this.listaAnimales = listaAnimales;}


    public String registrarAnimal(Animal nuevoAnimal){
        String resultado = "";
        if(buscarAnimal(nuevoAnimal.getId()) == null);{
            listaAnimales.add(nuevoAnimal);
        }
        return resultado;
    }

    public Animal buscarAnimal(String id){
        Animal resultado = null;

        for(int i=0;i<listaAnimales.size() && resultado == null;i++) {
            Animal auxiliar = listaAnimales.get(i);
            if(auxiliar.getId().equals(id)){
                resultado = auxiliar;
            }
        }
        return resultado;

    }

    public String eliminarAnimal(String id){
        Animal animalEncontrado = null;
        animalEncontrado = buscarAnimal(id);
        String resultado = "";

        if(animalEncontrado != null){
            listaAnimales.remove(animalEncontrado);
            resultado = "El animal fue eliminad0 correctamente.";
        }else{
            resultado = "Animal no encontrada.";
        }
        return resultado;
    }

    public void actualizarNombreyId(String id, String nombreNuevo, String idNuevo){

        Animal animalEncontrado = null;
        animalEncontrado = buscarAnimal(id);
        if(animalEncontrado != null){
            animalEncontrado.setNombre(nombreNuevo);
            animalEncontrado.setId(idNuevo);
        }
    }

    public void hacerSonido(){
        if(listaAnimales.isEmpty()){
            System.out.println("No hay animales.");
        }else{
            for(Animal sonido : listaAnimales){
                sonido.hacerSonido();
            }
        }
    }



}
