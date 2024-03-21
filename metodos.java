public class App{
    public static int quantos_pares(int limite){
        /**
        Método para contar a quantidade de números pares entre dois números
        É público, estático e retorna uma variável do tipo int
        Tem um parâmetro do tipo int chamado "limite"
        */
        int retorno = 0; /* Variável de retorno */
        for(int i = 1; i<=limite; i++){
            if (i % 2 == 0)
                retorno++;
        }
        return retorno; /* Retorno */
    }
}
class teste{
    public static void main(String[] args) {
        System.out.println("A quantidade de números pares entre 1 e 100 é " + App.quantos_pares(100));
        /* Chamada do método: Nome_da_classe.nome_do_método(Parâmetros) */
    }
}
