/**
 * Class TempConversion is to convert the units of Temperature.
 */

public class TempConversion {
    /**
     * field statementUsed is for the users entered statement
     */
    private String statementUsed; //user statement.
    /**
     * field tempValue is for the users entered value.
     */
    private double tempValue; //temperature value.

    /**
     * getter method.
     * @return returning the users statement.
     */
    public String getStatementUsed() { //getter method
        return statementUsed;
    }

    /**
     * setter method
     * @param statementUsed is the users statements.
     */
    public void setStatementUsed(String statementUsed) { //setter method
        this.statementUsed = statementUsed;
    }

    /**
     * getter method.
     * @return returning the users value.
     */
    public double getTempValue() { //getter method
        return tempValue;
    }

    /**
     * setter method.
     * @param tempValue is the users value.
     */
    public void setTempValue(double tempValue) { //setter method
        this.tempValue = tempValue;
    }

    /**
     * Method toMetricTemp will take a users statement and value to convert to a metric temperature.
     * @param statementUsed the users statement.
     * @param tempValue the users value.
     */
    public void toMetricTemp(String statementUsed, double tempValue){
        //fahrenheit to celsius
        if(statementUsed.contains("celsius") && statementUsed.contains("fahrenheit")){
            tempValue = (tempValue - 32) * .56;
            System.out.printf("It is %f degrees Celsius\n", tempValue);
        }
        //fahrenheit to kelvin
        else if(statementUsed.contains("kelvin") && statementUsed.contains("fahrenheit")) {
            tempValue = ((tempValue - 32) * .56) + 273.15;
            System.out.printf("It is %f degrees Kelvin\n", tempValue);
        }
    }


    /**
     * Method toFahrenheit will take a users statement and value to convert to a english temperature.
     * @param statementUsed the users statement.
     * @param tempValue the users value.
     */
    public void toFahrenheit(String statementUsed, double tempValue){
        //converts celsius to fahrenheit
        if(statementUsed.contains("celsius") && statementUsed.contains("fahrenheit")){
            tempValue = (tempValue * .56) + 32;
            System.out.printf("It is %f degrees Fahrenheit\n", tempValue);
        }
        //converts kelvin to fahrenheit
        else if (statementUsed.contains("kelvin") && statementUsed.contains("fahrenheit")){
            tempValue = ((tempValue - 273.15) * 1.8) + 32;
            System.out.printf("It is %f degrees Fahrenheit\n", tempValue);
        }
    }
}
