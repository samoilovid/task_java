public class Main {
    public static void main(String[] args) {

        Section section = new Section(1, 2, 1, 2, "blue");
        Section section1 = new Section(-3, 1, 0, 1, "blue");
        if (section.isEqual(section1)) {
            System.out.println("отрезки равны");
        } else {
            System.out.println("отрезки не равны");
        }
    }
}
