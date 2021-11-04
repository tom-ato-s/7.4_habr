//итератор по 2мерному массиву
// https://habr.com/ru/post/440436/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterastorArr2 implements Iterator {
    private String[] [] arr;
    int i, j;
    int iNext;
    int jNext;

    public IterastorArr2(String [] [] arr) {
        this.arr = arr;
    }
    @Override
    public boolean hasNext() {
        if (j != arr[i].length - 1){
            iNext = i;
            jNext = j+1;
            return true;
        }else {
            if (i != arr.length) {
                iNext = i+1;
                jNext = 0;
                return true;
            } else return false;
        }
    }

    @Override
    public Object next() {
        if(!hasNext()) {
            throw new NoSuchElementException();
        } else {
            return arr[iNext][jNext];
        }
    }
}
