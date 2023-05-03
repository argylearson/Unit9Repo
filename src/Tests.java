import Trees.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;

public class Tests {
	
	@Test
	public void SendSingleTree() {
		var mockOak = Mockito.mock(Oak.class);
		
		List<Object> treeList = Arrays.asList(mockOak);
		
		TreeHandler.NurtureTrees(treeList);
		
		Mockito.verify(mockOak, times(1)).GrowSeeds();
	}
	
	@Test
	public void SendSeveralTree() {
		var mockOak = Mockito.mock(Oak.class);
		var mockPine = Mockito.mock(Pine.class);
		var mockRedbud = Mockito.mock(Redbud.class);
		var mockBirch = Mockito.mock(Birch.class);
		var mockFir = Mockito.mock(Fir.class);
		var mockJuniper = Mockito.mock(Juniper.class);
		var mockMaple = Mockito.mock(Maple.class);
		
		List<Object> treeList = Arrays.asList(mockOak, mockPine, mockRedbud, mockBirch, mockFir, mockJuniper, mockMaple);
		
		TreeHandler.NurtureTrees(treeList);
		
		Mockito.verify(mockOak, times(1)).GrowSeeds();
		Mockito.verify(mockPine, times(1)).GrowSeeds();
		Mockito.verify(mockRedbud, times(1)).GrowSeeds();
		Mockito.verify(mockBirch, times(1)).GrowSeeds();
		Mockito.verify(mockFir, times(1)).GrowSeeds();
		Mockito.verify(mockJuniper, times(1)).GrowSeeds();
		Mockito.verify(mockMaple, times(1)).GrowSeeds();
	}
}
