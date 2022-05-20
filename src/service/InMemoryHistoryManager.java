package service;

import task.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {

    private final static int LIST_SIZE = 10;
    private final List<Task> listHistory = new ArrayList<>();

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

