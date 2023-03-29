package parser.parserToJson;

import com.google.gson.Gson;
import object.LabWork;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;

/**
 * Важный класс. Нужен для парсинга в json файл.
 * Без этого класса, программа не сможет функционировать.
 */

public class ParserToJson {

    /**
     * Метод превращает коллекцию в строку переменной result
     * Если запись произошла усмешно, то вернется true, иначе false.
     * @param labs
     * @return
     */
    public boolean serialization(HashSet<LabWork> labs) {
        Gson gson = new Gson();

        String result = gson.toJson(labs);


        try (FileOutputStream out = new FileOutputStream("notes.json");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = result.getBytes();
            bos.write(buffer, 0, buffer.length);

            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        return false;
    }
}
