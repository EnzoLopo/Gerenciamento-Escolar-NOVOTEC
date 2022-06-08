package Pacote1;

public class Professor extends Pessoa {
    private long rs;
    private double Salario;
    private boolean tipoContrato;
    private int numAulas;

    public Professor(long rs, Boolean tipoContrato, int numeroAulas, String Nome, String Enderço, String DatNasci, long Telefone, int CPF, double valAula){
        super(Nome, Enderço, DatNasci, Telefone, CPF, valAula);
        this.rs = rs;
        this.tipoContrato = tipoContrato;
        this.numAulas = numeroAulas;
    }

    public long getRs() {
        return rs;
    }

    public void setRs(long rs) {
        this.rs = rs;
    }

    public boolean getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(boolean tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public int getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public double Salario() {
        return (valAula * numAulas);
    }

}
