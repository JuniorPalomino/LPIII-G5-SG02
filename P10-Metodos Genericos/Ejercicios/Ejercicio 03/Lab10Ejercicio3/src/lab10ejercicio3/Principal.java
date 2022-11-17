
package lab10ejercicio3;


public class Principal {

    public static void main(String[] args) {
        
        Integer num1=5, num2=6;
        Character c1='x', c2='d';
        String s1="hola", s2 ="mundo";
        Double d1=4.05, d2=4.05;
        
        System.out.println(isEqualTo(num1, num2));      //Compara 2 enteros
        System.out.println(isEqualTo(c1, c2));          //Compara 2 caracteres
        System.out.println(isEqualTo(s1, s2));          //Compara 2 String
        System.out.println(isEqualTo(d1, d2));          //Compara 2 double
        
    }
    
    public static <T> boolean isEqualTo(T t1, T t2){
        
        if(t1.equals(t2))
            return true;
        
        return false;
    }
}
