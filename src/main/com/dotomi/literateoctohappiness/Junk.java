package com.dotomi.literateoctohappiness;

import org.tap4j.model.*;
import org.tap4j.producer.*;
import org.tap4j.util.StatusValues;

public class Junk {
    public static void main(String[] args) {
        TapProducer tapProducer = TapProducerFactory.makeTap13Producer();
        TestSet testSet = new TestSet();

// Creating a Plan with 2 test Result's
        Plan plan = new Plan( 2 );
        testSet.setPlan(plan);
// Creating a test Result with a status ok
        TestResult tr1 = new TestResult( StatusValues.OK, 1 );
        testSet.addTestResult(tr1);

// Creating a test Result with status not_ok
        TestResult tr2 = new TestResult( StatusValues.NOT_OK, 2 );
        testSet.addTestResult(tr2);

// Retrieving the TAP content and printing it to the default output
        String tapStream = tapProducer.dump( testSet );
        System.out.println( tapStream );
    }
}
