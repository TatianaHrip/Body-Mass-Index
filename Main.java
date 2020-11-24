public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 85;
        float height = 1.71f;
        float index = service.calculate(1.71f, 85);
        System.out.println(index);


    }
}
