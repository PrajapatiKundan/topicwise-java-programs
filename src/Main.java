import com.shared.Staff;
import com.shared.User;

public class Main {
    public static void main(String[] args) {
        User staff = new Staff();
        staff.displayUserInfo();

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str1.hashCode() == str3.hashCode());
    }
}