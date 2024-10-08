package com.qubite.SchoolPaperwork;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class PaperTests {

    @Test
    public void test1(){
        assertEquals("Failed at paperWork(5,5)",25, SchoolPaperwork.paperWork(5,5));
    }

    @Test
    public void test2(){
        assertEquals("Failed at paperWork(5,-5)",0, SchoolPaperwork.paperWork(5,-5));
    }

    @Test
    public void test3(){
        assertEquals("Failed at paperWork(-5,-5)",0, SchoolPaperwork.paperWork(-5,-5));
    }

    @Test
    public void test4(){
        assertEquals("Failed at paperWork(-5,5)",0, SchoolPaperwork.paperWork(-5,5));
    }

    @Test
    public void test5(){
        assertEquals("Failed at paperWork(5,0)",0, SchoolPaperwork.paperWork(5,0));
    }
}