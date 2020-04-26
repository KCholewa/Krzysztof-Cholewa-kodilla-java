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

    public List<String> userNameMockListCreator(int n) {
        List<String> usersNameMock = new LinkedList<>();
        for (int i = 0; i<n; i++) {
            usersNameMock.add("n");
        }
        return usersNameMock;
    }

    @Test

    public void testCalculateAdvStatistics1() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(0.0, postCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userCommentsAverage, 0.001);
        Assert.assertEquals(0.0, userPostsAverage, 0.001);
    }



    @Test

    public void testCalculateAdvStatistics2() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(0.1, postCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userCommentsAverage, 0.001);
        Assert.assertEquals(10.0, userPostsAverage, 0.001);

    }

    @Test

    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(0.0, postCommentsAverage, 0.001);
        Assert.assertEquals(0.0, userCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userPostsAverage, 0.001);
    }

    @Test

    public void testCalculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(0.5, postCommentsAverage, 0.001);
        Assert.assertEquals(0.5, userCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userPostsAverage, 0.001);
    }

    @Test

    public void testCalculateAdvStatistics5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(2.0, postCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userCommentsAverage, 0.001);
        Assert.assertEquals(0.5, userPostsAverage, 0.001);
    }

    @Test

    public void testCalculateAdvStatistics6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(0);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(1.0, postCommentsAverage, 0.001);
        Assert.assertEquals(0.0, userCommentsAverage, 0.001);
        Assert.assertEquals(0.0, userPostsAverage, 0.001);

    }

    @Test

    public void testCalculateAdvStatistics7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNameMock = userNameMockListCreator(100);
        when(statisticsMock.usersNames()).thenReturn(usersNameMock);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        double postCommentsAverage = calculateStats.getPostCommentsAverage();
        double userCommentsAverage =  calculateStats.getUserCommentsAverage();
        double userPostsAverage = calculateStats.getUserPostsAverage();

        //then
        Assert.assertEquals(1.0, postCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userCommentsAverage, 0.001);
        Assert.assertEquals(1.0, userPostsAverage, 0.001);
    }
}
