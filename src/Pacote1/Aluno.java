package Pacote1;

public class Aluno extends Pessoa {
    private long ra;
    private double Mensalidade;
    private int Materias;

    public Aluno (long ra, int Materias, String Nome, String Endereço, String DatNasci, long Telefone, int CPF){
        super(Nome, Endereço, DatNasci, Telefone, CPF);
        this.ra = ra;
        this.Materias = Materias;
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }

    public int getMaterias() {
        return Materias;
    }

    public void setMaterias(int materias) {
        Materias = materias;
    }

    public double Mensalidade(int nAluno) {
        return (valAula * Materias);
    }

}
