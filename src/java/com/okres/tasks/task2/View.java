package java.com.okres.tasks.task2;

import java.util.List;

public class View {
    public static final String HI = "Welcome to the Game, number which you must guess is generate ...";

    public void userGreeting() {
        System.out.println(HI);
        System.out.println(String.format("Ready! \nPlease input number between 0 and 100"));

    }

    public void showCurrentRange(int[] range) {
        System.out.println(String.format("Current range: %d to %d", range[0], range[1]));
    }

    public void wrongInput() {
        System.err.println("Wrong input, program support only numeric input");
    }

    public void printResult(String res, int i) {
        if (res.equals(Controller.BIGGER))
            System.out.println("Your number is bigger than my");
        else if (res.equals(Controller.SMALLER))
            System.out.println("Your number is smaller than my");
        else if (res.equals(Controller.WIN)) {
            System.out.println("\nMy congratulations! You are WIN!!!\nTo guess you took " + ++i + " attempts.");
        }
    }

    public void showAllAttempts(List<Integer> previousAnswers) {
        System.out.print("Your previous attempts: ");
        for (Integer e : previousAnswers) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
