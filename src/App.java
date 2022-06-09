import Pacote1.Professor;
import java.util.Scanner;
import Pacote1.Aluno;
import Pacote1.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor(00, true, 0, "Nome", "Endereço", "DatNasci", 0000, 0000);
        Aluno aluno = new Aluno(00, 1, "Nome", "Endereço", "DatNasci", 0000, 0000);
        
        Scanner entrada = new Scanner(System.in);

        String Nome;
        String Endereço;
        String DatNasci;
        long Telefone;
        int CPF;
        long ra;
        int Mensalidade;
        int Materias;
        long rs;
        double valAula;
        boolean tipoContrato;
        int numAulas;
        int opcao;
        
        do{
            System.out.println("\n1 Cadastrar Aluno");
            System.out.println("2 Cadastrar Professor");
            System.out.println("3 Diario de Classe");            
            System.out.println("4 Cadastrar Notas");
            System.out.println("5 Ver Frequencia");
            System.out.println("6 Ver Alunos");
            System.out.println("7 Ver Professores");
            System.out.println("8 Ver Salarios");
            System.out.println("9 Ver Mensalidades");
            System.out.println("10 Ver Notas");
            System.out.println("11 Valor Aula");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: 
                    System.out.println("\nNome do Aluno:");
                    Nome = entrada.next();
                    aluno.setNome(Nome);
                    System.out.println("ra do Aluno:");
                    ra = entrada.nextInt();
                    aluno.setRa(ra);
                    System.out.println("Endereço do Aluno:"); 
                    Endereço = entrada.next();      
                    aluno.setEndereço(Endereço);     
                    System.out.println("Data de Nascimento do Aluno:");
                    DatNasci = entrada.next();
                    aluno.setDatNasci(DatNasci);
                    System.out.println("CPF do Aluno:");
                    CPF = entrada.nextInt();
                    aluno.setCPF(CPF);
                    System.out.println("Telefone do Aluno:");
                    Telefone = entrada.nextLong();
                    aluno.setTelefone(Telefone);
                    System.out.println("Materias do Aluno:");
                    Materias = entrada.nextInt();
                    aluno.setMaterias(Materias);
                    break;
                case 2:
                    System.out.println("\nNome do Aluno:");
                    Nome = entrada.next();
                    professor.setNome(Nome);
                    System.out.println("rs do Aluno:");
                    rs = entrada.nextInt();
                    professor.setRs(rs);
                    System.out.println("Endereço do Professor:"); 
                    Endereço = entrada.next();
                    professor.setEndereço(Endereço);
                    System.out.println("Data de Nascimento do Professor:");
                    DatNasci = entrada.next();
                    professor.setDatNasci(DatNasci);
                    System.out.println("CPF do Professor:");
                    CPF = entrada.nextInt();
                    professor.setCPF(CPF);
                    System.out.println("Telefone do Professor:");
                    Telefone = entrada.nextLong();
                    professor.setTelefone(Telefone);
                    System.out.println("Tipo de Contrato:");
                    tipoContrato = entrada.nextBoolean();
                    professor.setTipoContrato(tipoContrato);
                    System.out.println("Numero de Aulas:");
                    numAulas = entrada.nextInt();
                    professor.setNumAulas(numAulas);
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    System.out.println("Qual é o Valor da Aula:");
                    valAula = entrada.nextDouble();
                    aluno.setValAula(valAula);
                    professor.setValAula(valAula);
                    break;
            }
        }while (opcao <= 11);
        }
        
    }
