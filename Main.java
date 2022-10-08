class Livro {
    private String nome;
    private String autores;
    private String editora;
    private String ano;
  
    private Livro (String nome, String autores, String editora, String ano) {
        this.nome = nome;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
    }
    
    public String toString() {
        return nome + ". " + autores + "," + editora + "," + ano;      
    }
        
    /**
    * Livro.Builder é uma classe interna, pública e estática de Livro. 
    * Por isso, é que podemos chamar "new Livro.Builder()" diretamente, 
    * sem precisar de instanciar antes um objeto do tipo Livro.
    */
    public static class Builder {
        private String nome;
        private String autores;
        private String editora;
        private String ano; 
        
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setAutores(String autores) {
            this.autores = autores;
            return this;
        }
        
        public Builder setEditora(String editora) {
            this.editora = editora;
            return this;
        }
        
        public Builder setAno(String ano) {
            this.ano = ano;
            return this;
        }
        
        public Livro build() {
            return new Livro(nome, autores, editora, ano); 
        }
    }
}


public class Main {
    public static void main(String [] args) {
        Livro hp = new Livro.Builder()
        .setNome("Harry Potter")
        .setEditora("Rocco")
        .setAno("2000")
        .build();
        
        System.out.println("Livro 1: " + hp.toString());
        
        Livro cr = new Livro.Builder()
        .setNome("Crepusculo")
        .setAutores("Spethen")
        .setAno("1995")
        .build();
        System.out.println("Livro 2: " + cr.toString());                        
    }
}