package aldovalzani.be_hw_m2_w1_d2.testClasses;

public class UtilityArray {
    public boolean elSearch(String[] array, String el) {
        for (String value : array) {
            if (value == el) {
                return true;
            }
        }
        return false;
    }
}
