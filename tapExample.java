

TapProducer tapProducer = TapProducerFactory.makeTap13Producer();
        testSet testSet = new testSet();

// Creating a Plan with 2 test Result's
        Plan plan = new Plan( 2 );
        testSet.setPlan(plan);

// Creating a test Result with a status ok
        testResult tr1 = new testResult( StatusValues.OK, 1 );
        testSet.addtestResult(tr1);

// Creating a test Result with status not_ok
        testResult tr2 = new testResult( StatusValues.NOT_OK, 2 );
        testSet.addtestResult(tr2);

// Retrieving the TAP content and printing it to the default output
        String tapStream = tapProducer.dump( testSet );
        System.out.println( tapStream );