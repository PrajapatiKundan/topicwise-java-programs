import java.util.Arrays;

public class ShallowCopy {
    int[] data;
    public ShallowCopy(int[] values) {
        data = values;
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] values = {3, 7, 9};

        ShallowCopy obj = new ShallowCopy(values);
        obj.showData();

        values[0] = 13;
        obj.showData();

    }
}
