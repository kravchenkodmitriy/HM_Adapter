import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntsCalculatorTest {

    @BeforeEach
    void setUp() {
        System.out.println("Запуск до выполнения всех тестов");
    }

    @AfterEach
    void setup(){
        System.out.println("Вызов после выполнения тестов");
    }

    @Test
    public void sum(){
       int arg0 = 2;
       int arg1 = 3;
       int sumArgs = 5;
        Assertions.assertEquals(sumArgs, arg0 + arg1);
    }
    @Test
    public void mult(){
        int arg0 = 4;
        int arg1 = 5;
        int multResult = 20;
        Assertions.assertEquals(multResult, arg0 * arg1);
    }
    @Test
    public void pow(){
        int arg0 = 4;
        int arg1 = 5;
        int powResult = 1024;
        Assertions.assertEquals(powResult, Math.pow(arg0,arg1));
    }
}