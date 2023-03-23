import com.shared.Editor;
import com.shared.Staff;
import com.shared.User;

public class CanNotOverridden {
    public static void main(String[] args) {
        User staff = new Staff();
        staff.staticMethod();
        staff.instanceMethod(10);
    }
}
