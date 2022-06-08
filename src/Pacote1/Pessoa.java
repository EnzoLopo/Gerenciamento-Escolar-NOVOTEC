package Pacote1;

public class Pessoa {

    private String Nome;
    private String Endereço;
    private String DatNasci;
    private Long Telefone;
    private int CPF;
    protected double valAula;
    
    public Pessoa(String Nome, String Enderço, String DatNasci, Long Telefone, int CPF, double valAula){
        this.Nome = Nome;
        this.Endereço = Enderço;
        this.DatNasci = DatNasci;
        this.Telefone = Telefone;
        this.CPF = CPF;
        this.valAula = valAula;
    }

    public String getNome() {
        return Nome;
    }

    public String getDatNasci() {
        return DatNasci;
    }
    
    public int getCPF() {
         return CPF;
     }
    
    public String getEndereço() {
        return Endereço;
    }

    public Long getTelefone() {
        return Telefone;
    }
}