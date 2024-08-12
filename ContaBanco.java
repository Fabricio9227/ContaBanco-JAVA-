package java.CursoemVídeo.aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método construtor
    public ContaBanco() {
        this.setSaldo(0); //Define o valor de "setSaldo()" para "0"
        this.setStatus(false); //Define o valor de "setStatus()" para "falso"
    }
    
    //Métodos personalizados
    public void estadoAtual() {
        System.out.println("=====================================");     
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Saldo: " + getStatus()); 
        System.out.println("=====================================");            

    }
    public void abrirConta(String tp) {
        setTipo(tp);
        setStatus(true);
        if (tp == "CC") {
            setSaldo(50);
        } else {
            setSaldo(150);
        }
    }

     public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro");
        } else if (getSaldo() < 0)  {
            System.out.println("Conta negativada");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
     }

     public void depositar(int v) {
        if (getStatus() == true)  { //Se o valor de "getStatus()" for verdadeiro, então[...]
             setSaldo(getSaldo() + v); //Pegue o saldo atual "getSalso()", some com o valor depositado " + v" e atualize dentro do "setSaldo()"
             System.out.println("Deposito realizado na conta de " + getDono());
            } else {
                System.out.println("Impossível depositar");
             }
     }
     public void sacar(int v) {
        if (getStatus() == true) {
            if (getSaldo() >= v) {
                setSaldo(getSaldo() - v);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
          System.out.println("Impossivle sacar"); //Se a conta estiver fechada, não será possível sacar
          }
    }
     public void pagarMensal() {
        int v = 0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP"){
            v = 20;
        } 
        if (getStatus() == true) {
            if (getSaldo() > v) { //Se o saldo da conta for maior que o valor cobrado da mensalidade
                setSaldo(getSaldo() - v);//Pegue o saldo atual "getSalso()", subtraia o valor da mensalidade " - v" e atualize dentro do "setSaldo()"
                System.out.println("Mensalidade paga com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente");
                } 
        } else { //Se o "status()" for false, será impossível pagar
                System.out.println("Impossivel pagar");
            }
     }

    //Setters e Getters
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int num) {
        this.numConta = num;
    }
    public String getTipo() {
        return this.tipo;
    } 
    public void setTipo(String tp) {
        this.tipo = tp;
    }
    public String getDono() {
        return this.dono;
    } 
    public void setDono(String d) {
        this.dono = d;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float sld) {
        this.saldo = sld;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean s) {
        this.status = s;
    } 
     
}