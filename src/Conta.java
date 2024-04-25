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
