package Test;

import org.testng.annotations.Test;

import Pages.HelloWord;

public class HelloTest {
	@Test(priority = 1)
	public void printHello() {
		HelloWord hw = new HelloWord();
		hw.printHello();
	}
}
