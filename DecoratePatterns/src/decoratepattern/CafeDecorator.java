/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author Adriel
 */
public class CafeDecorator {

    public void adicionarChantilly(Cafe cafe) {
        //Declaro uma variavel cafe com chantilly
        Cafe cafeComChantilly = new Cafe();
        
        //Atribuo os valores adicionais do chantilly em relação ao café
        cafeComChantilly.setPreco(2);
        cafeComChantilly.setTipo("+ Chantilly ");
        
        //Adiciono o preço do café com chantilly ao valor original
        cafe.setPreco(cafe.getPreco() + cafeComChantilly.getPreco());
        
        //Adiciono o tipo do café ao café original
        cafe.setTipo(cafe.getTipo() + cafeComChantilly.getTipo());
    }

    public void adicionarLeite(Cafe cafe) {
        //Declaro uma variavel cafe com leite
        Cafe cafeComLeite = new Cafe();
        //Coloco o preço adicional do leite
        cafeComLeite.setPreco(0.5);
        //Adiciono o leite ao tipo do café
        cafeComLeite.setTipo("+ Leite ");

        //Adiciono o preço do café com chantilly ao valor original
        cafe.setPreco(cafe.getPreco() + cafeComLeite.getPreco());
        
        //Adiciono o tipo do café ao café original
        cafe.setTipo(cafe.getTipo() + cafeComLeite.getTipo());
    }

    public void adicionarCanela(Cafe cafe) {
        //Declaro uma variavel cafe com canela
        Cafe cafeComCanela = new Cafe();
        //Adiciono o preço adicional do canela
        cafeComCanela.setPreco(1);
        //Adiciono a canela ao tipo do café
        cafeComCanela.setTipo("+ Canela ");

        //Adiciono o preço do café com chantilly ao valor original
        cafe.setPreco(cafe.getPreco() + cafeComCanela.getPreco());
        
        //Adiciono o tipo do café ao café original
        cafe.setTipo(cafe.getTipo() + cafeComCanela.getTipo());
    }

    public void adicionarCuboChocolate(Cafe cafe) {
        //Declaro uma variavel cafe com chocolate
        Cafe cafeComChocolate = new Cafe();
        //Adiciono o preço adicional do cubo de chocolate
        cafeComChocolate.setPreco(0.5);
        //Adiciono o chocolate ao tipo do café
        cafeComChocolate.setTipo("+ Cubo de Chocolate ");

        //Adiciono o preço do café com chantilly ao valor original
        cafe.setPreco(cafe.getPreco() + cafeComChocolate.getPreco());
        
        //Adiciono o tipo do café ao café original
        cafe.setTipo(cafe.getTipo() + cafeComChocolate.getTipo());
    }

}
