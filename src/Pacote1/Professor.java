package Pacote1;

public class Professor extends Pessoa {
    private long rs;
    private double Salario;
    private String tipoContrato;
    private double numAulas;


    public Professor(long rs, String tipoContrato, double numAulas2, String Nome, String CEP, String DatNasci, long Telefone, int CPF, Double Salario){
        super(Nome, CEP, DatNasci, Telefone, CPF);
        this.rs = rs;
        this.tipoContrato = tipoContrato;
        this.numAulas = numAulas2;
        this.Salario = Salario;
    }

    public long getRs() {
        return rs;
    }

    public void setRs(long rs) {
        this.rs = rs;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public double getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(Double numAulas) {
        this.numAulas = numAulas;
    }

    public double Salario(int nProfessor) {
        return (valAula * numAulas);
    }
    public double setSalario(double salario) {
        Salario = salario;
        return salario;
    }
    public String getNome(Professor professor) {
        return Nome;
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
        String.format("Numero de Aulas do Professsor: %s\n",numAulas)+
        String.format("CEP do Professor: %s\n", CEP);
        return (result);
     
    }
    public String toString2(){
        String result2;

        result2 = String.format(" - %s", rs)+
        String.format(" %s", Nome)+
        String.format(" - %s" , tipoContrato);
        return(result2);

    }

    public String getNome(Aluno aluno) {
        return Nome;
    }

}