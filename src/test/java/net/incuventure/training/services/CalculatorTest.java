package net.incuventure.training.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Jett
 * Date: 5/22/13
 * Time: 1:16 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:test-context.xml")
public class CalculatorTest {


    @Autowired
    Calculator c;

    @Test
    public void testAdd() {
//       Calculator c = new Calculator();

       Integer result = c.add(1, 2);

        assertEquals(new Integer(3), result);

    }

    @Test
    public void testAIsGreater() {
//        Calculator c = new Calculator();

        Integer result = c.add(6,2);

        assertEquals(new Integer(0), result);

    }
}
