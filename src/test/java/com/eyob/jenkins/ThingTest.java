package com.eyob.jenkins;

import org.junit.Assert;
import org.junit.Test;


public class ThingTest {


    @Test
    public void testN(){
        Thing t = new Thing();
        t.setN(10);
        Assert.assertEquals("N should be 10",10, t.getN());
    }
}
