package list.Pesquisa.exercicio;


import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
//        Livro livro = new Livro(titulo, autor, anoPublicaco);
//        listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("The Witcher", "Andrei Sap", 1992);
        catalogoLivros.adicionarLivro("Lord of the Rings", "JRR Tolkien", 1955);
        catalogoLivros.adicionarLivro("Lord of the Rings", "JRR Tolkien", 1954);
        catalogoLivros.adicionarLivro("Harry Potter and the Philosopher's Stone", "JK Rowling", 1997);
        catalogoLivros.adicionarLivro("Harry Potter and the Chamber of Secrets", "JK Rowling", 1998);
        catalogoLivros.adicionarLivro("Harry Potter and the Half-Blood Prince", "JK Rowling", 2005);
        catalogoLivros.adicionarLivro("Neuromancer", "William Gibson", 1984);
        catalogoLivros.adicionarLivro("Fight Club", "Chuck Palahniuk", 1996);

        System.out.println(catalogoLivros.pesquisarPorAutor("JK Rowling"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1992, 1997));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Lord of the Rings"));
    }

}
