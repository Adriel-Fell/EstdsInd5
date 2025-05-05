/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author Adriel
 */
public class Cafe {
    private double preco = 5;
    private String tipo = "Café ";

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //Mostra os valores que o cafe possui
    public void mostrarCafe(){
        System.out.println("O preço do café é: " + preco);
        System.out.println("O tipo do café é: " + tipo);
    }
    
    
}
