package Pacote1;

public class Professor extends Pessoa {
    private long rs;
    private int Salario;
    private boolean tipoContrato;

    public Professor(long rs,  int Salario, Boolean tipoContrato, String Nome, String Enderço, String DatNasci, Long Telefone, Long CPF){
        super(Nome, Enderço, DatNasci, Telefone, CPF);
        this.rs = rs;
        this.Salario = Salario;
        this.tipoContrato = tipoContrato;
    }
    
}
