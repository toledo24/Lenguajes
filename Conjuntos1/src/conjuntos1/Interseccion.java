
package conjuntos1;


public class Interseccion {
     public static char [] interseccion (char [] A, char []B){
        int c =0;
        for (int i=0; i< A.length;i++){
            
            if (Union.existe(B, A[i])==true){
                c++;
            }
        }
        
        char []I = new char [c];
        int x =0;
        
        for (int j =0; j<A.length;j++){
        if (Union.existe(B, A[j])==true){
            I [x]= A[j];
            x++;
        }
    }
        return I;
    }
}
