package com.cropin.services.valueobject;


import java.util.regex.Pattern;
import javax.persistence.Embeddable;

/**
 * Created by Pranay on 14/12/18
 */

@Embeddable
public class AadharNumber extends BaseValueObject{

  private String aadharNumber;

  public AadharNumber() {
  }

  public AadharNumber(String aadharNumber) {
        if (validateAadharNumber(aadharNumber))
            this.aadharNumber = aadharNumber;
        else{
          //throw new InvalidDataFormatException(new InvalidDataDetails(ExceptionMessage.AADHAR_NUMBER_PROPERTY,aadharNumber,ExceptionMessage.AADHAR_NUMBER_CODE,ExceptionMessage.AADHAR_NUMBER_MESSAGE));
        }
    }

    private static boolean validateAadharNumber(String aadharNumber){
        Pattern aadharPattern = Pattern.compile("\\d{12}");
        boolean isValidAadhar = aadharPattern.matcher(aadharNumber).matches();
        if(isValidAadhar){
            isValidAadhar = VerhoeffAlgorithm.validateVerhoeff(aadharNumber);
        }
        return isValidAadhar;
    }

  static class VerhoeffAlgorithm{

        static int[][] d  = new int[][] {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 0, 6, 7, 8, 9, 5},
            {2, 3, 4, 0, 1, 7, 8, 9, 5, 6},
            {3, 4, 0, 1, 2, 8, 9, 5, 6, 7},
            {4, 0, 1, 2, 3, 9, 5, 6, 7, 8},
            {5, 9, 8, 7, 6, 0, 4, 3, 2, 1},
            {6, 5, 9, 8, 7, 1, 0, 4, 3, 2},
            {7, 6, 5, 9, 8, 2, 1, 0, 4, 3},
            {8, 7, 6, 5, 9, 3, 2, 1, 0, 4},
            {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
        };
        static int[][] p = new int[][] {
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 5, 7, 6, 2, 8, 3, 0, 9, 4},
            {5, 8, 0, 3, 7, 9, 6, 1, 4, 2},
            {8, 9, 1, 6, 0, 4, 3, 5, 2, 7},
            {9, 4, 5, 3, 1, 2, 6, 8, 7, 0},
            {4, 2, 8, 6, 5, 7, 3, 9, 0, 1},
            {2, 7, 9, 3, 8, 0, 6, 4, 1, 5},
            {7, 0, 4, 6, 9, 1, 3, 2, 5, 8}
        };
        static int[] inv = {0, 4, 3, 2, 1, 5, 6, 7, 8, 9};

        private static boolean validateVerhoeff(String num){
            int c = 0;
            int[] myArray = StringToReversedIntArray(num);
            for (int i = 0; i < myArray.length; i++){
                c = d[c][p[(i % 8)][myArray[i]]];
            }

            return (c == 0);
        }
        private static int[] StringToReversedIntArray(String num){
            int[] myArray = new int[num.length()];
            for(int i = 0; i < num.length(); i++){
                myArray[i] = Integer.parseInt(num.substring(i, i + 1));
            }
            myArray = Reverse(myArray);
            return myArray;
        }
        private static int[] Reverse(int[] myArray){
            int[] reversed = new int[myArray.length];
            for(int i = 0; i < myArray.length ; i++){
                reversed[i] = myArray[myArray.length - (i + 1)];
            }
            return reversed;
        }
  }

  public String getAadharNumber() {
    return aadharNumber;
  }
}


