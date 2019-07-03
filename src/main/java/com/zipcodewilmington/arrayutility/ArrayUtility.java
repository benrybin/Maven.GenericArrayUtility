package com.zipcodewilmington.arrayutility;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] input;

    public ArrayUtility(T[] input) {
        this.input = input;

    }
    public Integer countDuplicatesInMerge(T[] array,T value){
            Integer count = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == value){
                count++;
            }

        }
        for (int i = 0; i <this.input.length ; i++) {
            if(this.input[i] == value){
                count++;
            }

        }

            return  count;
    }
    public T[] removeValue(T valueToRemove){


        Integer arraySize =0;
        for (int i = 0; i <input.length ; i++) {
            if((input[i]!=valueToRemove)){
                arraySize++;
            }

        }

        T[] answer;
        answer = Arrays.copyOf(input, arraySize);
        Integer count =0;
        for (int i = 0; i <input.length ; i++) {
            if(input[i]!=valueToRemove){
                answer[count] = input[i];
                count++;
            }

        }


        return  answer;
    }
    public T getMostCommonFromMerge(T[] array){
        T answer = array[0];
        Integer counter =1;
        Integer oldcounter=0;
        for (int i = 1; i <array.length ; i++) {
            for (int j = 0; j <array.length-1 ; j++) {
                if(array[i] == array[j]){
                    counter++;
                }

            }
            if(counter >oldcounter){
                answer = array[i];
                oldcounter=counter;
                counter=0;
            }
        }



        return answer;
    }
    public Integer getNumberOfOccurrences(T value){

        Integer count = 0;
        for (int i = 0; i <input.length ; i++) {
            if(input[i] == value){
                count++;
            }

        }
        return count;
    }
}
