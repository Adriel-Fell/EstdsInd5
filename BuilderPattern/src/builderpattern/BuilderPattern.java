/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builderpattern;

/**
 *
 * @author Adriel
 */
public class BuilderPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exemplo da aplicação Builder
        
        //Declaração da variavel builder
        SanduicheBuilder builder = new SanduicheBuilder();
        //Declaração da variavel Sanduiche
        Sanduiche sandubao = new Sanduiche();
        
        //As seguintes linhas de código adicionam os incrementos do sanduiche
        builder.adicionarPao();
        builder.adicionarQueijo();
        builder.adicionarCarne();
        builder.adicionarOvo();
        builder.adicionarCarne();
        builder.adicionarQueijo();
        builder.adicionarPao();
        
        
        //Monta o sanduiche com os ingredientes acima
        sandubao.setIngredientes(builder.montarSanduiche(sandubao.getIngredientes()));

        //Até agora eu montei um sanduiche com 2 carnes, 1 ovo e 2 fatias de queijo, além dos pães, claro.
        
        //Agora eu posso observar como ele ficou chamando um metodo construido na classe Sanduiche
        sandubao.mostrarIngredientes();
        
        //Ou posso partir para comilança
        sandubao.comerSanduiche();
        
        //E agora posso ver que não resta mais sanduiche pois comi todos os ingredientes dele
        sandubao.mostrarIngredientes();
        
        /*Repare que a lógica de montagem da classe Sanduiche se consentra completamente no SanduicheBuilder.
          Isso mostra como podemos construir a classe a partir de outra classe, adicionando ou alterando atributos.
          Assim podemos deixar a parte lógica da classe nela, e sua construção em outro lugar, separando o código 
         em 2 ambientes, melhorando a organização da classe.
        */
        
    }
    
}
