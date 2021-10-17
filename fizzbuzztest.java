import fizzbuzz.fizzbuzz;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class fizzbuzztest {

    /* public fizzbuzz fizzbuzz;
     @Before
     public void setup(){
      fizzbuzz = new fizzbuzz();
     } */

     @Test
    public void Testnumber(){
         fizzbuzz fizzbuzz = new fizzbuzz();
         int  number=1;
        String  numberReturned = fizzbuzz.play(number);
         Assert.assertEquals("1",numberReturned);

     }
     @Test
     public void Testfizz()
     {
         fizzbuzz fizzbuzz = new fizzbuzz();
        int number=3;
        String numberreturned=fizzbuzz.play(number);
         Assert.assertEquals("fizz",numberreturned);
     }
    @Test
    public void Testfizzdivisibleby3()
    {
        fizzbuzz fizzbuzz = new fizzbuzz();
        int number=6;
        String numberreturned = fizzbuzz.play(number);
        Assert.assertEquals("fizz",numberreturned);
    }
    @Test
    public void Testbuzz()
    {
        fizzbuzz fizzbuzz = new fizzbuzz();
        int number=5;
        String numberreturned=fizzbuzz.play(number);
        Assert.assertEquals("buzz",numberreturned);
    }
    @Test
    public void Testbuzzdivisibleby5()
    {
        fizzbuzz fizzbuzz = new fizzbuzz();
        int number=5;
        String numberreturned=fizzbuzz.play(number);
        Assert.assertEquals("buzz",numberreturned);
    }

}
