import java.util.Arrays;

public class DeepCopy {
    int[] data;
    public DeepCopy(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
    }

    public void showData() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        int[] values = {3, 7, 9};

        DeepCopy obj = new DeepCopy(values);
        obj.showData();

        values[0] = 13;
        obj.showData();

    }
}
