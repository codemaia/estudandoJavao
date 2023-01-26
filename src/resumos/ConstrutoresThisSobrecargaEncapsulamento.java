package resumos;

public class ConstrutoresThisSobrecargaEncapsulamento {

	public static void main(String[] args) {
	
		//CONSTRUTORES ######################
		
		/**
		 * É Executado a partir do comando new ...
		 * 
		 * É uma operação especial da classe, que executa no momento da
		 * instanciação do objeto
		 * 
		 * 
		 * USOS COMUNS:
		 * # Iniciar valores dos atributos
		 * 
		 * # Permitir ou obrigar que o objeto receba dados / 
		 * 	 dependencias no momento de sua instanciação(injeção de dependencia)
		 * 
		 * Se um construtor customizado não for especificado, a classe
		 * 	disponibiliza o construtor padrão:
		 * 		EX: Product p = new Product();
		 * 
		 *  É Possivel especificar mais de um construtor na mesma classe(sobrecarga)
		 *  
		 *  
		 *  
		 *  // FEITA ALTERAÇÃO NO PROGRAMA:
		 *  
		 *  	ProgramProduct
		 *  
		 *  // FEITA ALTERAÇÃO NA CLASSE:
		 *  		entities
		 *  	Product
		 *  
		 *  -- PARA ADICIONAR OS CONSTRUTORES;
		 *  	
		 *  	
		 */
		
		
		
		
		//PALAVRA THIS ######################
		
		
		/**
		 * THIS serve para diferenciar o atributo do objeto do parametro do constructor
		 * 
		 * THIS é uma referencia para o proprio objeto
		 * 
		 * USOS COMUNS:
		 * 	Diferenciar atributos de variaveis locais
		 * 	Passar o proprio objeto como argumento na chamada
		 * 		de um metodo ou construtor
		 * 
		 * 
		 */

		
		
		
		//SOBRECARGA ######################
		
		/**
		 * SOBRECARGA é um recurso que uma classe possui de oferecer mais de uma
		 * 	operação com o mesmo nome, porém com diferentes listas de parâmetros.
		 * 
		 * Nota: é possível também incluir um construtor padrão
		 * 
		 * 
		 */
		
		
		
		
		//EMCAPSULAMENTO ######################
		
		/*
		 * EMCAPSULAMENTO é um principio que consiste em esconder detalhes de implementação
		 *  de uma classe, expondo apenas operações seguras e que mantenham os objetos em
		 *  um estado consistente
		 *  
		 *  REGRA DE OURO: O objeto deve sempre estar em um estado consistente, e a própria
		 *   classe deve garantir isso.
		 *   
		 *   ANALOGIA: UM APARELHO DE SOM
		 *   # ficam expostas para o usuario somente as opções que nao vao danificar o aparelho
		 *   como: tocar CD, passar musica, retroceder musica, pausar e etc.
		 *   
		 *   # as partes de circuito ficam escondidas para que o usuário não faça algo de errado
		 *    e até queime o aparelho
		 *    
		 *    
		 *   # REGRA BASICA:
		 *   
		 *   -> Um objeto NÃO deve expor nenhum atributo (modificador de acesso PRIVATE)
		 *   -> Os atributos devem ser acessados por meio de métodos get e set
		 *   	- Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans
		 *   
		 *   
		 *   
		 *   ## FEITA ALTERAÇÃO NO PROGRAMA: 
		 *   
		 *   	ProgramProduct
		 *   
		 *   ## FEITA ALTERAÇÃO NA CLASSE:
		 *   
		 *   	Product
		 *   
		 *   ## PARA FAZER O EMCAPSULAMENTO (get e set)
		 * 
		 */
		
		
		
	
		
		
		

	}

}
