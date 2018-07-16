package backEnd;

import org.junit.Test;

import com.sun.controller.SaveDataController;

public class SavePointTest {

	
	@Test
	public void test() {
		try {
			SaveDataController controller = new SaveDataController();
			controller.loadGame("jane");
			System.out.println("the end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
