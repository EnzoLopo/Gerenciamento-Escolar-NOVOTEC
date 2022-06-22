import Pacote1.Professor;
import java.util.ArrayList;
import java.util.Scanner;
import Pacote1.Aluno;

public class App {
    public static void main( String[] args) throws Exception {

        // Declaração do Scanner//

        Scanner entrada = new Scanner(System.in);

        //Variavéis//

        String Nome = "", Endereço = "", DatNasci = ""; 
        long Telefone = 0 , rs = 0, ra = 0;
        int CPF = 0, opcao = 0, nAluno = 0, nProfessor = 0;
        double valAula = 0;
        boolean tipoContrato = true;
        double Materias = 0;
        double Mensalidade = (valAula * Materias);
        double numAulas = 0;
        double Salario = (numAulas * valAula);

        // Declaração das Classes Usadas no Projeto// 
        
         Professor professor = new Professor(rs, tipoContrato, numAulas, Nome, Endereço, DatNasci, Telefone, CPF,Salario);
         Aluno aluno = new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF, Mensalidade);

        // ArrayList //

        ArrayList<Aluno> lAlunos = new ArrayList();
        ArrayList<Professor> lProfessor = new ArrayList();




        
        // Inicialização do Sistema //

        System.out.println( "Bem Vindo ao Sistema de Gerenciamento Escolar!\n" + 
            "Qual será o valor das aulas?:");
            valAula = entrada.nextDouble();
            aluno.setValAula(valAula);
            professor.setValAula(valAula);
                   
            // Alunos //

        lAlunos.add(new Aluno(01, 25.00, "Enzo Lopo", "Rua da Penha, 58", "07/12/2005", 973848189, 412050160, Mensalidade = valAula * 25.00));
        lAlunos.add(new Aluno(02, 50.00, "Victor", "Rua Augusto da Silva, 1080", "15/02/2006", 683761871, 961935590, Mensalidade = valAula * 50.00));
        lAlunos.add(new Aluno(03, 10.00, "Matheus", "Rua Morumbi, 1", "20/09/2004", 893528384, 842675320, Mensalidade = valAula * 10.00));

            // Professores //
       lProfessor.add(new Professor(01, true, 40.00, "Josévaldo", "Rua das Almas, 66", "10/01/1980", 1599977755, 879888777, Salario = valAula * 40.00 ));

        do{
            System.out.println("\n1 - Cadastrar Aluno       6 - Ver Alunos" +
                               "\n2 - Cadastrar Professor   7 - Ver Professores"+
                               "\n3 - Diario de Classe      8 - Ver Salarios"+
                               "\n4 - Cadastrar Notas       9 - Ver Mensalidade"+
                               "\n5 - Ver Frequencia       10 - Ver Notas\n");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: 
                    System.out.println("Nome do Aluno:");
                    Nome = entrada.next();
                    aluno.setNome(Nome);
                    System.out.println("RA do Aluno:");
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
                    Mensalidade = valAula * Materias;
                    aluno.setMensalidade(Mensalidade);
                    lAlunos.add(new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF, Mensalidade));
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
                    numAulas = entrada.nextDouble();
                    professor.setNumAulas(numAulas);
                    Salario = valAula * numAulas;
                    professor.setSalario(Salario);
                    lProfessor.add(new Professor(rs, tipoContrato, numAulas, Nome, Endereço, DatNasci, Telefone, CPF, Salario));
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
                    nProfessor--;
                    System.out.println("O Salario do Professor "+ professor.getNome(lProfessor.get(nProfessor)) + " " + "é: " + professor.Salario(nProfessor) + "R$");
                    break;
                case 9:
                    System.out.println("Qual é o Numero do Aluno?");
                    nAluno = entrada.nextInt();
                    nAluno--;
                    System.out.println("O Aluno " + aluno.getNome(lAlunos.get(nAluno)) + " " + "paga:" + " " + aluno.getMensalidade(lAlunos.get(nAluno)));
                    break;
                case 10:
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
