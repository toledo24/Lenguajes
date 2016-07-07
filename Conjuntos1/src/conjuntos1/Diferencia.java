
package conjuntos1;


public class Diferencia {
    
   public static char [] diferencia (char [] A, char []B){
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
    
   
}











