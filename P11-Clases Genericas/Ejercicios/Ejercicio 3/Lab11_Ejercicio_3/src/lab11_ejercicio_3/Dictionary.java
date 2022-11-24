/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11_ejercicio_3;
import java.util.ArrayList;


/**
 *
 * @author ADMIN
 * @param <K>
 * @param <V>
 */
public class Dictionary<K,V> {

    private OrderedPair par;
    private ArrayList<Dictionary> ArregloDiccionario;
    

    public Dictionary(OrderedPair par) {
        
        this.par = par;
       
    }
    
    public Dictionary(ArrayList<Dictionary> ArregloDiccionario) {

        this.ArregloDiccionario = ArregloDiccionario;
        
    }

    public OrderedPair getPar() {
        return par;
    }

    public void setPar(OrderedPair par) {
        this.par = par;
    }

    public ArrayList<Dictionary> getArregloDiccionario() {
        return ArregloDiccionario;
    }

    public void setArregloDiccionario(ArrayList<Dictionary> ArregloDiccionario) {
        this.ArregloDiccionario = ArregloDiccionario;
    }

   

    
    
    // Metodos

    public void add(K key,V value){
        
        OrderedPair N = new OrderedPair(key, value);
        
        Dictionary Par = new Dictionary(N);
        
        ArregloDiccionario.add(Par);
         
    }
    
    public boolean delete(K key){
        
        for(int i=0; i<ArregloDiccionario.size() ; i++){
            if(key.equals(ArregloDiccionario.get(i).getPar().getKey())){
                ArregloDiccionario.remove(ArregloDiccionario.get(i));
                System.out.println("Se elimino");
                return true;
            }
        }
        
     System.out.println("No se elimino");   
     return false;
    }
    
    public V getValue(K key) throws ObjectNoExist{
        
            for(int i=0; i<ArregloDiccionario.size() ; i++){
                if(key.equals(ArregloDiccionario.get(i).getPar().getKey())){
                    System.out.println((V) ArregloDiccionario.get(i).getPar().getValue());
                    return (V) ArregloDiccionario.get(i).getPar().getValue();
                }
            }
            throw new ObjectNoExist("Par no Existe"); 
    }
    
    /**
     *
     */
   public void ToString(){
       
       System.out.println("---VALORES DE ARREGLO---");
       
        for(int i=0;i<ArregloDiccionario.size();i++){
            System.out.println(ArregloDiccionario.get(i).getPar().toString());
        }
        
            
    }
    
    
    
    
   

    

   
    

    
    
    
    
    
    
}
