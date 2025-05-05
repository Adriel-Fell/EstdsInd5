/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Adriel
 */
public class SanduicheBuilder {

    //Declaro minha variavel ingredientes como vazia.
    private String ingredientes = "";

    //Os seguintes metodos compoem a montagem do saunduiche, apenas concatenando seu respectivo ingrediente na string
    public String adicionarPao() {
        ingredientes = ingredientes + " pão;";
        return ingredientes;
    }

    public String adicionarAlface() {
        ingredientes = ingredientes + " alface;";
        return ingredientes;
    }

    public String adicionarTomate() {
        ingredientes = ingredientes + " tomate;";
        return ingredientes;
    }

    public String adicionarQueijo() {
        ingredientes = ingredientes + " queijo;";
        return ingredientes;
    }

    public String adicionarMortadela() {
        ingredientes = ingredientes + " mortadela;";
        return ingredientes;
    }

    public String adicionarCarne() {
        ingredientes = ingredientes + " carne;";
        return ingredientes;
    }

    public String adicionarOvo() {
        ingredientes = ingredientes + " ovo;";
        return ingredientes;
    }

    public String adicionarKetchup() {
        ingredientes = ingredientes + " ketchup;";
        return ingredientes;
    }

    public String adicionarMostarda() {
        ingredientes = ingredientes + " mostarda;";
        return ingredientes;
    }

    public String adicionarMaionese() {
        ingredientes = ingredientes + " maionese;";
        return ingredientes;
    }

    //Monta o sanduiche, retornando os ingredientes
    public String montarSanduiche(String sanduba) {
        String sanduiche = sanduba + ingredientes;
        ingredientes = "";
        return sanduiche;
    }

}
