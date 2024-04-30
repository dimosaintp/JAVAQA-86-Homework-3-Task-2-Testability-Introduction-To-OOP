public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double h = 1.87;
        double w = 98;
        int bmi = service.calculate(h,w);
        System.out.println(bmi);
    }
}