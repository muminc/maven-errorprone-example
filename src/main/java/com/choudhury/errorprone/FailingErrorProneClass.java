package com.choudhury.errorprone;

import java.util.Objects;

public class FailingErrorProneClass implements MyInterface {


    /* ErrorProne should complain about the missing Override annotation*/
    //@Override
    public void methodWithDeadException() {
        new Exception("to demonstrate error- prone failing for this line");
    }

    // equals method without hashCode should trigger Error-Prone error
    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this,obj);
    }
}
