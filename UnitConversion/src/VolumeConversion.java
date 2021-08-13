/**
 * Class VolumeConversion is to convert the units of volume.
 */

public class VolumeConversion {
    /**
     * field userEntry is for the users entered statement.
     */
    private String userEntry; //users statement
    /**
     * field enteredValue is for the users entered value.
     */
    private double enteredValue; //users value

    /**
     * getter method.
     * @return returning the users statement.
     */
    public String getUserEntry() { //getter method
        return userEntry;
    }

    /**
     * setter method.
     * @param userEntry is the users statement.
     */
    public void setUserEntry(String userEntry) { //setter method
        this.userEntry = userEntry;
    }

    /**
     * getter method.
     * @return returning the users value.
     */
    public double getEnteredValue() { //getter method
        return enteredValue;
    }

    /**
     * setter method
     * @param enteredValue is the users value.
     */
    public void setEnteredValue(double enteredValue) { //setter method
        this.enteredValue = enteredValue;
    }

    /**
     * Method metricVolume will take a users statement and value to convert to a metric volume unit.
     * @param userEntry the users statement.
     * @param enteredValue the users value.
     */
    public void metricVolume(String userEntry, double enteredValue) {
        //converts gallon to (prefix)-liter
        if (userEntry.contains("gallon") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue / 264;
                System.out.printf("It is %f kiloliters\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue * 3785;
                System.out.printf("It is %f milliliters\n", enteredValue);
            } else {
                enteredValue = enteredValue * 3.785;
                System.out.printf("It is %f liters\n", enteredValue);
            }
        }
        //converts pint to (prefix)-liter
        if (userEntry.contains("pint") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue / 2113;
                System.out.printf("It is %f kiloliters\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue * 473;
                System.out.printf("It is %f milliliters\n", enteredValue);
            } else {
                enteredValue = enteredValue / 2.113;
                System.out.printf("It is %f liters\n", enteredValue);
            }
        }
        //converts quart to (prefix)-liter
        if (userEntry.contains("quart") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue / 1057;
                System.out.printf("It is %f kiloliters\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue * 946.353;
                System.out.printf("It is %f milliliters\n", enteredValue);
            } else {
                enteredValue = enteredValue / 1.057;
                System.out.printf("It is %f liters\n", enteredValue);
            }
        }
    }

    /**
     * Method englishVolume will take a users statement and value to convert to a english volume unit.
     * @param userEntry the users statement.
     * @param enteredValue the users value.
     */
    public void englishVolume(String userEntry, double enteredValue) {
        //(prefix)-liter to gallon
        if (userEntry.contains("gallon") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue * 264;
                System.out.printf("It is %f gallons\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue / 3785;
                System.out.printf("It is %f gallons\n", enteredValue);
            } else {
                enteredValue = enteredValue / 3.785;
                System.out.printf("It is %f gallons\n", enteredValue);
            }
        }
        //(prefix)-liter to liter
        if (userEntry.contains("pint") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue * 2113;
                System.out.printf("It is %f pints\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue / 479;
                System.out.printf("It is %f pints\n", enteredValue);
            } else {
                enteredValue = enteredValue * 2.113;
                System.out.printf("It is %f pints\n", enteredValue);
            }
        }
        //(prefix)-liter to quart
        if (userEntry.contains("quart") && userEntry.contains("liter")) {
            if (userEntry.contains("kilo")) {
                enteredValue = enteredValue * 1057;
                System.out.printf("It is %f quarts\n", enteredValue);
            } else if (userEntry.contains("milli")) {
                enteredValue = enteredValue / 946.353;
                System.out.printf("It is %f quarts\n", enteredValue);
            } else {
                enteredValue = enteredValue * 1.057;
                System.out.printf("It is %f quarts\n", enteredValue);
            }
        }
    }
}
