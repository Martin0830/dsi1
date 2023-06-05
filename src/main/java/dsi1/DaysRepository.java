package dsi1;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Day;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DaysRepository {
    private static final Map<String, Day> days = new HashMap<>();

    @PostConstruct
    public void initData() {
        Day lunes = new Day();
        lunes.setName("Lunes");
        lunes.setIngles("Monday");
        days.put(lunes.getName(),lunes);

        Day martes = new Day();
        martes.setName("Martes");
        martes.setIngles("Tuesday");
        days.put(martes.getName(),martes);

        Day miercoles = new Day();

        miercoles.setName("Miercoles");
        miercoles.setIngles("Wednesday");
        days.put(miercoles.getName(),miercoles);

        Day jueves = new Day();

        jueves.setName("Jueves");
        jueves.setIngles("Thursday");
        days.put(jueves.getName(),jueves);

        Day viernes = new Day();
        viernes.setName("Viernes");
        viernes.setIngles("Friday");
        days.put(viernes.getName(),viernes);

        Day sabado = new Day();
        sabado.setName("Sabado");
        sabado.setIngles("Saturday");
        days.put(sabado.getName(),sabado);

        Day domingo = new Day();
        domingo.setName("Domingo");
        domingo.setIngles("Sunday");
        days.put(domingo.getName(),domingo);
    }

      

    public Day findDay(String name) {
        Assert.notNull(name, "The days's name must not be null");
        return days.get(name);
    }
}

