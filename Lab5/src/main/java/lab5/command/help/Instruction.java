package lab5.command.help;

import lab5.command.show.Show;

public class Instruction {
    public Instruction(){}
    public static void getInstruction(){
        System.out.println("Доступные  команды\n" +
                Help.class.getSimpleName()+" : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                Show.class.getSimpleName() +" : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "add {element} : добавить новый элемент в коллекцию\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_by_id id : удалить элемент из коллекции по его id\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции\n" +
                "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
                "remove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
                "max_by_author : вывести любой объект из коллекции, значение поля author которого является максимальным\n" +
                "print_unique_tuned_in_works : вывести уникальные значения поля tunedInWorks всех элементов в коллекции\n" +
                "print_field_ascending_tuned_in_works : вывести значения поля tunedInWorks всех элементов в порядке возрастания");
    }
}
