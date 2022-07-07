package Pacote1;

import java.util.ArrayList;
public class Aluno extends Pessoa {
    private long ra;
    private double Mensalidade;
    private double qntaulas;
    private double nota1, nota2, nota3, nota4, media;

    public Aluno (long ra, Double qntaulas, String Nome, String CEP, String DatNasci, long Telefone, int CPF, Double Mensalidade, double nota1, double nota2, double nota3, double nota4, double media){
        super(Nome, CEP, DatNasci, Telefone, CPF);
        this.ra = ra;
        this.qntaulas = qntaulas;
        this.Mensalidade = Mensalidade;
    }

    public ArrayList<Aluno> list = new ArrayList<Aluno>();

    public void addAluno(Aluno a){
        list.add(a);
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public double getqntaulas() {
        return qntaulas;
    }

    public void setqntaulas(double qntaulas) {
        this.qntaulas = qntaulas;
    }

    public double getMensalidade(Aluno aluno) {
        return Mensalidade;
    }
    public double setMensalidade(double Mensalidade){
        this.Mensalidade = Mensalidade;
        return Mensalidade;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public double getNota3() {
        return nota3;
    }
    public double getNota4() {
        return nota4;
    }
    public double getMedia() {
        return media;
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
    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    
    public String toString() {
        String result;

        result = String.format("Nome do aluno: %s\n", Nome)+ 
        String.format("RA do Aluno: %s\n", ra)+
        String.format("Telefone do Aluno: %s\n", Telefone)+
        String.format("Quantidade de Aulas do Aluno: %s\n", qntaulas)+
        String.format("Data de Nascimento do Aluno: %s\n", DatNasci)+
        String.format("Mensalidade do Aluno: %s\n", Mensalidade)+
        String.format("CPF do Aluno: %s\n", CPF)+
        String.format("CEP do Aluno: %s\n", CEP);
        return (result);
     
    }
    public String toString2(){
        String result2;
        if(nota1 == 0){
            result2 = String.format("Aluno : %s\n", Nome)+
            String.format("Nota 1 do Aluno: Nota não cadastrada\n" )+
            String.format("Nota 2 do Aluno: Nota não cadastrada\n")+
            String.format("Nota 3 do Aluno: Nota não cadastrada\n")+
            String.format("Nota 4 do Aluno: Nota não cadastrada\n")+
            String.format("\nMédia do Aluno: Média não calculada\n");
            
        }else{

        result2 = String.format("Aluno : %s\n", Nome)+
        String.format("Nota 1 do Aluno: %s\n", nota1)+
        String.format("Nota 2 do Aluno: %s\n", nota2)+
        String.format("Nota 3 do Aluno: %s\n", nota3)+
        String.format("Nota 4 do Aluno: %s\n", nota4)+
        String.format("Média do Aluno: %s\n", media);
        
      }
        return(result2);
        
    }
    public String toString3(){
        String result3;

        result3 = String.format(" - %s", ra)+
        String.format(" %s", Nome);
        return(result3);

    }
    public String toString4(){
        String result4;

        result4 = String.format(" - %s", ra)+
        String.format(" %s", Nome)+
        String.format(" %sR$", Mensalidade);
        return(result4);

    }


    public String getNome(Aluno aluno) {
        return Nome;
    }

}