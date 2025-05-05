/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decoratepattern;

/**
 *
 * @author Adriel
 */
public class DecoratePatters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exemplo de aplicação Decorate

        //Declaro as variaveis do café e do decorador
        Cafe cafeBasico = new Cafe();
        CafeDecorator decorator = new CafeDecorator();

        //Chamo os metódos que adicionam propriedades ao meu café Basico
        decorator.adicionarChantilly(cafeBasico);
        decorator.adicionarCuboChocolate(cafeBasico);

        //Mostro os atributos do meu café
        cafeBasico.mostrarCafe();

        /*Repare que todo café basico que eu criar vai ser igual, eu apenas coloco caracteristicas que o cliente
         deseja ao objeto cafeBascio conforme ele deseja. Isso apenas influencia no valor final do produto, neste caso,
         mas, por exemplo, se eu estiver retratando dois computadores, e em um computador eu tiver o leitor de disco, 
         e no outro não, o computador com leitor de disco poderia ser decorado para possuir o metodo "lerDisco()"
        
         */
    }

}
