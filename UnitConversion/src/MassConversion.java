/**
 * Class MassConversion is to convert the units of mass/weight
 */

public class MassConversion {
    /**
     * field statement is for the users entered statement.
     */
    private String statement; //statement that is picked apart.
    /**
     * field magnitude is for the users entered value.
     */
    private double magnitude; //the value that is being converted.

    /**
     * getter method.
     * @return returning the users statement.
     */
    public String getStatement() { //getter method
        return statement;
    }

    /**
     * setter method.
     * @param statement is the users statement.
     */
    public void setStatement(String statement) { //setter method
        this.statement = statement;
    }

    /**
     * getter method.
     * @return returning the users value.
     */
    public double getMagnitude() { //getter method
        return magnitude;
    }

    /**
     * setter method
     * @param magnitude is the users value.
     */
    public void setMagnitude(double magnitude) { //setter method
        this.magnitude = magnitude;
    }

    /**
     * Method toMetric will take a users statement and convert to a metric mass unit.
     * @param statement the users statement.
     * @param magnitude the users value.
     */
    public void toMetric(String statement, double magnitude){ //method to conver to metric
        //converts pounds to (prefix)-grams.
        if(statement.contains("pound") && statement.contains("gram")) {
            if (statement.contains("kilo")) { magnitude = magnitude / 2.205;
                System.out.printf("It is %f kilograms\n", magnitude);
            } else if (statement.contains("milli")) { magnitude = magnitude * 453592;
                System.out.printf("It is %f milligrams\n", magnitude);
            } else if(statement.contains("gram")) { magnitude = magnitude * 453.592;
                System.out.printf("It is %f grams\n", magnitude);}}
        //converts pounds to (prefix)-grams.
        if(statement.contains("ounce") && statement.contains("grams")){
            if (statement.contains("kilo")){magnitude = magnitude / 35.274;
                System.out.printf("It is %2f kilograms\n", magnitude);
            }else if(statement.contains("milli")){magnitude = magnitude * 28349.5;
                System.out.printf("It is %2f milligrams\n", magnitude);
            }else{ magnitude = magnitude * 28.3495;
                System.out.printf("It is %2f grams\n", magnitude);}
        } }

    /**
     * Method toEnglish will take a users statement and value to convert to an English weight unit.
     * @param statement the users statement.
     * @param magnitude the users value.
     */
    public void toEnglish(String statement, double magnitude){ //method to convert to english
        //converts (prefix)-grams to pounds.
        if(statement.contains("pound") && statement.contains("kilo")){magnitude = magnitude * 2.205;
            System.out.printf("There is %f pounds\n ", magnitude);
        }
        else if(statement.contains("pound") && statement.contains("milli")){magnitude = magnitude / 453592;
            System.out.printf("There is %f pounds\n", magnitude);
        }
        else if(statement.contains("pound")) {magnitude = magnitude / 453.592;
            System.out.printf("There is %f pounds\n", magnitude);}
        //converts (prefix)-grams to ounces.
        if(statement.contains("ounce") && statement.contains("kilo")){magnitude = magnitude * 35.274;
            System.out.printf("There is %f ounces\n", magnitude);
        }
        else if(statement.contains("ounce") && statement.contains("milli")){magnitude = magnitude / 28349.5;
            System.out.printf("There is %f ounces\n", magnitude);
        }
        else if(statement.contains("ounce")){magnitude = magnitude / 28.3495;
            System.out.printf("There is %f ounces\n", magnitude);
        } }

}
