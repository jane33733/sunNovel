package backEnd;

import org.junit.Test;

import com.sun.controller.SavePointController;

public class SavePointTest {

	
	@Test
	public void test() {
		try {
			SavePointController controller = new SavePointController();
			controller.loadGame("jane");
			System.out.println("the end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
