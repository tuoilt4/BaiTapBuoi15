package omg;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BaiTapBuoi15_Testcase {
    @Test
    public void testcar() {
        String car[] = {"Mec", "BMW", "Toyota", "Honda", "Vinfast"};
        assertThat(car).isNotEmpty();
        assertThat(car).isNotNull();
        assertThat(car).hasSize(5);
        assertThat(car).doesNotHaveDuplicates();
        for (int i = 0; i < car.length; i++) {
            assertThat(car[i]).isNotEmpty();
            assertThat(car[i]).containsPattern("[\\D]");
        }
    }
}
