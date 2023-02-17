package project_utils;

public class AreNumbersEqual {

    public int areNumbersEqual (int a, int b) {

        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        }
        else return 5;
    }
}
