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
		int Materias = 0, numAulas = 0, opcao = 0, nAluno, nProfessor;
        double valAula = 0;
        boolean tipoContrato = true;

        // Declaração das Classes Usadas no Projeto// 
         Professor professor = new Professor(rs, tipoContrato, numAulas, Nome, Endereço, DatNasci, Telefone, CPF);
         Aluno aluno = new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF);

        // ArrayList //

        ArrayList<Aluno> lAlunos = new ArrayList();
        ArrayList<Professor> lProfessor = new ArrayList();
        
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
                    lAlunos.add(new Aluno(ra, Materias, Nome, Endereço, DatNasci, Telefone, CPF));
                    mostraralunos(lAlunos);
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
                    System.out.println("\nNumero do Aluno: ");
                    nAluno = entrada.nextInt();

                case 4:
                case 5:
                case 6:
                    mostraralunos(lAlunos);
                    break;
                case 7:
                case 8:
                    System.out.println("Qual é o Numero do Professor?");
                    nProfessor = entrada.nextInt();
                    System.out.println("O Salario do Professor é: " + professor.Salario(nProfessor));
                    break;
                case 9:
                    System.out.println("Qual é o Numero do Aluno?");
                    nAluno = entrada.nextInt();
                    System.out.println("O Aluno paga: " + aluno.Mensalidade(nAluno));
                    break;
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



        public static void mostraralunos( ArrayList<Aluno> lista){
            for( Aluno lAlunos : lista){
                System.out.printf("%s\n", lAlunos.toString());
            }

        }
        public static void mostrarprofessores(Arraylist<Professor> lista){
            for(Professor lProfessor : lista){
                System.out.printf("%s\n", lProfessor.toString());
            }
        }
        
    }
