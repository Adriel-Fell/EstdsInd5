/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

import java.util.ArrayList;

/**
 *
 * @author Adriel
 */
public class Sanduiche {
    private String ingredientes = "O sanduiche é feito de:";

    //Getters e Setters da classe.
    public String getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
    //metodo de mostragem dos ingredientes do sanduiche.
    public void mostrarIngredientes(){
        System.out.println(ingredientes);
    
    }
    
    
    //Metodo de comer o sanduiche, limpando todos os ingredientes, deixando-o vazio.
    public void comerSanduiche(){
        ingredientes = "O sanduiche é feito de:";
    }
    
    
    
}
