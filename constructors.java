class Computador{

    /**
     * Campos da Classe Computador (Como se fosse uma TAD)
     */

    private String Modelo;
    private int RAM;
    private int Armazenamento;
    private String CPU;


    public Computador(String Modelo, int RAM, int Armazenamento, String CPU){
        /**
         *CONSTRUTOR = É o cara responsável por criar um objeto. (São os métodos responsáveis por criar o objeto, instanciando a classe que foi definida)
         *Naturalmente nós não o setamos para criar um objto, porém, 
         é possível criar um construtor com parâmetros para criar um objeto 
         com campos intrínsecos a ele
        */
        this.Modelo = Modelo;
        this.RAM = RAM;
        this.Armazenamento = Armazenamento;
        this.CPU = CPU;
    }
}

class Aplicando{
    public static void main(String[] args) {
    
    /**
     * Criando um objeto PC com os campos do construtor Computador
     */
        Computador PC = new Computador("EliteDesk", 16, 256, "Intel i3");
        System.out.println(PC);
    }
}
