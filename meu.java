public class meu {

    public double x; /*Campos são variáveis de dados que pertencem a classe ou a objetos de classe;
    Neste caso, é um campo de objetos, que podem ser atribuídos a objetos.*/

    public static double y; /* Neste caso, o campo é um campo estático ou de classe. Por causa do modificador "static" o campo pertence unicamente a classe. */ 

    meu objeto = new meu(); /* Uma entidade/indivíduo que possui estado e comportamento é conhecida como um objeto;
        Objetos são resultados de uma classe e são instância de uma classe;
        Objetos só podem ser acessados via referência a objetos;
        Variáveis que armazenam referência de objetos são conhecidas como tipos de referência; 
        Na maior parte do tempo você pode usar indistintamente "objeto" e "referência a objeto."
        */
}

class cadastro{
    public long nascimento; /* Campo CPF */
    public String Nome; /* Campo Nome */
}

class individuos{
    public static void main(String[] args){

        /**
        Método para definir campos de objetos
        */

        cadastro individuo = new cadastro(); /* Criando objeto indivíduo */

        individuo.nascimento = 02052005; /* Campo CPF para o objeto indivíduo */

        individuo.Nome = "Gerisvaldo"; /* Campo Nome para o objeto indívudo */

    }
}
