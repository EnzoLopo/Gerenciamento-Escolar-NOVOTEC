import Pacote1.Professor;
import java.util.Scanner;
import Pacote1.Aluno;
import Pacote1.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaração do Scanner//
        Scanner entrada = new Scanner(System.in);
        // Variavéis//
        String Nome = "", Endereço = "", DatNasci = ""; 
        long Telefone = 0 , rs = 0, ra = 0;
        int CPF = 0, Mensalidade = 0, Materias = 0, numAulas = 0, opcao = 0;
        double valAula = 0;
        boolean tipoContrato = true;

       // Declaração das Classes Usadas no Projeto// 
        Professor professor = new Professor(rs, tipoContrato, numAulas, Nome, Endereço, DatNasci, Telefone, CPF);
        Aluno aluno = new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF);
        
        do{
            System.out.println("\n1 - Cadastrar Aluno" +
                               "\n2 - Cadastrar Professor"+
                               "\n3 - Diario de Classe"+
                               "\n4 - Cadastrar Notas"+
                               "\n5 - Ver Frequencia"+
                               "\n6 - Ver Alunos"+
                               "\n7 - Ver Professores" +
                               "\n8 - Ver Salarios"+
                               "\n9 - Ver Mensalidade"+
                               "\n10 -Ver Notas"+
                               "\n11- Valor Aula\n");
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
