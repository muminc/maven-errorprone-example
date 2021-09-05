package com.choudhury.errorprone;

import org.checkerframework.checker.nullness.qual.Nullable;

public class FailingNullAwayClass {

    public void myMethod(){
        String myValue = myMethodWhichCanReturnNull("my param");
        System.out.println("my return word length = " + myValue.length());

        // below commented out code will be acceptable for nullaway as it handles the potential null-value
        /*
        @Nullable  String myValue = myMethodWhichCanReturnNull("my param");
        if (myValue==null){
            System.out.println("Sorry I didn't receive a word");
        }
        else {
            System.out.println("my return word length = " + myValue.length());
        }
         */
    }


    /* to get nullaway checks to pass you need to add annotation @Nullable to this method */
    //@Nullable
    public String myMethodWhichCanReturnNull(String word){
        if (word.length() % 2 ==0){
            return "thanks for the even number word";
        }
        return null;
    }
}
