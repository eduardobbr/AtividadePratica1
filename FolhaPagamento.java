public class FolhaPagamento {
    
    private String nome;
    private int horasTrabalhadas;
    private float valorHora;

    public FolhaPagamento(String nome, int horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float calcularSalarioBruto() {
        return horasTrabalhadas * valorHora;
    }

    public float calcularIR(float salarioBruto) {
        if (salarioBruto <= 1372.81)
            return 0;
        else if (salarioBruto <= 2743.25)
            return salarioBruto * 0.15f;
        else
            return salarioBruto * 0.275f;
    }

    public float calcularINSS(float salarioBruto) {
        if (salarioBruto <= 868.29)
            return salarioBruto * 0.08f;
        else if (salarioBruto <= 1447.14)
            return salarioBruto * 0.09f;
        else if (salarioBruto <= 2894.27)
            return salarioBruto * 0.11f;
        else
            return 318.37f;
    }

    public float calcularFGTS(float salarioBruto) {
        return salarioBruto * 0.08f;
    }

    public float calcularSalarioLiquido(float salarioBruto, float descontoIR, float descontoINSS) {
        return salarioBruto - descontoIR - descontoINSS;
    }

    public void imprimirFolhaPagamento() {
        float salarioBruto = calcularSalarioBruto();
        float descontoIR = calcularIR(salarioBruto);
        float descontoINSS = calcularINSS(salarioBruto);
        float fgts = calcularFGTS(salarioBruto);
        float salarioLiquido = calcularSalarioLiquido(salarioBruto, descontoIR, descontoINSS);

        System.out.println("\nNome: " + nome);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Desconto IR: " + descontoIR);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("FGTS: " + fgts);
        System.out.println("Salário Líquido: " + salarioLiquido);
    }
}
