
package conjuntos1;


public class Union {
     public static Boolean existe (char []conju, char ele){
        boolean exis=false;
        //recorrer elementos:v y comprobar si existe en el conjunto
        for(int i=0; i< conju.length; i++){
        if(conju[i]==ele){
            exis=true;
        }
    }
        return exis;
    }
        public static char [] union (char [] a, char [] b){
        
        char [] u = new char [a.length+b.length];
        //pasarelementos
        for (int i=0;i < a.length;i++){
            u [i] =a [i];
            
        }
        int x=0;
        int r=0;
        for (int i=0; i<b.length;i++){
            if(existe (u, b[i])==false){
                u[a.length+x]=b[i];
                x++;
            }
            else
            {
                r++;
            }
        }
        char [] aux =u;
        u = new char [aux.length-r];
        
        for (int i=0; i< u.length; i++){
            u[i] = aux[i];
            
        }
    
        return u;
    }
    
}
