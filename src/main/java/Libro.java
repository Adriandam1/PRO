
public class Libro {
 private String titulo, autor ; 
 private int ano;
 private short numPaginas;
 private float valoracion;
 
 public Libro(){
     
 }
 public Libro(String tit,String aut,int an,short numP){
     titulo=tit;
     autor=aut;
     ano=an;
     numPaginas=numP;
 }
 public void setTitulo(String t){
     titulo=t;
 }
 public void setAutor(String aut){
     autor=aut;
 }
 public void setAno(int an){
     ano=an;
 }
 public void setNumPaginas(short numP){
     numPaginas=numP;
 }
 public void setValoracion(float val){
     valoracion=val;
 }
 public void amosar(){
     System.out.println("-----------------");
     System.out.println("Libros --->");
     System.out.println("Titulo= "+titulo);
     System.out.println("Autor= "+autor);
     System.out.println("Ano= "+ano);
     System.out.println("Paginas= "+numPaginas);
     System.out.println("Valoracion= "+valoracion);
 }
}
