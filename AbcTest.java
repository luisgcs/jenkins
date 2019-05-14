import org.junit.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;


public class AbcTest {
    public static void main(String[] args) {
        System.out.println("add");
        int a = 0;
        int b = 0;
        Abc teste = new Abc(a, b);
        int expResult = 0;
        int result = teste.add(a, b);
        Assert.assertEquals(expResult, result);
    }
}