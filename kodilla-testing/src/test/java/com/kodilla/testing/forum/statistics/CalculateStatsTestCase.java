package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.LinkedList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatsTestCase {

    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test #" + testCounter+ " finished");
    }

    //Test#1 which tests all averages when number of posts equals to zero;
    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 0.0;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 1.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 0.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);


    }

    //Test#2 which tests all averages when number of posts equals to 1000;
    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 0.1;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 1.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 10.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }

    //Test#3 which tests all averages when number of comments equals to 0;
    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 0.0;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 0.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 1.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }

    //Test#4 which tests all averages when number of comments is smaller than number of posts
    @Test
    public void testCalculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 0.5;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 0.5;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 1.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }

    //Test#5 which tests all averages when number of comments is bigger than number of posts
    @Test
    public void testCalculateAdvStatistics5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 2.0;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 1.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 0.5;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }

    //Test#6 which tests all averages when number of users equals to 0;
    @Test
    public void testCalculateAdvStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 1.0;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 0.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 0.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }

    //Test#3 which tests all averages when number of users equals to 100;
    @Test
    public void testCalculateAdvStatistics7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = new LinkedList<String>();
        for (int i = 0; i<100; i++) {
            usersNameMock.add("n");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        Double postCommentsAverage = calculateStats.getPostCommentsAverage();
        Double postCommentsAverageExpected = 1.0;
        Double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        Double userCommentsAverageExpected = 1.0;
        Double userPostsAverage = calculateStats.getUserPostsAverage();
        Double userPostsAverageExpected = 1.0;

        //then
        Assert.assertEquals(postCommentsAverageExpected, postCommentsAverage);
        Assert.assertEquals(userCommentsAverageExpected, userCommentsAverage);
        Assert.assertEquals(userPostsAverageExpected, userPostsAverage);

    }
}
