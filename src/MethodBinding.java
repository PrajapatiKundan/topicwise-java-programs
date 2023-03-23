import com.shared.Staff;
import com.shared.User;

public class MethodBinding {
    public static void main(String[] args) {
        User staff = new Staff();
        staff.staticMethod();
        staff.postAReview();
        staff.instanceMethod(10);
        /*
        Instead of calling most specific method it calls compatible method of com.shared.User class because it is not override method.
        Trick: If method is not overriden then compatible method called from top of inheritance tree.
        */
    }
}
