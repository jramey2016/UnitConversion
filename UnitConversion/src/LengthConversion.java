
/**
 * Class LengthConversion is to convert the units of length
 */

public class LengthConversion {
    /**
     * field userStatement is for the users entered statement.
     */
    private String userStatement; //users statement.
    /**
     * field userValue is for the users entered value.
     */
    private double userValue; //users value

    /**
     *  setter method.
     * @param userStatement is the users statement.
     */
    public void setUserStatement(String userStatement) { //setter method
        this.userStatement = userStatement;
    }

    /**
     * getter method.
     * @return returning the users statement .
     */
    public String getUserStatement() { //getter method
        return userStatement;
    }

    /**
     * setter method.
     * @param userValue is the users value.
     */
    public void setUserValue(double userValue) { //setter method
        this.userValue = userValue;
    }

    /**
     * getter method.
     * @return returning the users value.
     */
    public double getUserValue() { //getter method
        return userValue;
    }

    /**
     * Method convertToMetric will take a users statement and value to convert to a metric length unit.
     * @param userStatement the users statement.
     * @param userValue the users value.
     */
    public void convertToMetric(String userStatement, double userValue){ //method to convert to metric
        //converts feet to (prefix)-meters.
        if((userStatement.contains("feet") || userStatement.contains("foot")) && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){ userValue = userValue / 3281;
                System.out.printf("It is %f kilometers\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue * 305;
                System.out.printf("It is %f millimeters\n", userValue);
            }else if(userStatement.contains("centi")){userValue = userValue * 30.48;
                System.out.printf("It is %f centimeters\n", userValue);
            }else{userValue = userValue / 3.281;
                System.out.printf("It is %f meters\n", userValue);}
        }
        //converts yards to (prefix)-meters
        if(userStatement.contains("yard") && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){userValue = userValue / 1094;
                System.out.printf("It is %f kilometers\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue * 914.4;
                System.out.printf("It is %f millimeters\n", userValue);
            }else if(userStatement.contains("centi")){ userValue = userValue * 91.44;
                System.out.printf("It is %f centimeters\n", userValue);
            }else{userValue = userValue * 1.094;
                System.out.printf("It is %f meters\n", userValue);}
        }
        //converts inch to (prefix)-meters
        if(userStatement.contains("inch") && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){ userValue = userValue / 39370;
                System.out.printf("It is %f kilometers\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue * 25.4;
                System.out.printf("It is %f millimeters\n", userValue);
            }else if(userStatement.contains("centi")){ userValue = userValue * 2.54;
                System.out.printf("It is %f centimeters\n", userValue);
            }else{userValue = userValue / 39.37;
                System.out.printf("It is %f meters\n", userValue);
            }
        }
    }

    /**
     * Method convertToEnglish will take a users statement and value to convert to an English length unit.
     * @param userStatement the users statement.
     * @param userValue the users value.
     */
    public void convertToEnglish(String userStatement, double userValue){ //method to convert to english
        //converts (prefix)-meters to feet.
        if((userStatement.contains("feet") || userStatement.contains("foot")) && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){ userValue = userValue * 3281;
                System.out.printf("It is %f feet\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue / 305;
                System.out.printf("It is %f feet\n", userValue);
            }else if(userStatement.contains("centi")){userValue = userValue / 30.48;
                System.out.printf("It is %f feet\n", userValue);
            }else{userValue = userValue * 3.281;
                System.out.printf("It is %f feet\n", userValue);}
        }
        //converts (prefix)-meters to yard.
        if(userStatement.contains("yard") && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){userValue = userValue * 1094;
                System.out.printf("It is %f yards\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue / 914.4;
                System.out.printf("It is %f yards\n", userValue);
            }else if(userStatement.contains("centi")){ userValue = userValue / 91.44;
                System.out.printf("It is %f yards\n", userValue);
            }else{userValue = userValue / 1.094;
                System.out.printf("It is %f yards\n", userValue);}
        }
        //converts (prefix)-meters to inches.
        if(userStatement.contains("inch") && userStatement.contains("meter")){
            if(userStatement.contains("kilo")){ userValue = userValue * 39370;
                System.out.printf("It is %f inches\n", userValue);
            }else if(userStatement.contains("milli")){ userValue = userValue / 25.4;
                System.out.printf("It is %f inches\n", userValue);
            }else if(userStatement.contains("centi")){ userValue = userValue / 2.54;
                System.out.printf("It is %f inches\n", userValue);
            }else{userValue = userValue * 39.37;
                System.out.printf("It is %f inches\n", userValue);
            }
        }
    }
}