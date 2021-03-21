package com.kodilla.hibernate.tasklist.repository;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    @Test
    public void testFindByListName() {
        // given
        TaskList taskList = new TaskList("ListName", "Description");
        taskListRepository.save(taskList);
        String listName = "ListName";
// when
        List<TaskList> result = taskListRepository.findByListName(listName);
// then
        Assert.assertEquals("ListName", result.get(0).getListName());
        Assert.assertEquals(1, result.size());
    }
}
