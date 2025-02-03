package Structural;

import java.util.HashMap;
import java.util.Map;

// Flyweight
interface Character {
    void print();
}

// Concrete Flyweight
class A implements Character {
    @Override
    public void print() {
        System.out.print("A");
    }
}

class B implements Character {
    @Override
    public void print() {
        System.out.print("B");
    }
}

// Flyweight Factory
class CharacterFactory {
    private static final Map<String, Character> characters = new HashMap<>();
    
    public static Character getCharacter(String key) {
        if (!characters.containsKey(key)) {
            if (key.equals("A")) {
                characters.put("A", new A());
            } else if (key.equals("B")) {
                characters.put("B", new B());
            }
        }
        return characters.get(key);
    }
}

