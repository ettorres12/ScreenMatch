package br.com.alura.screenmatch.modelos;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Poderoso Chefão");
        ;
        meuFilme.setAnoDeLancamento(1999);
        ;
        meuFilme.setTotalMinutos(130);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibirFichaTecnica();

        meuFilme.Avalia(8);
        meuFilme.Avalia(5);

        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media das avaliacoes: " + meuFilme.pegaMedia());
    }
}
