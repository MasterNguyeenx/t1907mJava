package Assignment8;

import java.util.ArrayList;

public interface DAOC <E> {
    ArrayList<E> list();
    Boolean add(E e);
    Boolean remove(E e);
    Boolean update(E e);
}
