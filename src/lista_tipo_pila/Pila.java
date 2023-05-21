package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo ultimoValorIngresado;
    int tamano = 0;
    String lista = "";
    
    public Pila(){
        ultimoValorIngresado = null;
        tamano = 0;
    }
    
    /**
     * Metodo para saber cuando la pila esta vacia
     *return True / false
     */
    public boolean PilaVacia(){
        return ultimoValorIngresado == null;
    }
    
    /**
     *Metodo para insertar un nodo en la pila
     */
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    
    /**
     * Metodo para eliminar el ultimo nodo ingresado
     * return valor del ultimo nodo
     */
    public int EliminarNodo(){
        int auxiliar = ultimoValorIngresado.informacion;
        ultimoValorIngresado = ultimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    /**
     * return el valor del ultimo nodo ingresado
     */
    public int MostrarUltimoValorIngresado(){
        return ultimoValorIngresado.informacion;
    }
    
    /**
     * return el tamaño de la pila
     */
    public int TamanoPila(){
        return tamano;
    }
    
    /**
     * Metodo para vaciar pila
     */
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    /**
     * Metodo para mostrar todos los valores
     */
    public void MostrarValores(){
        Nodo recorrido = ultimoValorIngresado;
        
        while(recorrido != null){
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
    
}
