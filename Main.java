public class Main {
    public static void main(String[] args) {
        HashSetSimulation set = new HashSetSimulation();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Дублирующийся элемент не будет добавлен

        System.out.println("Set elements: " + set.toString());
        System.out.println("Element at index 1: " + set.getElementByIndex(1));
    }
}