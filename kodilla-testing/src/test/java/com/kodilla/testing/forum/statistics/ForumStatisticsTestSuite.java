package com.kodilla.testing.forum.statistics;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int userCount = 100;
        int postsCount = 1000;
        int commentsCount = 0;
        List<String> theList = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            theList.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(commentsCount / postsCount, forumStatistics.getAvgCommentCountPerPost(), 0);
        assertEquals(commentsCount / userCount, forumStatistics.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / userCount, forumStatistics.getAvgPostCountPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int userCount = 0;
        int postsCount = 0;
        int commentsCount = 5;
        List<String> theList = new ArrayList<>();
        for (int n = 0; n < userCount; n++) {
            theList.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getAvgCommentCountPerPost(), 0);
        assertEquals(0, forumStatistics.getAvgCommentCountPerUser(), 0);
        assertEquals(0, forumStatistics.getAvgPostCountPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int userCount = 4;
        int postsCount = 40;
        int commentsCount = 20;
        List<String> theList = new ArrayList<>();
        for (int n = 0; n < userCount; n++) {
            theList.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.5, forumStatistics.getAvgCommentCountPerPost(), 0);
        assertEquals(commentsCount / userCount, forumStatistics.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / userCount, forumStatistics.getAvgPostCountPerUser(), 0);
    }

    @Test
    public void testCalculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int userCount = 4;
        int postsCount = 20;
        int commentsCount = 40;
        List<String> theList = new ArrayList<>();
        for (int n = 0; n < userCount; n++) {
            theList.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(commentsCount / postsCount, forumStatistics.getAvgCommentCountPerPost(), 0);
        assertEquals(commentsCount / userCount, forumStatistics.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / userCount, forumStatistics.getAvgPostCountPerUser(), 0);
    }
}
