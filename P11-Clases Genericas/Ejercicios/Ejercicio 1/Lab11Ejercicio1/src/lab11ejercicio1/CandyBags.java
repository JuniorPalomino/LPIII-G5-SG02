package lab11ejercicio1;

public class CandyBags<T extends Goodies> extends Bag<T> {


    public CandyBags(int n) {
        super(n);
    }

    public T cheapset() {
        T menor = getList()[0];

        for (int i = 0; i < getList().length; i++) {
            if (getList()[i].getPrice() < menor.getPrice()) {
                menor = getList()[i];
            }
        }
        return menor;
    }

    public CandyBags mostExpensive(int n) throws IsFull {
        T aux;
        T[] arrayAux = getList();
        CandyBags<T> nueva = new CandyBags<T>(n);
        try {

            for (int i = 0; i < arrayAux.length; i++) {
                aux = arrayAux[i];
                int j = i - 1;
                while (j >= 0 && getList()[j].getPrice() > aux.getPrice()) {
                    arrayAux[j + 1] = arrayAux[j];
                    j--;
                }
                arrayAux[j + 1] = aux;
            }
            for (int i = (arrayAux.length) - n; i < arrayAux.length; i++) {
                nueva.add(arrayAux[i]);
            }

            return nueva;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            return nueva;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
