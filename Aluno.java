public class Aluno {
    private String matricula;
    private String nome;
    private int entrada;
    
    public Aluno() {
    }
    
    public Aluno(String matricula, String nome, int entrada) {
        this.matricula = matricula;
        this.nome = nome;
        this.entrada = entrada;
    }
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getEntrada() {
        return entrada;
    }
    
    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
    
    public int getForca() {
        return entrada;
    }
    
    public String getRaridade() {
        if (matricula == null || matricula.isEmpty()) {
            return "Indeterminada";
        }
        
        char primeiraLetra = Character.toUpperCase(matricula.charAt(0));
        
        if (primeiraLetra >= 'A' && primeiraLetra <= 'M') {
            return "Comum";
        } else if (primeiraLetra >= 'N' && primeiraLetra <= 'Z') {
            return "Rara";
        } else {
            return "Indeterminada";
        }
    }
    
    public void exibirCarta() {
        System.out.println("===================================");
        System.out.printf("│ 🃏 %-27s │%n", "CARTA SUPER TRUNFO");
        System.out.println("-----------------------------------");
        System.out.printf("│ Nome: %-50s %n", truncate(nome, 50));
        System.out.printf("│ Matrícula: %-10s %n", truncate(matricula, 10));
        System.out.printf("│ Entrada: %-4d %n", entrada);
        System.out.printf("│ Força: %-20d %n", getForca());
        System.out.printf("│ Raridade: %-17s %n", getRaridade());
        System.out.println("===================================");
    }
    
    private String truncate(String str, int maxLength) {
        if (str == null) return "";
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength - 3) + "...";
    }
    
    public boolean batalhar(Aluno oponente) {
        return this.entrada > oponente.entrada;
    }
    
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", entrada=" + entrada + "]";
    }
}