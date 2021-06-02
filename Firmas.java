import java.util.ArrayList;
import java.util.Scanner;


public class Firmas {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
   
    public static void main(String []args){
       
       Funcionario f1 = new Funcionario("Jorel", 5.5, 30, false, 20); // 5.5 * 30 = 1650
       Funcionario f2 = new Funcionario("Jilberto", 4.4, 55, true, 24); // 4.4 * 55 = 2420
       Funcionario f3 = new Funcionario("Jorge", 3.3, 12, false, 56);
       
       funcionarios.add(f1);
       funcionarios.add(f2);
       funcionarios.add(f3); 
       
       boolean menu = true;
       
       while(menu) {
           System.out.println(itensMenu());
           Scanner in = new Scanner(System.in);
           int menuSelecionado = Integer.parseInt(in.nextLine());
           
           switch(menuSelecionado) {
               case 1:
                   AdicionaFuncionario();
                   break;
               case 2:
                   FuncionarioMaiorSalario();
                   break;
               case 3:
                   MediaIdadeFuncionarios();
                   break;
               case 4:
                   TamanhoMaiorNome(); 
                   break;
               case 5:
                   PercentualFuncionariosComFilho();
                   break;
                case 6:
                    Todososfuncionarios();
                    break;
                case 7:
                    Nomedostrabalhadores();
               case 8:
                   System.out.println("Sistema encerrado.\n");
                   menu = false;
                   break;
               default:
                   System.out.println("Opção inválida.\n");
           } 
       }
       
    }
    
    public static void PercentualFuncionariosComFilho() {
        int quantidadeComFilhos = 0;
        for (int i =0; i < funcionarios.size(); i++) {             
            if (funcionarios.get(i).getTemFilhos() == true) {     
                quantidadeComFilhos++;                              
            }                                                      
                                                                    
        }                                           
        
        double percentual = (quantidadeComFilhos * 100) / funcionarios.size();

        System.out.println("Todos os Funcionarios são: " + percentual + "%\n");
    }

         


    public static String itensMenu() {

       return "Opção 1: Adiciona funcionario.\n" +
              "Opção 2: toString do funcionario com maior salario.\n" +
              "Opção 3: média de idades.\n" + 
              "Opção 4: tamanho do maior nome dos funcionarios cadastrados.\n" +
              "Opção 5: percentual de funcionarios que tem filhos.\n" +
              "Opção 6: quantos funcionários você possui.\n" + 
              "Opção 7: lista nome dos funcionarios \n" +
              "Opção 8: sai do programa.\n"; 
    }

    public static void TamanhoMaiorNome() {
        int tamanhoMaiorNome = 0;
        for (int i =0; i < funcionarios.size(); i++) {
            int tamanhoNome = funcionarios.get(i).getNome().length();
            if (tamanhoNome > tamanhoMaiorNome) {
                tamanhoMaiorNome = tamanhoNome;
            }
        }

        System.out.println("O tamanho do maior nome é: " + tamanhoMaiorNome + "\n");
    }

    public static void Todososfuncionarios() {
        int todososfuncionarios = funcionarios.size();
        System.out.println("Numero de funcionarios são : " + todososfuncionarios + "\n");
    }

    public static void Nomedostrabalhadores(){
        for (int i =0; i < funcionarios.size(); i++) {            
            System.out.println(funcionarios.get(i).getNome());            
        }
        
    }


    public static void MediaIdadeFuncionarios() {
        double idadesSomadas = 0;
        for (int i =0; i < funcionarios.size(); i++) {            
            idadesSomadas += funcionarios.get(i).getIdade();            
        }

        double media = idadesSomadas / funcionarios.size();
        System.out.println("A média de idades dos funcionários é: " + media + "\n");
    }
    
    public static void FuncionarioMaiorSalario() {
        Funcionario f1 = new Funcionario();

        for (int i =0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).CalculaSalario() > f1.CalculaSalario()){
                f1 = funcionarios.get(i);
            }
        }
        System.out.println("Funcionário com maior salario: " + f1.toString());
        
    }

    public static void AdicionaFuncionario() {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Informe o nome do funcionário: ");
        String nome = in.nextLine();
        
        System.out.println("Informe o valor da hora trabalhada: ");
        double valorHoraTrabalhada = Double.parseDouble(in.nextLine());
        
        System.out.println("Informe as horas trabalhadas semanais: ");
        double horasTrabalhadas = Double.parseDouble(in.nextLine());
        
        System.out.println("Informe a idade do funcionário: ");
        int idade = Integer.parseInt(in.nextLine());
        
        System.out.println("Tem filhos: ");
        boolean temFilhos = Boolean.parseBoolean(in.nextLine());
        

        Funcionario f = new Funcionario(nome, valorHoraTrabalhada, horasTrabalhadas, temFilhos, idade);
        
        funcionarios.add(f);
        
    }
    
    
}