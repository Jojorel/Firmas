public class Funcionario{
    private String nome; 
    private double valorHora;
    private double cargaHorariaSemanal;
    private boolean temFilhos;
    private int idade;
    
    public Funcionario(String nome, double valorHora, double cargaHorariaSemanal, boolean temFilhos, int idade) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.temFilhos = temFilhos;
        this.idade = idade;
        
    }

    public Funcionario() {}
    
    public String getNome() {
        return this.nome;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }

    public int getIdade(){
        return this.idade;
    }
    
    public double getCargaHorariaSemanal() {
        return this.cargaHorariaSemanal;
    }
    
    public boolean getTemFilhos() {
        return this.temFilhos;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public void setCargaHorariaSemanal(double cargaHorariaSemanal) {
        if (cargaHorariaSemanal > 44.0) {
            this.cargaHorariaSemanal = 44.0;
        } else {
            this.cargaHorariaSemanal = cargaHorariaSemanal;
        }
    }
    
    public void setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
    }
    
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Idade do funcionario : " + this.idade + "\n" +
               "Valor da hora trabalhada: " + this.valorHora + "\n" +
               "Carga horária semanal: " + this.cargaHorariaSemanal + "\n" +
               "Tem filhos: " + (this.temFilhos ? "Sim" : "Não") + "\n";
    }
    public double CalculaSalario() {
        return (this.valorHora * this.cargaHorariaSemanal) * 4;
  }
}