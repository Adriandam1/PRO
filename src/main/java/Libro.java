
public class Libro {
 private String titulo, autor ; 
 private int ano;
 private short numPaginas;
 private float valoracion;
 
 public Libro(){
     
 }
 public Libro(String tit,String aut,int anio,short numPag){
     titulo=tit;
     autor=aut;
     ano=anio;
     numPaginas=numPag;
 }
 public void setTitulo(String t){
     titulo=tit;
 }
 public void setAutor(String aut){
     autor=aut;
 }
 public void setAno(int anio){
     ano=anio;
 }
 public void setNumPaginas(short numPag){
     numPaginas=numPag;
 }
 public void setValoracion(float val){
     valoracion=val;
 }
 public void amosar(){
  
     System.out.println("Libros");
  
     System.out.println("Titulo = "+titulo);
  
     System.out.println("Autor = "+autor);
  
     System.out.println("Ano = "+ano);
  
     System.out.println("Paginas = "+numPaginas);
  
     System.out.println("Valoracion = "+valoracion);
     
     
 }
}
