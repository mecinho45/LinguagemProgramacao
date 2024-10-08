public class Aluno {
    private String nome, situacao;
    private double nota1, nota2, nota3, media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        media = (nota1 + nota2 + nota3)/3;
        return media;
    }

    public String verificarAprovacao(){
        if (media >= 7){
            situacao = "Aprovado";
        } else if (media>=5 & media<7) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }
        return situacao;
    }

    public void exibirDetalhesAluno(){
        calcularMedia();
        verificarAprovacao();
        System.out.println("====Boletim do aluno====");
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}