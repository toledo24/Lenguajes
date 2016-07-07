
package conjuntos1;


public class DiferenciaSime {
    public static char [] diferenciaA (char [] A, char []B){
        int c =0;
        for (int i=0; i< A.length;i++){
            
            if (Union.existe(B, A[i])==false){
                c++;
            }
        }
        
        char []I = new char [c];
        int x =0;
        
        for (int j =0; j<A.length;j++){
        if (Union.existe(B, A[j])==false){
            I [x]= A[j];
            x++;
        }
    }
        return I;
    }
    public static char [] diferenciaB (char [] B, char []A){
        int c =0;
        for (int i=0; i< B.length;i++){
            
            if (Union.existe(A, B[i])==false){
                c++;
            }
        }
        
        char []I = new char [c];
        int x =0;
        
        for (int j =0; j<B.length;j++){
        if (Union.existe(A, B[j])==false){
            I [x]= B[j];
            x++;
        }
    }
        return I;
    }
}
