/* Professor: Fernando Batoni Areias
 * Grupo: Enzo Lopo
 * Matheus Santos
 * Victor Zaneti
 */

import Pacote1.Professor;
import java.util.ArrayList;
import java.util.Scanner;
import Pacote1.Aluno;

public class App {
    public static void main( String[] args) throws Exception {

        // Declaração do Scanner//

        Scanner entrada = new Scanner(System.in);

        //Variavéis//

        String Nome = "", CEP = "", DatNasci = ""; 
        long Telefone = 0 , rs = 0, ra = 3;
        int CPF = 0, opcao = 0, nAluno = 0, nProfessor = 0;
        double valAula = 0;
        boolean tipoContrato = true;
        double qntaulas = 0, Mensalidade = (valAula * qntaulas), numAulas = 0, Salario = (numAulas * valAula), nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = (nota1 + nota2 + nota3 + nota4)/4;


        // Declaração das Classes Usadas no Projeto// 
        
         Professor professor = new Professor(rs, tipoContrato, numAulas, Nome, CEP, DatNasci, Telefone, CPF,Salario);
         Aluno aluno = new Aluno(ra, qntaulas, Nome, CEP, DatNasci, Telefone, CPF, Mensalidade, nota1, nota2, nota3, nota4, media);


        // ArrayList //

        ArrayList<Aluno> lAlunos = new ArrayList();
        ArrayList<Professor> lProfessor = new ArrayList();


        // Inicialização do Sistema //

        System.out.println( "Bem Vindo ao Sistema de Gerenciamento Escolar!\n" + 
            "Qual será o valor das aulas?:");
            valAula = entrada.nextDouble();
            if(valAula <= 0 ){
                System.out.println("O Valor da Aula não pode ser igual ou inferior a 0");
                System.out.println("Tente Novamente!");
                return;
            }else{
            aluno.setValAula(valAula);
            professor.setValAula(valAula);
        }

                   
            // Alunos //

        lAlunos.add(new Aluno(01, 25.00, "Enzo Lopo", "15021-230", "07/12/2005", 973848189, 412050160, Mensalidade = valAula * 25.00, nota1, nota2, nota3, nota4, media = (nota1 + nota2 + nota3 + nota4)/4));
        lAlunos.add(new Aluno(02, 50.00, "Victor", "17012-290", "15/02/2006", 683761871, 961935590, Mensalidade = valAula * 50.00, nota1, nota2, nota3, nota4, media = (nota1 + nota2 + nota3 + nota4)/4));
        lAlunos.add(new Aluno(03, 10.00, "Matheus", "18080-701", "20/09/2004", 893528384, 842675320, Mensalidade = valAula * 10.00, nota1, nota2, nota3, nota4, media = (nota1 + nota2 + nota3 + nota4)/4));


            // Professores //

        lProfessor.add(new Professor(01, true, 40.00, "Josévaldo", "15022-132", "10/01/1980", 1599977755, 879888777, Salario = valAula * 40.00 ));


            // Menu Principal //
            
        do{
            System.out.println("\n1 - Cadastrar Aluno       5 - Ver Lista de Professores\n" +
                               "2 - Cadastrar Professor   6 - Ver Informações de Professores\n"+
                               "3 - Cadastrar Notas       7 - Ver Informações de Alunos\n"+
                               "4 - Ver Lista de Alunos   8 - Ver notas\n");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1: 
                    System.out.println("Nome do Aluno:");
                    Nome = entrada.next();
                    aluno.setNome(Nome);
                    ra++;
                    System.out.println("RA do Aluno será: " + ra);
                    aluno.setRa(ra);  
                    System.out.println("Data de Nascimento do Aluno:");
                    DatNasci = entrada.next();
                    aluno.setDatNasci(DatNasci);
                    System.out.println("CPF do Aluno:");
                    CPF = entrada.nextInt();
                    aluno.setCPF(CPF);
                    System.out.println("Telefone do Aluno:");
                    Telefone = entrada.nextLong();
                    aluno.setTelefone(Telefone);
                    System.out.println("Quantidade de Aulas do Aluno:");
                    qntaulas = entrada.nextInt();
                    aluno.setqntaulas(qntaulas);
                    System.out.println("CEP do Aluno:"); 
                    CEP = entrada.next();      
                    aluno.setCEP(CEP);   
                    Mensalidade = valAula * qntaulas;
                    aluno.setMensalidade(Mensalidade);
                    lAlunos.add(new Aluno(ra, qntaulas, Nome, CEP, DatNasci, Telefone, CPF, Mensalidade,nota1, nota2, nota3, nota4, media));
                    mostraralunos(lAlunos);
                    break;

                case 2:
                    System.out.println("\nNome do Professor:");
                    Nome = entrada.next();
                    professor.setNome(Nome);
                    System.out.println("RS do Professor:");
                    rs = entrada.nextInt();
                    professor.setRs(rs);
                    System.out.println("CEP do Professor:"); 
                    CEP = entrada.next();
                    professor.setCEP(CEP);
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
                    lProfessor.add(new Professor(rs, tipoContrato, numAulas, Nome, CEP, DatNasci, Telefone, CPF, Salario));
                    mostrarprofessores(lProfessor);
                    break;

                case 3:
                    System.out.println("\nNumero do Aluno que deseja adicionar notas");
                    nAluno = entrada.nextInt();
                    nAluno--;
                    System.out.println("Digite a Nota 1");
                    nota1 = entrada.nextDouble();
                    if(nota1 <= 0){
                        System.out.println("A nota não pode ser igual ou inferior a zero!");
                        System.out.println("\nComece novamente!");
                        break;
                    }
                    System.out.println("Digite a Nota 2");
                    nota2 = entrada.nextDouble();
                    if(nota2 <= 0){
                        System.out.println("A nota não pode ser igual ou inferior a zero!");
                        System.out.println("\nComece novamente!");
                        break;
                    }
                    System.out.println("Digite a Nota 3");
                    nota3 = entrada.nextDouble();
                    if(nota3 <= 0){
                        System.out.println("A nota não pode ser igual ou inferior a zero!");
                        System.out.println("\nComece novamente!");
                        break;
                    }
                    System.out.println("Digite a Nota 4");
                    nota4 = entrada.nextDouble();
                    if(nota4 <= 0){
                        System.out.println("A nota não pode ser igual ou inferior a zero!");
                        System.out.println("\nComece novamente!\n");
                        break;
                    }
                    lAlunos.get(nAluno).setNota1(nota1);
                    lAlunos.get(nAluno).setNota2(nota2);
                    lAlunos.get(nAluno).setNota3(nota3);
                    lAlunos.get(nAluno).setNota4(nota4);
                    media = (nota1 + nota2 + nota3 + nota4)/4;
                    lAlunos.get(nAluno).setMedia(media);
                    System.out.println("A Média deste aluno é de: " + media);
                break;

                case 4:
                    mostraralunos(lAlunos);
                    break;

                case 5:
                    mostrarprofessores(lProfessor);
                    break;

                case 6:
                    System.out.println("Qual é o Numero do Professor?");
                    nProfessor = entrada.nextInt();
                    if(nProfessor > lProfessor.size()){
                        System.out.println("Esse Professor não foi localizado no Sistema");
                        System.out.println("Tente Novamente");
                        break;
                    }
                    nProfessor--;
                    System.out.println((lProfessor.get(nProfessor)));
                    break;
                    
                case 7:
                    System.out.println("Qual é o Numero do Aluno?");
                    nAluno = entrada.nextInt();
                    if(nAluno > lAlunos.size()){
                        System.out.println("Esse Aluno não foi localizado no Sistema");
                        System.out.println("Tente Novamente");
                        break;
                    }
                    nAluno--;
                    System.out.println(lAlunos.get(nAluno));
                    break;

                case 8:
                     mostrarnotas(lAlunos);
                break;
            }
        }while (opcao <= 9);
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

        public static void mostrarnotas(ArrayList<Aluno> lista2){
            for(Aluno lAlunos : lista2){
                System.out.printf("%s\n", lAlunos.toString2());
            }
        }
    }
        
    
