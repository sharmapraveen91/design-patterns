package Behavioral;

import java.util.List;
import java.util.ArrayList;

interface Iterator {
    boolean hasNext();
    Object next();
}

class NameRepository {
    private List<String> names = new ArrayList<>();

    public NameRepository() {
        names.add("John");
        names.add("Jane");
        names.add("Paul");
    }

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        public boolean hasNext() {
            return index < names.size();
        }

        public Object next() {
            if (this.hasNext()) {
                return names.get(index++);
            }
            return null;
        }
    }
}

public class IteratorPattern {
    public static void main(String[] args) {
        NameRepository repository = new NameRepository();
        Iterator iterator = repository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

