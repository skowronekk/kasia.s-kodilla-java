package com.kodilla.testing.forum.statistics;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics();

        int userCount = 100;
        int postsCount = 1000;
        int commentsCount = 0;
        List<String> theList = new ArrayList<>();
        for(int n=0; n< 100; n++) {
            theList.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(commentsCount / postsCount, forumStatistics.getAvgCommentCountPerPost(), 0);
        assertEquals( commentsCount / userCount, forumStatistics.getAvgCommentCountPerUser(), 0);
        assertEquals(postsCount / userCount, forumStatistics.getAvgPostCountPerUser(), 0);
    }


}
