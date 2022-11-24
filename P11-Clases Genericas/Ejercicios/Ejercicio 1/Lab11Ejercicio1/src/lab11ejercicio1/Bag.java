package lab11ejercicio1;

public class Bag<T> {

    private T[] list;
    private int count; 

    public Bag(int n) {
        this.list = (T[]) new Goodies[n];
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

    @Override
    public String toString() {
        String s = "";
        for (T aux : list) {
            s += String.valueOf(aux) + "\n";
        }
        return s;
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    

}
