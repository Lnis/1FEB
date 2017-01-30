
public class QueHace {
 
    int a;// por estar declarada aquí, fuera de cualquier método; a es un
            // atributo de la clase. Por lo tanto, es accesible y visible desde
            // todos los métodos de la clase. Java inicializa sola a=0 
 
    void metodo() {
        System.out.println(a);		//sería lo mismo que poner System.out.println(this.a);
        a++; // equivalente --> a = a + 1;   sería lo mismo que poner this.a ++
    }
 
	public static void main(String args[]) {
        QueHace qh1 = null;
        QueHace qh2 = null;
 
        qh1 = new QueHace();
        
        qh1.metodo();				//Imprime:0 a=1
        qh1.metodo();				//Imprime:1 a=2
        qh1.a = 33;					//a=33
        qh1.metodo();				//Imprime:33 a=34
        System.out.println(qh1.a);	//34
        qh2=qh1;
        qh2.metodo();				//34 --> qh1 y qh2 apuntan al mismo a
        qh1.metodo();				//35

    }
 
}
