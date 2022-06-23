package Pacote1;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private long ra;
    private double Mensalidade;
    private double Materias;

    public Aluno (long ra, Double Materias, String Nome, String Endereço, String DatNasci, long Telefone, int CPF, Double Mensalidade){
        super(Nome, Endereço, DatNasci, Telefone, CPF);
        this.ra = ra;
        this.Materias = Materias;
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

    public double getMaterias() {
        return Materias;
    }

    public void setMaterias(Double materias) {
        Materias = materias;
    }

    public double getMensalidade(Aluno aluno) {
        return Mensalidade;
    }
    public double setMensalidade(double Mensalidade){
        this.Mensalidade = Mensalidade;
        return Mensalidade;
    }

    @Override
    public String toString() {
        String result;

        result = String.format("Nome do aluno: %s\n", Nome)+ 
        String.format("RA do Aluno: %s\n", ra)+
        String.format("Telefone do Aluno: %s\n", Telefone)+
        String.format("Materias do Aluno: %s\n", Materias)+
        String.format("Data de Nascimento do Aluno: %s\n", DatNasci)+
        String.format("Mensalidade do Aluno: %s\n", Mensalidade)+
        String.format("CPF do Aluno: %s\n", CPF);
        return (result);
     
    }

    public String getNome(Aluno aluno) {
        return Nome;
    }

}
