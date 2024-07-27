import org.example.testcontextwebclientsslissue.samples.*;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    // springboottest
    Test1.class,

    // properties (with @Spybean, with classes, with properties)
    Test2.class,
    Test3.class,
    Test4.class,
    Test5.class,
    Test6.class,
    Test7.class,
    Test8.class,
    Test9.class,
    Test10.class,
    Test11.class,
    Test12.class,
    Test13.class,
    Test14.class,
    Test15.class,
    Test16.class,
    Test17.class,
    Test18.class,
    Test19.class,
    Test20.class,
    Test21.class,
    Test22.class,
    Test23.class,
    Test24.class,
    Test25.class,
    Test26.class,
    Test27.class,
    Test28.class,
    Test29.class,
    Test30.class,
    Test31.class,
    Test32.class,

    // Normal broken
    WebClientTest.class
})

class TestSuiteTest {

}
