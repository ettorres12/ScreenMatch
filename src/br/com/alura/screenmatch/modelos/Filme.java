package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean IncluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int totalMinutos;

    String getnome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return IncluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean IncluidoNoPlano) {
        this.IncluidoNoPlano = IncluidoNoPlano;
    }

    double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }


    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    int getTotalMinutos() {
        return totalMinutos;
    }

    public void setTotalMinutos(int totalMinutos) {
        this.totalMinutos = totalMinutos;
    }


    void exibirFichaTecnica() {
        System.out.println("O nome do filme é: " + nome);
        System.out.println("O ano de lançamento do filme é: " + anoDeLancamento);
        System.out.println("O filme tem duração de: " + totalMinutos + " minutos");
        System.out.println("Incluido no plano: " + IncluidoNoPlano);
    }

    void Avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


}
