package lab11actividad3;

public class Bag<T> {

    private T[] list;
    private int count; //Contador de objetos que hay en la bolsa

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull {
        try {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == null) {
                    list[i] = obj;
                    count++;
                    break;
                }
                if (i == list.length - 1) {
                    throw new IsFull("Error");
                }

            }

        } catch (IsFull full) {
            full.mensaje();
        }
    }

    public T[] getObjects() throws IsEmpty {
        try {
            for (T aux : list) {
                if (aux != null) {
                    return list;
                }
            }
            throw new IsEmpty("Error");
        } catch (IsEmpty emp) {
            emp.mensaje();
        }
        return null;
    }

    public void remove(T obj) throws ObjectNoExist {
        try {
            for(int i=0;i<list.length;i++)
            {
                if (list[i] != null) {
                    if (list[i].equals(obj)) {
                        list[i] = null;
                        count--;
                        break;
                    }
                }
                if (i==(list.length - 1)) {
                    throw new ObjectNoExist("Error");
                }
            }
            
        } catch (ObjectNoExist one) {
            one.mensaje();
        }
    }

    public int getIxdex(T obj) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(obj)) {
                return i;
            }
            break;
        }
        return -1;
    }

    public String toString() {
        String s = "";
        for (T aux : list) {
            s += String.valueOf(aux) + "\n";
        }

        return s;
    }

}
/*
• add : agrega un objeto a la bolsa en caso exista capacidad en la bolsa. Si la bolsa
ya no tiene espacio se debe lanzar una excepción del tipo IsFull.
• getObjects : devuelve el arreglo de objetos si hay algúno en la bolsa. Si la bolsa
esta vacía, se debe lanzar la execpción IsEmpty.
• remove : debe eliminar un objeto de la bolsa en caso exista. Sino existe se debe
lanzar la excepción ObjectNoExist
• getIndex : retorna la posición en el arreglo que ocupa un objeto dado. Si este no
se encuentra en la bolsa, debe retornar -1.
• toString : devuelve una cadena con todo el contenido de la bolsa.
 */
