package tgbot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 * Проверяет логику бота
 */
class BotLogicTest {
    /**
     * Проверяет корректность ответа бота
     */
    @Test
    void shouldEchoUserText() {
        BotLogic botLogic = new BotLogic();
        Assertions.assertEquals("Вы ввели: «привет»", botLogic.botMessage("привет"));
    }
}