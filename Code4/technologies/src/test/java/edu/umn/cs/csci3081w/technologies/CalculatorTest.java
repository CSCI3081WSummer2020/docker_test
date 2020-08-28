package edu.umn.cs.csci3081w.technologies;

import edu.rice.autograder.annotations.Grade;
import edu.rice.autograder.annotations.GradeTopic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@GradeTopic(project = "technologies", topic = "Calculator")
public class CalculatorTest {

  @Test
  @Grade(project = "technologies", topic = "Calculator", points = 1.0)
  public void testAdd(){
    Calculator c = new Calculator();
    int result = c.add(3, 3);
    assertTrue(result==6);
  }

  @Test
  @Grade(project = "technologies", topic = "Calculator", points = 1.0)
  public void testSubtraction(){
    Calculator c = new Calculator();
    int result = c.subtract(3, 3);
    assertTrue(result==0);
  }

  @Test
  @Grade(project = "technologies", topic = "Calculator", points = 1.0)
  public void testMultiply(){
    Calculator c = new Calculator();
    int result = c.multiply(5, 5);
    assertTrue(result==25);
  }
}
