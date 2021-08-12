package exerciciopolimorfismo;

public class Animal {
        private String nome;
        private int idade;
        private String boca;

        public String getNome() {
            return nome;
        }

        public void setNome(final String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(final int idade) {
            this.idade = idade;
        }

        public String getBoca() {
            return boca;
        }

        public void setBoca(final String boca) {
            this.boca = boca;
        }
}
