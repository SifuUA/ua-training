package java.com.okres.tasks.task3.Model;

import com.okres.tasks.task3.Util.RegularExpressions;

public class Model {


    public boolean check(String tmp, int flag) {
        if (flag == 0 || flag == 1)
            return tmp.matches(RegularExpressions.FIRST_SECOND_NAME);
        else if (flag == 2)
        return false;
    }
}
