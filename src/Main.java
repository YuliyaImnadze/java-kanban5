import task.Task;
import task.TaskStatus;
import task.sub.Epic;
import task.sub.SubTask;
import service.*;

public class Main {
    public static void main(String[] args) {

        TaskManager inMemoryTaskManager = Managers.getDefault();

        inMemoryTaskManager.createTask(new Task("Таск 1", TaskStatus.NEW, "Доделать тз"));
        inMemoryTaskManager.createTask(new Task("Таск 2", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 3", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 4", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 5", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 6", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 7", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 8", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 9", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 10", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 11", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 12", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createTask(new Task("Таск 13", TaskStatus.NEW, "Купить еды"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 1", TaskStatus.NEW, "Покупка квартиры"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 2", TaskStatus.NEW, "Продажа дачи"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 3", TaskStatus.NEW, "Покупка квартиры"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 4", TaskStatus.NEW, "Продажа дачи"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 5", TaskStatus.NEW, "Покупка квартиры"));
        inMemoryTaskManager.createEpic(new Epic("Эпик 6", TaskStatus.NEW, "Продажа дачи"));
        inMemoryTaskManager.addSubTask(new SubTask("Сабтаск 1", TaskStatus.NEW, "---", 15));
        inMemoryTaskManager.addSubTask(new SubTask("Сабтаск 2", TaskStatus.NEW, "---", 15));
        inMemoryTaskManager.addSubTask(new SubTask("Сабтаск 3", TaskStatus.NEW, "---", 16));

     /*   inMemoryTaskManager.addSubTask(new SubTask("Подать объявление", TaskStatus.NEW, "Разместить объявление в газете", 3));
        inMemoryTaskManager.addSubTask(new SubTask("Подписать договор", TaskStatus.NEW, "Заключить договор", 3));
        inMemoryTaskManager.addSubTask(new SubTask("Найти покупателя", TaskStatus.NEW, "Подписать договор с риэлтором", 4));
        // inMemoryTaskManager.deleteAllTasks();
        //     inMemoryTaskManager.deleteSubtaskById(6);
        //     inMemoryTaskManager.deleteAllEpics();
        //   inMemoryTaskManager.deleteEpicById(3);
        // System.out.println(inMemoryTaskManager.getTasks());
        //      inMemoryTaskManager.updateTask(new Task("Учеба", TaskStatus.IN_PROGRESS, "Доделать тз"));
        inMemoryTaskManager.updateEpic(new Epic("Квартира", TaskStatus.IN_PROGRESS, "Приобретение квартиры"));
        inMemoryTaskManager.updateSubtask(new SubTask("Подать объявление", TaskStatus.DONE, "Разместить объявление в газете", 3));
        inMemoryTaskManager.updateSubtask(new SubTask("Подписать договор", TaskStatus.DONE, "Заключить договор", 3));
        inMemoryTaskManager.updateSubtask(new SubTask("Найти покупателя", TaskStatus.DONE, "Подписать договор с риэлтором", 4));
        inMemoryTaskManager.addSubTask(new SubTask("Документы в МФЦ", TaskStatus.IN_PROGRESS, "Отдать документы в МФЦ", 3));
//        inMemoryTaskManager.deleteSubtaskById(5);
//        inMemoryTaskManager.updateSubtask(new SubTask("Подписать договор", TaskStatus.IN_PROGRESS, "Заключить договор", 3));
//        System.out.println(inMemoryTaskManager.getEpics());
//        System.out.println(inMemoryTaskManager.getAllSubtasks()); */
        for (int i = 1; i <= 13; i++) {
            inMemoryTaskManager.getTaskByID(i);
        }
        for (int i = 14; i <= 18; i++) {
            inMemoryTaskManager.getEpicByID(i);
        }
        inMemoryTaskManager.getTaskByID(4);
        inMemoryTaskManager.getSubtaskByID(20);
        inMemoryTaskManager.getSubtaskByID(21);
        inMemoryTaskManager.getTaskByID(9);
        inMemoryTaskManager.getSubtaskByID(22);

        System.out.println(inMemoryTaskManager.getHistory());
    }
}