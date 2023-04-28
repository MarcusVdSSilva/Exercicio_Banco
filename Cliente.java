import java.util.Scanner;

public class Cliente {
Scanner sn = new Scanner(System.in);
Scanner ss = new Scanner(System.in);
    
private String nome, cpf;
private float saldo, vsaque, vdeposito;


    public void cadastrar(){
        int x=0;
        System.out.println("Qual seu nome completo:");
        this.nome = ss.nextLine();
        System.out.println("Qual seu CPF:");
        this.cpf = ss.nextLine();
        do{
            System.out.println("Qual seu saldo inicial:");
            this.saldo = sn.nextFloat();
            if(saldo <=-1){
                System.out.println("Valor invalido");
            }else{
                x++;
            }
        }while(x<1);
    }

    public void consultar(){
        System.out.println("Nome completo:" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("Saldo:" + this.saldo);
    }

    public void saque(){
        System.out.println("Quanto gostaria de sacar:");
        this.vsaque = sn.nextFloat();
        if(vsaque < saldo && vsaque>0){
            this.saldo-=this.vsaque;
            System.out.println("Seu saldo atual é:" + this.saldo);
        }else{System.out.println("Valor invalido");}
    }

    public void deposito(){
        System.out.println("Quanto gostaria de depositar:");
        this.vdeposito = sn.nextFloat();
        if(vdeposito>0){
            this.saldo+=this.vdeposito;
            System.out.println("Seu saldo atual é:" + this.saldo);
        }else{System.out.println("Valor Invalido");}
    }

}
