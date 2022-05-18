package service;

import task.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {

    final static int LIST_SIZE = 10;
    List<Task> listHistory = new ArrayList<>();

    @Override
    public void add(Task task) {

            if (listHistory.size() == LIST_SIZE) {
                listHistory.remove(0);
            }
            if (task != null) {
                listHistory.add(task);
            }
    }

    @Override
    public List<Task> getHistory() {
        return listHistory;
    }
}

