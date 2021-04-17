
package proyectoprogra;
import java.util.ArrayList;
public class Guardado {
    public static ArrayList<Atomo> Lista = new ArrayList();

    static void Imprimir(){
        for(int i=0;i<Lista.size();i++){
            System.out.println("Atomo "+(i+1)+": ");
            System.out.println("Nombre: "+Lista.get(i).getNombre()+"\nN de enlaces: "+Lista.get(i).getEnlaces());
        }
    }

    static ArrayList Eliminar(int i){
        i=i-1;
        Lista.remove(i);
        return Lista;
    }

    static String[] box(){
        int n = Lista.size();
        String [] lista = new String[n];
        for(int i=0;i<n;i++){
            lista[i]= Lista.get(i).getNombre();
        }
        return lista;
    }
}

