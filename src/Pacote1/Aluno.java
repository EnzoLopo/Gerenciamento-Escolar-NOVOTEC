package Pacote1;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private long ra;
    private double Mensalidade;
    private double qntaulas;

    public Aluno (long ra, Double qntaulas, String Nome, String Endereço, String DatNasci, long Telefone, int CPF, Double Mensalidade){
        super(Nome, Endereço, DatNasci, Telefone, CPF);
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
    
    public String toString() {
        String result;

        result = String.format("Nome do aluno: %s\n", Nome)+ 
        String.format("RA do Aluno: %s\n", ra)+
        String.format("Telefone do Aluno: %s\n", Telefone)+
        String.format("Quantidade de Aulas do Aluno: %s\n", qntaulas)+
        String.format("Data de Nascimento do Aluno: %s\n", DatNasci)+
        String.format("Mensalidade do Aluno: %s\n", Mensalidade)+
        String.format("CPF do Aluno: %s\n", CPF);
        return (result);
     
    }

    public String getNome(Aluno aluno) {
        return Nome;
    }

}
