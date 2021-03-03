package ejercicio1;
/**
 *
 * @author victor
 */
public class PuertaAnd2 {
    
    // Nuevo comentario 
    
    private boolean a;
    private boolean b;
    
    public PuertaAnd2(){
        a = false;
        b = false;
    }
    
    public PuertaAnd2(boolean in){
        a = in;
        b = in;
    }
    
    public PuertaAnd2(boolean a, boolean b){
        this.a = a;
        this.b = b;
    }

    public boolean getA() {
        return a;
    }

    public boolean getB() {
        return b;
    }
    
    public void setA(boolean a) {
        this.a = a;
    }
    
    public void setB(boolean b) {
        this.b = b;
    }
    
    /*
    public boolean equals (PuertaAnd2 puertaAnd){
        return getA() == puertaAnd.getA() && getB() == puertaAnd.getB();
    }
    */
    
    @Override
    public boolean equals(Object otro){
        if (otro instanceof  PuertaAnd2){
            PuertaAnd2 puertaAnd = (PuertaAnd2) otro;
            return a == puertaAnd.getA() && b == puertaAnd.getB();
        }
        return false;
    }
    
    public boolean getSalida(){
        return getA() && getB();
    }
    
    @Override
    public String toString(){
        return "A: " + getA() + " B: " + getB();
    }
}
