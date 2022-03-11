package botSamsungAir;


import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bot.air.model.MotionStub;

public class TestMotionStubs {
	
	private MotionStub motionStub;
	
	@Test
	public void InitializationWithInvalidePattern_ThrowsArgumentOutOfRangeException() {
		//assertThrows(ArgumentOutOfRangeException, motionStub) manque MotionStub avec les exceptions pour finir
	}
	
	@Test
	public void InitializationWithNoInitialPosition_ThrowsArgumentException() {
		//assertThrows(ArgumentException, motionStub) manque MotionStub avec les exceptions pour finir
	}
	
	@Test
	public void InitializationWithTooManyPosition_ThrowsArgumentException() {
		//assertThrows(ArgumentException, motionStub) manque MotionStub avec les exceptions pour finir
	}
	
	@Test
	public void InitializationWithNonRectangle_FillWithEmpty() {
		this.motionStub = new MotionStub();
		//assertTrue(motionStub.move(1));
	}
	
	
	
	
}
