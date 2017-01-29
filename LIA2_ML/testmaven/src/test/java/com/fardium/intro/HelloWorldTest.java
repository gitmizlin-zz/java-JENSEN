package com.fardium.intro;


import org.junit.Assert;

public class HelloWorldTest {
	@org.junit.Test
	public void getHello1() throws Exception {
	    long t = System.currentTimeMillis();
		HelloWorld helloWorld = new HelloWorld(new MockTextSource( t + ""));
		Assert.assertEquals("Hello " + t, helloWorld.getText());
	}

	class MockTextSource implements TextSource {
        private String a = "Mock";

        MockTextSource(String a) {
            this.a = a;
        }

		@Override
		public String getText() {
			return a;
		}
	}
}
