import java.util.Scanner;

/**
 * Class Converter will contain the main method.
 */
public class Converter {
    /**
     * Method moreConversions is used to see if the user would like to input more conversions.
     * @return returns a bool, if true program continues, if false program ends.
     */
    public static boolean moreConversions() {
        System.out.println("Would you like to do another conversion? Yes/No"); //prompt user decision
        Scanner userDecision = new Scanner(System.in); //Scanner object
        String decision = userDecision.nextLine();
        decision = decision.toLowerCase();

        if(decision.contains("yes")){ return true;} //program will continue.
        else if(decision.contains("no")){return false;} //program ends.
        return true;} //otherwise program will continue.

    /**
     *  main method will look at user input and make an object based on the input, use the object to call the method from the specific
     *  class to complete the conversion.
     */
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in); //Scanner object instantiation

        boolean stillconverting = true;
        while (stillconverting) {
            System.out.print("Enter a unit conversion here: "); //prompt for input.
            String userentry = getInput.nextLine(); //this will allow user to enter their question/conversion.
            userentry = userentry.toLowerCase(); //will just take the users enter and convert it so we dont have to worry about case sensitivity.
            String numberonly = userentry.replaceAll("[^0-9,.]", ""); //reads through the string and leaves the number user wants to convert.
            double numbertouse = Double.parseDouble(numberonly); //parse it to a double to convert value of units.

            if (userentry.indexOf("gram") < userentry.indexOf("ounce")
                    || userentry.indexOf("gram") < userentry.indexOf("pound")) { //check what order the words appear for which method to call.
                MassConversion englishToMetric = new MassConversion(); //create object
                englishToMetric.setStatement(userentry);
                englishToMetric.setMagnitude(numbertouse);
                englishToMetric.toMetric(englishToMetric.getStatement(),englishToMetric.getMagnitude());
                //object calls method to calculate result.
            } else {
                MassConversion metricToEnglish = new MassConversion(); //create object
                metricToEnglish.setStatement(userentry);
                metricToEnglish.setMagnitude(numbertouse);
                metricToEnglish.toEnglish(metricToEnglish.getStatement(),metricToEnglish.getMagnitude());
                //object calls method to calculate result.
            }

            if (userentry.indexOf("meter") < userentry.indexOf("inch") || userentry.indexOf("meter") <
                    userentry.indexOf("feet") || userentry.indexOf("meter") < userentry.indexOf("yard") || userentry.indexOf("meter") <
                    userentry.indexOf("foot")) { //checking for what order the  the words are placed.
                LengthConversion englishToMetric = new LengthConversion(); //create object
                englishToMetric.setUserStatement(userentry);
                englishToMetric.setUserValue(numbertouse);
                englishToMetric.convertToMetric(englishToMetric.getUserStatement(),englishToMetric.getUserValue());
                //object calls method to calculate result.
            } else {
                LengthConversion metricToEnglish = new LengthConversion(); //create object
                metricToEnglish.setUserStatement(userentry);
                metricToEnglish.setUserValue(numbertouse);
                metricToEnglish.convertToEnglish(metricToEnglish.getUserStatement(),metricToEnglish.getUserValue());
                //object calls method to calculate result.
            }

            if (userentry.indexOf("liter") < userentry.indexOf("gallon") || userentry.indexOf("liter") <
                    userentry.indexOf("quart") || userentry.indexOf("liter") < userentry.indexOf("pint")) {//checking for what order the words are placed.
                VolumeConversion englishToMetric = new VolumeConversion(); //create object
                englishToMetric.setUserEntry(userentry);
                englishToMetric.setEnteredValue(numbertouse);
                englishToMetric.metricVolume(englishToMetric.getUserEntry(),englishToMetric.getEnteredValue());
                //object calls method to calculate value
            } else {
                VolumeConversion metricToEnglish = new VolumeConversion();  //create object
                metricToEnglish.setUserEntry(userentry);
                metricToEnglish.setEnteredValue(numbertouse);
                metricToEnglish.englishVolume(metricToEnglish.getUserEntry(),metricToEnglish.getEnteredValue());
                //object calls method to calculate result.
            }

            if (userentry.indexOf("fahrenheit") < userentry.indexOf("celsius") || userentry.indexOf("fahrenheit") <
                    userentry.indexOf("kelvin")){
                TempConversion convertEnglish = new TempConversion();  //create object
                convertEnglish.setStatementUsed(userentry);
                convertEnglish.setTempValue(numbertouse);
                convertEnglish.toFahrenheit(convertEnglish.getStatementUsed(),convertEnglish.getTempValue());
                //object calls method to calculate result.
            }else{
                TempConversion convertMetric = new TempConversion();  //create object
                convertMetric.setStatementUsed(userentry);
                convertMetric.setTempValue(numbertouse);
                convertMetric.toMetricTemp(convertMetric.getStatementUsed(),convertMetric.getTempValue());
                //object calls method to calculate result.
            }

            stillconverting = moreConversions(); //calls function more conversions to see if user is done converting.
        }
    }
}


