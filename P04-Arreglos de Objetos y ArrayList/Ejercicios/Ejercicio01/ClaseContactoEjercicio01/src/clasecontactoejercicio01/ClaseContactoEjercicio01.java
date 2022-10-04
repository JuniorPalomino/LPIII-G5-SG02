/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasecontactoejercicio01;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class ClaseContactoEjercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Contacto> contactos = new ArrayList<>();
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int Select;
        int Posic;
        String nombre;
        String telefono;
        String direccion;

        do {
            
            System.out.println("-------AGENDA--------");
            System.out.println("1) AÑADIR CONTACTO");
            System.out.println("2) BUSCAR CONTACTO");
            System.out.println("3) MODIFICAR CONTACTO");
            System.out.println("4) BORRAR CONTACTO");
            System.out.println("5) ELIMINAR CONTACTOS");
            System.out.println("6) MOSTRAR CONTACTOS");
            System.out.println("7) SALIR");
            System.out.println("----------------------");
            System.out.println(" INGRESE UNA OPCIÓN:");
            Select = sn.nextInt();
            sn.nextLine();

            switch (Select) {
                case 1:
                    System.out.println("INGRESE EL NOMBRE:");
                    nombre = sn.nextLine();
                    System.out.println("INGRESE EL TELEFONO:");
                    telefono = sn.nextLine();
                    System.out.println("INGRESE LA DIRECCIÓN:");
                    direccion = sn.nextLine();
                    contactos.add(new Contacto(nombre, telefono, direccion));
                    break;
                case 2:
                    System.out.println("INGRESE EL NOMBRE A BUSCAR:");
                    nombre = sn.nextLine();
                    System.out.println("INGRESE EL TELEFONO A BUSCAR:");
                    telefono = sn.nextLine();
                    System.out.println("INGRESE LA DIRECCIÓN A BUSCAR:");
                    direccion = sn.nextLine();
                    if (contactos.contains(new Contacto(nombre, telefono, direccion))) {
                        System.out.println("SE ECONTRO AL CONTACTO");
                    } else {
                        System.out.println("NO SE ENCUENTRA AL CONTACTO");
                    }
                    break;
                case 3:
                    System.out.println("¿QUÉ NRO CONTACTO ES(0,1,2,3...)?:");
                    Posic = sn.nextInt();
                    sn.nextLine();
                    contactos.remove(Posic);

                    System.out.println("INGRESE EL NUEVO NOMBRE:");
                    nombre = sn.nextLine();
                    System.out.println("INGRESE EL NUEVO TELEFONO:");
                    telefono = sn.nextLine();
                    System.out.println("INGRESE LA NUEVA DIRECCIÓN:");
                    direccion = sn.nextLine();
                    contactos.add(Posic, new Contacto(nombre, telefono, direccion));
                    break;
                case 4:
                    System.out.println("¿QUÉ NRO CONTACTO DESEAS ELIMINAR(0,1,2,3...)?:");
                    Posic = sn.nextInt();
                    contactos.remove(Posic);
                    break;
                case 5:
                    System.out.println("SE BORRARON TODOS LOS CONTACTOS...");
                    contactos.clear();
                    break;
                case 6:
                    for (int i = 0; i < contactos.size(); i++) {
                        System.out.println("----------------------------------------");
                        System.out.println(i+1 + ".NOMBRE: " + contactos.get(i).getNombre());
                        System.out.println(i+1 + ".TELEFONO: " + contactos.get(i).getTelefono());
                        System.out.println(i+1 + ".DIRECCIÓN: " + contactos.get(i).getDireccion());
                        System.out.println("---------------------------------------");
                    }
                    break;
                case 7:
                    salir = true;
            }
        } while (!salir);

    }
}
