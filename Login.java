import java.util.Scanner;

public class Login {
    Cliente cliente = new Cliente();
    Scanner sn = new Scanner(System.in);

    private int senha,verisenha;
    public void cadassenha(){
        cliente.cadastrar();
        System.out.println("Qual senha você gostaria de cadastrar:");
        senha = sn.nextInt();
    }

    public void logar(){
        for(int x=3; x>=0; x--){
            
            System.out.println("Qual sua senha:");
            verisenha = sn.nextInt();
            if(verisenha == senha){
                int contador=0;
                while (contador<2) {
        
                    int opcao;
                    System.out.println("=================================");
                    System.out.println("|             MENU              |");
                    System.out.println("=================================");
                    System.out.println("| Opções:                       |");
                    System.out.println("|        1. Consultar dados     |");
                    System.out.println("|        2. Sacar               |");
                    System.out.println("|        3. Depositar           |");
                    System.out.println("|        0. Sair                |");
                    System.out.println("=================================");
                    opcao = sn.nextInt();

                    switch(opcao){
                        case 0: contador+=3;
                        break;
                        case 1:cliente.consultar();
                        break;
                        case 2:cliente.saque();
                        break;
                        case 3:cliente.deposito();
                        break;
                    }
                    x=-1;
                }
            }else if(verisenha !=senha && x!=0){
                System.out.println("Senha Incorreta" + "\nvocê tem mais "+ x + " tentativas antes de bloquear");
            }else if(x==0){
            System.out.println("Sua conta foi bloqueada por Excesso de tentaivas de logar");
            }
            
        }
    }
}
