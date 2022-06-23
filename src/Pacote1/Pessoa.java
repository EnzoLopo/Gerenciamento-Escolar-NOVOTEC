package Pacote1;

public class Pessoa {

    protected String Nome;
    protected String Endereço;
    protected String DatNasci;
    protected Long Telefone;
    protected int CPF;
    protected double valAula;
    
    public Pessoa(String Nome, String Endereço, String DatNasci, Long Telefone, int CPF){
        this.Nome = Nome;
        this.Endereço = Endereço;
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
    
    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
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