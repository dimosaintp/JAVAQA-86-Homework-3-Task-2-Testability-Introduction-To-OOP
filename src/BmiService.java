public class BmiService {
    public int calculate (double height, double weight) {
        int hw;
        hw = (int) (weight / (height * height));
        return hw;
    }
}
