package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;

	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}

	@Test
		public void numberInsideRangeReturnsValue() {
			Assert.assertEquals( "Error", "Six  Hundred Sixty Six", numberWords.toWords( 666 ) ) ;
		}
	@Test
    public void validnumberPass(){
	    Assert.assertEquals( "Error", "Two  Hundred Twenty Two", numberWords.toWords( 222 ) ) ;
    }
	@Test
	    public void numberThreedigitReturnPass(){
		    Assert.assertEquals( "Error", "Nine  Hundred Ninety Nine", numberWords.toWords( 999 ) ) ;
	}
	@Test
	    public void numberaszeroReturnsError(){
		    Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 0 ) ) ;
	}
	@Test
    public void numberafourdigitReturnsPass(){
	    Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 9999 ) ) ;
    }
	

}
