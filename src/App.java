import Pacote1.Professor;
import java.util.Scanner;
import Pacote1.Aluno;

public class App {
    public static void main(String[] args) throws Exception {

        Professor professor = new Professor(00, true, 0, "Nome", "Enderço", "DatNasci", 0000, 0000, 000);
        Aluno aluno = new Aluno(00, 1, "Nome", "Enderço", "DatNasci", 0000, 0000, 000);
        
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
        int valAula;
        boolean tipoContrato;
        int numAulas;
        int opcao;

        int Array[] = new int [10];
        
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
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
            }
        }while (opcao <= 10);
        }
        
    }
