/*
Jupiter interaction with junit 5 platfrom
vintage is use to run existing test cases junit4 tests
you can extend Junit5 plantfrom and build you own test framework
we can extend the jupiter itself to add new test cases

junit with maven need maven surefire plugins version 2.22.1 or greater

assertThrows test the exceptions

@beforeEach
public void init(){
    //create new instance before each test
}

@AfterEch
public vid cleanup(){

}

@TestIntance(testInstance.Lifecycle.PER_CLASS) // no nned of static test methods



*/
