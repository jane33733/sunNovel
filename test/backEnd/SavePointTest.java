package backEnd;

import org.junit.Test;

import com.sun.controller.UserSaveController;

public class SavePointTest {

	
	@Test
	public void test() {
		try {
			UserSaveController controller = new UserSaveController();
			controller.loadGame("jane");
			System.out.println("the end");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
