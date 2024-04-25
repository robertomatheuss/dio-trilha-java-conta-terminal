public class Conta {
    private Integer numero;
    private String agencia;
    private String nome;
    private Double saldo;

    public Conta(Integer numero,String agencia,String nome,Double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
        System.out.println("Olá "+this.nome+", obrigado "+
        "por criar uma conta em nosso banco, sua agência é "+ this.agencia+
        ",conta é "+this.numero+" e seu saldo de R$" +this.saldo+" já está disponível para saque");
    }



    public String getAgencia() {
        return agencia;
    }

    public String getNome() {
        return nome;
    }
    
    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
