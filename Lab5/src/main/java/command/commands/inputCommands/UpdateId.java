package command.commands.inputCommands;

import command.UpdateCommand;
import command.commands.Invoker;

//создаём инвокер - наследника класса Invoker
public class UpdateId extends Invoker {
    //задаём поле для команды
    public UpdateCommand updateEl;

    private static final String COMMAND_NAME = UpdateId.class.getSimpleName();
    //и, наконец, строка с регулярным выражением. Пока что это просто строка с такими вот символами, но в будущем...
    //Это нам будет нужно при вводе команд с параметром. Можешь посмотреть любую команду без аргументом, например, класс show - там regex = null
    //В данном случае шаблон говорит, что ждёт на вход строку типа "число-пробел-слово".
    private static final String regex = "\\d*\\s\\w*";

    //метод для возврата имени команд. Пригодится для создания базы данных из команд (мапов)
    //у команд без аргументов просто возвращает COMMAND_NAME, для программ с аргументами прибавляем регулярку
    public static String getCommandName() {
        return COMMAND_NAME;
    }
    public String getRegex() {
        return regex;
    }
    //конструктор
    public UpdateId(UpdateCommand updateEl) {
        this.updateEl = updateEl;
    }
    //А вот тут важное!
    // В классе Invoker есть общий метод doCommand. Переопределяем его.
    // Обычно достаточно просто ввести [имя команды].execute(s), но тут особый случай.
    @Override
    public void doCommand(String id) {
        //Допустим, на вход пришла команда "update 3 Kulinich228"
        //В App я прописал, как работает алгоритм.
        //По итогу, на вход метода doCommand подаётся строка "3 Kulinich228"
        //Аргумент 1, а нам нужно 2 - id и имя элемента. Поэтому бьём строку надвое.
        //String[] strings = s.split(" ");
        //Первую часть с id мы преобразуем в число, вторую оставляем строкой
        //int id = Integer.parseInt(strings[0].trim());
        //String field = strings[strings.length-1];
        // выполняем команду

        int i = Integer.parseInt(id.replaceAll("^\\D*?(-?\\d+).*$", "$1"));
        updateEl.execute(i);
    }
}
