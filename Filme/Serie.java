
class Serie extends Conteudo {
    private int duracao;
    private int quantEpisodios;
    private int quantTemps;
 
    public Serie(String titulo, int duracao, int quantEpisodios, int quantTemps) {
        super("Serie", titulo);
        this.duracao = duracao;
        this.quantEpisodios = quantEpisodios;
        this.quantTemps = quantTemps;
    }
 
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public int getQuantEpisodios() {
        return quantEpisodios;
    }
    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }
    
    public int getQuantTemps() {
        return quantTemps;
    }
    public void setQuantTemps(int quantTemps) {
        this.quantTemps = quantTemps;
    }
 
    @Override
    public void descricao() {
        System.out.println("Categoria:" + getCategoria() + ", Título:" + getTitulo() + ", Duração:" + duracao + " minutos, " +
                "Episódios:"+quantEpisodios+", Temporadas:"+quantTemps);
    }
}
 
 

