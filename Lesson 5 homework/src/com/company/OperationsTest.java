package com.company;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OperationsTest {

    @org.testng.annotations.BeforeMethod
    public void setUp() throws Exception {

    }


    @DataProvider(name = "dataProviderForPositiveFlow")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3.0, "+", 2.0, "5.0"},
                {2.0, "+", -1.0, "1.0"},
                {-2.0, "+", -1.0, "-3.0"},
                {2.0, "-", 1.0, "1.0"},
                {2.0, "-", -1.0, "3.0"},
                {-2.0, "-", -1.0, "-1.0"},
                {2.0, "*", 2.0, "4.0"},
                {2.0, "*", -2.0, "-4.0"},
                {2.0, "*", 0.0, "0.0"},
                {2.0, "/", 2.0, "1.0"},
                {2.0, "/", 0.5, "4.0"},
                {0.0, "/", 2.0, "0.0"},
        };
    }

    @DataProvider(name = "providerForSigns")
    public Object[][] dataProviderSigns() {
        return new Object[][]{
                {"+", "+"},
                {"-", "-"},
                {"*", "*"},
                {"/", "/"}

        };
    }

    @Test(dataProvider = "providerForSigns")
    public void testValidateElementSignPositive(String sign, String expected_sign) throws Exception {
        Operations ops = new Operations();
        Element expected = new Element();
        Element test = ops.validateElement(sign, "sign");
        Assert.assertEquals(test.sign, expected_sign);

    }


    //Exceptions testing
    @org.testng.annotations.Test(expectedExceptions = IncorrectElException.class)
    public void testValidateElementIncorrectSign() throws Exception {
        Operations ops = new Operations();
        Element expected = new Element();
        expected.sign = "+";
        Element test = ops.validateElement("6", "sign");
    }

    //Exceptions testing
    @org.testng.annotations.Test(expectedExceptions = IncorrectElException.class)
    public void testValidateElementCharReceived() throws Exception {
        Operations ops = new Operations();
        Element expected = new Element();
        expected.sign = "+";
        Element test = ops.validateElement("sdf", "element");
    }


    @org.testng.annotations.Test(expectedExceptions = QuitException.class)
    public void testValidateElementQuitSign() throws Exception {
        Operations ops = new Operations();
        Element expected = new Element();
        expected.sign = "+";
        Element test = ops.validateElement("quit", "sign"); }

    @org.testng.annotations.Test(expectedExceptions = QuitException.class)
    public void testValidateElementQuit() throws Exception {
        Operations ops = new Operations();
        Element expected = new Element();
        expected.sign = "+";
        Element test = ops.validateElement("quit", "Element"); }





    @org.testng.annotations.Test(dataProvider = "dataProviderForPositiveFlow")
    public void testCalculate(double first, String sign, double second, String expected) throws Exception {
        Operations ops = new Operations();
        String result = ops.calculate(first, sign, second);
        Assert.assertEquals(result, expected);
    }

    @Test(expectedExceptions = DivideByZeroException.class)
    public void testCalculateDivideByZero() throws Exception {
        Operations ops = new Operations();
        String result = ops.calculate(1.0, "/", 0.0); }

    @org.testng.annotations.AfterMethod
    public void tearDown() throws Exception {
    }


}