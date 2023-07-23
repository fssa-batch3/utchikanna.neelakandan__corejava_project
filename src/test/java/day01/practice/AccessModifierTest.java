package day01.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessModifierTest {

    @Test
    public void testSetAndGetFirst() {
        AccessModifier one = new AccessModifier();
         System.out.println("Utchikanna");
        one.setFirst("Utchikanna");
        
        if(one.getFirst().equals("Utchikanna")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("Utchikanna", one.getFirst());
    }

    @Test
    public void testSetAndGetSecond() {
        AccessModifier one = new AccessModifier();
        System.out.println("NoOne");
        one.setSecond("NoOne");
        if(one.getSecond().equals("NoOne")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("NoOne", one.getSecond());
    }

    @Test
    public void testSetAndGetThird() {
        AccessModifier one = new AccessModifier();
        System.out.println("Oppenheimer");
        one.setThird("Oppenheimer");
        if(one.getThird().equals("Oppenheimer")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
        assertEquals("Oppenheimer", one.getThird());
    }

    @Test
    public void testSetAndGetFourth() {
        AccessModifier one = new AccessModifier();
        System.out.println("Barbie");
        one.setFourth("Barbie");
        if(one.getFourth().equals("Barbie")) {
        	System.out.println("Pass");
        	
        }else {
          System.out.println("Fail");
        	
        }
       
        assertEquals("Barbie", one.getFourth());
    }
}