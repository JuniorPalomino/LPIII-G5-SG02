/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11_actividad.pkg1;

/**
 *
 * @author Alumno
 */
public class Lab11_Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here

        Persona person1 = new Persona("Pepe");         //Objetos Persona
        Persona person2 = new Persona("Pedro");
        Persona person3 = new Persona("Juana");

        Persona[] Hombres = {person1, person2};         //Arreglo Persona

        Goddies chupete = new Goddies(12);            //Objetos goddies
        Goddies caramelo = new Goddies(13);
        Goddies gaseosa = new Goddies(14);

        Goddies[] Dulces = {chupete, caramelo};     //Arreglo Goddies

        Procedencia Characato =new Procedencia("Arequipa","Arequipà");   //Objetos procedencia
        Procedencia Moquegua =new Procedencia("Moquegua","Marical Nieto");
        Procedencia Miraflores =new Procedencia("Lima","Lima");
        
        Estudiante estu1 = new Estudiante("Maria",Characato);        //Objetos Estudiante
        Estudiante estu2 = new Estudiante("Fernanda",Moquegua);
        Estudiante estu3= new Estudiante("Kevin",Miraflores);

        Estudiante[] Mujeres = {estu1, estu2};          //Arreglo Estudiante

        Verificadora<Persona> verPer = new Verificadora<Persona>(Hombres);

        String msgPer = verPer.contiene(person1) ? "SI tiene Persona 1" : "NO tiene Persona 2";
        System.out.println(msgPer);
        msgPer = verPer.contiene(person3) ? "SI tiene Persona 3" : "NO tiene Persona 3";
        System.out.println(msgPer);
        
        
        
        Verificadora<Goddies> verGo = new Verificadora<Goddies>(Dulces);

        String msgGo = verGo.contiene(chupete) ? "SI tiene chupete" : "NO tiene chupete";
        System.out.println(msgGo);
        msgGo = verGo.contiene(gaseosa) ? "SI tiene galleta" : "NO tiene galleta";
        System.out.println(msgGo);
        
    
        
        Verificadora<Estudiante> verEs = new Verificadora<Estudiante>(Mujeres);

        String msgEs = verEs.contiene(estu1) ? "SI tiene Estudiante 1" : "NO tiene Estudiante 1";
        System.out.println(msgEs);
        msgEs = verEs.contiene(estu3) ? "SI tiene Estudiante 3" : "NO tiene Estudiante 3";
        System.out.println(msgEs);
        
       


    }

}
