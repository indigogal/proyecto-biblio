import java.util.ArrayList;
import java.util.Calendar;

public class libro {
  // Constructor
  private String nombre;
  private ArrayList<String> autores = new ArrayList<String>();
  private ArrayList<String> generos = new ArrayList<String>();
  private String tipo; // Hardback, Soft back or Ebook
  private Integer ISBN; // Codigo del libro
  private Integer stock;
  private Integer disponibles;
  private Integer paginas;
  private Calendar publicacion; // Solo guarda año y mes, se declara con tuplas de Integers [Integer
                                // _año,Integer _mes]

  public libro(String _nombre, String[] _autores, String[] _generos, String _tipo, Integer _ISBN, Integer _stock,
      Integer _paginas, int[] _publicacion) {
    if (_ISBN != null && _ISBN > 0) {
      this.ISBN = _ISBN;
    } else {
      this.ISBN = null;
    }
    if (_stock != null && _stock > 0) {
      this.stock = _stock;
      this.disponibles = _stock;
    } else {
      this.stock = 0;
      this.disponibles = 0;
    }
    if (_paginas != null && _paginas > 0) {
      this.paginas = _paginas;
    } else {
      this.paginas = null;
    }
    this.nombre = _nombre.toUpperCase();
    this.tipo = _tipo.toUpperCase();
    for (int i = 0; i < _generos.length; i++) {
      this.generos.add(_generos[i]);
    }
    for (int i = 0; i < _autores.length; i++) {
      this.autores.add(_autores[i]);
    }
    this.publicacion.set(_publicacion[0], _publicacion[1] - 1); // YEAR, MONTH -1, MONTH es 0 index por eso restamos

  }

  // Metodos
  // Getters
  public String getNombre() {
    return this.nombre;
  }

  public String getAutor() {
    String retAutores = "";
    for (int i = 0; i < this.autores.size(); i++) {
      retAutores = retAutores + " " + autores.get(i) + ",";
    }
    return retAutores;
  }

  public String getGeneros() {
    String retGeneros = "";
    for (int i = 0; i < this.generos.size(); i++) {
      retGeneros = retGeneros + " " + generos.get(i) + ",";
    }
    return retGeneros;
  }

  public String getTipo() {
    return this.tipo;
  }

  public Integer getISBN() {
    return this.ISBN;
  }

  public Integer getStock() {
    return this.stock;
  }

  public Integer getDisponibles() {
    return this.disponibles;
  }

  public Integer getPaginas() {
    return this.paginas;
  }

  // Setters

}
