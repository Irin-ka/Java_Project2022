package project_utils;

public class MultipleM {

    public String multipleM (int m) {

        if ((m % 7 ==0) && (m % 9 == 0)) {
            return "Good Number";
        } else if (m % 9 ==0) {
            return "Bad Number";
        } else if (m % 11 ==0) {
            return "Poor Number";
        } else return "-1";
    }
}
