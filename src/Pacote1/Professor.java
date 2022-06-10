package Pacote1;

public class Professor extends Pessoa {
    private long rs;
    private double Salario;
    private boolean tipoContrato;
    private int numAulas;

    public Professor(long rs, Boolean tipoContrato, int numeroAulas, String Nome, String Endereço, String DatNasci, long Telefone, int CPF){
        super(Nome, Endereço, DatNasci, Telefone, CPF);
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

    public double Salario(int nProfessor) {
        return (valAula * numAulas);
    }

    public String toString() {
        String result;

        result = String.format("Nome do Professor: %s\n", Nome)+ 
        String.format("RS do Professor: %s\n", rs)+
        String.format("Telefone do Professor: %s\n", Telefone)+
        String.format("Salario do Professor: %s\n", Salario)+
        String.format("Data de Nascimento do Professor: %s\n", DatNasci)+
        String.format("Tipo de Contrato do Professor: %s\n", tipoContrato)+
        String.format("CPF do Professor: %s\n", CPF)+
        String.format("Numero de Aulas do Professsor: %s\n",numAulas);
        return (result);
     
    }

}
