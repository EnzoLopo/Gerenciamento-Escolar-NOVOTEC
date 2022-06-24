package Pacote1;

public class Pessoa {

    protected String Nome;
    protected String CEP;
    protected String DatNasci;
    protected Long Telefone;
    protected int CPF;
    protected double valAula;
    
    public Pessoa(String Nome, String CEP, String DatNasci, Long Telefone, int CPF){
        this.Nome = Nome;
        this.CEP = CEP;
        this.DatNasci = DatNasci;
        this.Telefone = Telefone;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDatNasci() {
        return DatNasci;
    }

    public void setDatNasci(String datNasci) {
        DatNasci = datNasci;
    }
    
    public int getCPF() {
         return CPF;
     }

    public void setCPF(int cPF) {
        CPF = cPF;
    }
    
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        CEP = CEP;
    }

    public Long getTelefone() {
        return Telefone;
    }

    public void setTelefone(Long telefone) {
        Telefone = telefone;
    }

    public void setValAula(double valAula) {
        this.valAula = valAula;
    }
}