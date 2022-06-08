package Pacote1;

public class Pessoa {

    private String Nome;
    private String Endereço;
    private String DatNasci;
    private Long Telefone;
    private Long CPF;
    
    public Pessoa(String Nome, String Enderço, String DatNasci, Long Telefone, Long CPF){
        this.Nome = Nome;
        this.Endereço = Enderço;
        this.DatNasci = DatNasci;
        this.Telefone = Telefone;
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public String getDatNasci() {
        return DatNasci;
    }
    
    public Long getCPF() {
         return CPF;
     }
    
    public String getEndereço() {
        return Endereço;
    }

    public Long getTelefone() {
        return Telefone;
    }
}