package com.yourOrganization.variablesandocuments;

public class VariabilesAndComments {
    public static void main(String[] args) {

        byte lowerLimitOfByteDataType;
        byte  upperLimitOfByteDataType;

        short lowerLimitOfshortDataType;
        short upperLimitOfshortDataType;

        int lowerLimitOfIntDataType;
        int upperLimitOfIntDataType;

        long lowerLimitOfLongDataType;
        long upperLimitOfLongDataType;

        float lowerLimitOfFloatDataType;
        float upperLimitOfFloatDataType;

        double lowerLimitOfDoubleDataType;
        double upperLimitOfDoubleDataType;

        char lowerLimitOfCharDataType;
        char lowerPrintableLimitOfCharDataType;
        char upperLimitOfCharDataType;
        char upperPrintableLimitOfCharDataType;

        boolean lowerLimitOfBooleanDataType;
        boolean upperLimitOfBooleanDataType;

////////////////////////////////////////////////////////////

         lowerLimitOfByteDataType = -128;
         upperLimitOfByteDataType = 127;

        System.out.println("Minimum byte value is : " + lowerLimitOfByteDataType);
        System.out.println("Maximum byte value is : " + upperLimitOfByteDataType);

         lowerLimitOfshortDataType = -32768;
         upperLimitOfshortDataType = 32767;

        System.out.println("Minimum short value is : " + lowerLimitOfshortDataType);
        System.out.println("Maximum short value is : " + upperLimitOfshortDataType);


         lowerLimitOfIntDataType = -2147483648;
         upperLimitOfIntDataType = 2147483647;

        System.out.println("Minimum integer value is : " + lowerLimitOfIntDataType);
        System.out.println("Maximum integer value is : " + upperLimitOfIntDataType);

         lowerLimitOfLongDataType = -9223372036854775808L;
         upperLimitOfLongDataType = 9223372036854775807L;

        System.out.println("Minimum long value is : " + lowerLimitOfLongDataType);
        System.out.println("Maximum long value is : " + upperLimitOfLongDataType);

        lowerLimitOfFloatDataType = 1.40129846432481707e-45f;
         upperLimitOfFloatDataType = 3.40282346638528860e+38f;

        System.out.println("Minimum float value is : " + lowerLimitOfFloatDataType);
        System.out.println("Maximum float value is : " + upperLimitOfFloatDataType);

         lowerLimitOfDoubleDataType = 4.94065645841246544e-324d;
         upperLimitOfDoubleDataType = 1.7976931348623157E308d;

        System.out.println("Minimum double value is : " + lowerLimitOfDoubleDataType);
        System.out.println("Maximum double value is : " + upperLimitOfDoubleDataType);

        lowerLimitOfCharDataType = '\u0000';
        lowerPrintableLimitOfCharDataType = '!';
        upperLimitOfCharDataType = '\u007F';
        upperPrintableLimitOfCharDataType = '~';

        System.out.println("Minimum char value is : " + lowerLimitOfCharDataType);
        System.out.println("Minimum Printable char value is : " + lowerPrintableLimitOfCharDataType);
        System.out.println("Maximum char value is : " + upperLimitOfCharDataType);
        System.out.println("Maximum Printable char value is : " + upperPrintableLimitOfCharDataType);

         lowerLimitOfBooleanDataType = false;
         upperLimitOfBooleanDataType = true;

        System.out.println("Minimum boolean value is : " + lowerLimitOfBooleanDataType);
        System.out.println("Maximum boolean value is : " + upperLimitOfBooleanDataType);

//       for (int i = 33; i <=126; i++) {
//           char ch = (char)i;
//           System.out.println("ACII: " + i + "chhar:" + ch);
//          }
       }
    }
