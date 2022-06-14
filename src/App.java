import Pacote1.Professor;
import java.util.ArrayList;
import java.util.Scanner;
import Pacote1.Aluno;

public class App {
    public static void main( String[] args) throws Exception {

        // Declaração do Scanner//
        Scanner entrada = new Scanner(System.in);
        // Variavéis//
        String Nome = "", Endereço = "", DatNasci = ""; 
        long Telefone = 0 , rs = 0, ra = 0;
        int CPF = 0;
		int Mensalidade = 0;
		int Materias = 0, numAulas = 0, opcao = 0, nAluno = 0, nProfessor = 0;
        double valAula = 0;
        boolean tipoContrato = true;

        // Declaração das Classes Usadas no Projeto// 
         Professor professor = new Professor(rs, tipoContrato, numAulas, Nome, Endereço, DatNasci, Telefone, CPF);
         Aluno aluno = new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF);

        // ArrayList //

        ArrayList<Aluno> lAlunos = new ArrayList();
        ArrayList<Professor> lProfessor = new ArrayList();
        
        
        do{
            System.out.println("\n1 - Cadastrar Aluno       6 - Ver Alunos" +
                               "\n2 - Cadastrar Professor   7 - Ver Professores"+
                               "\n3 - Diario de Classe      8 - Ver Salarios"+
                               "\n4 - Cadastrar Notas       9 - Ver Mensalidade"+
                               "\n5 - Ver Frequencia       10 - Ver Notas"+
                               "\n              11 - Valor Aula\n");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: 
                    System.out.println("Nome do Aluno:");
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
                    lAlunos.add(new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF));
                    mostraralunos(lAlunos);
                    break;
                case 2:
                    System.out.println("\nNome do Professor:");
                    Nome = entrada.next();
                    professor.setNome(Nome);
                    System.out.println("RS do Professor:");
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
                    mostrarprofessores(lProfessor);
                    break;
                case 3:
                    System.out.println("\nNumero do Aluno: ");
                    nAluno = entrada.nextInt();
                    nAluno--;
                    System.out.println(lAlunos.get(nAluno));
                    break;
                case 4:
                break;
                case 5:
                break;
                case 6:
                    mostraralunos(lAlunos);
                    break;
                case 7:
                    mostrarprofessores(lProfessor);
                    break;
                case 8:
                    System.out.println("Qual é o Numero do Professor?");
                    nProfessor = entrada.nextInt();
                    System.out.println("O Salario do Professor é: " + professor.Salario(nProfessor));
                    break;
                case 9:
                    System.out.println("Qual é o Numero do Aluno?");
                    nAluno = entrada.nextInt();
                    nAluno--;
                    System.out.println("O Aluno " + aluno.getNome(lAlunos.get(nAluno)) + " " + "paga:" + " " + aluno.getMensalidade(lAlunos.get(nAluno)));
                    break;
                case 10:
                break;
                case 11:
                    System.out.println("Qual é o valor da aula:");
                    valAula = entrada.nextDouble();
                    aluno.setValAula(valAula);
                    professor.setValAula(valAula);
                    break;
            }
        }while (opcao <= 11);
        }



        public static void mostraralunos( ArrayList<Aluno> lista){
            for( Aluno lAlunos : lista){
                System.out.printf("%s\n", lAlunos.toString());
            }

        }
        public static void mostrarprofessores(ArrayList<Professor> lista){
            for(Professor lProfessor : lista){
                System.out.printf("%s\n", lProfessor.toString());
            }
        }
        
    }
