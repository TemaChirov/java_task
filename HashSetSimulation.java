import java.util.ArrayList;

public class HashSetSimulation {
    private ArrayList<Integer> elements;

    public HashSetSimulation() {
        elements = new ArrayList<>();
    }

    public void add(Integer element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public String toString() {
        return elements.toString();
    }

    public Integer getElementByIndex(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }
}