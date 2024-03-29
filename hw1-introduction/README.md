# ДЗ 1. Введение
## Дедлайн
**Мягкий дедлайн** - 16 октября в 21-00

**Жесткий дедлайн** - 20 октября в 23-59
## Как сдать
Реализуйте нужные классы. Запустите у себя на компьютере тесты. Для этого откройте консоль и выполните команду
```bash
./gradlew test
```

Если тесты прошли успешно - вы увидите надпись `BUILD SUCCESSFUL` , если же вы увидите надпись `BUILD FAILED`, то найдите в сообщении в терминале название теста и посмотрите этот тест в директории `src/test/groovy/`

После этого отправьте свое решение в ветку **IntroTasks**. Призовите меня (ivanetc) в комментариях, где, **пожалуйста**, **напишите** "Cдаю задачи 1, 2, 3 ... n".
Убедитесь, что тесты проходят локально.

## Вводные задачи

1. `IntroTask3Digits` Дано число, проверить, что в нем ровно три цифры.
2. `IntroTaskLast5` Дано число, проверить, верно ли, что у него на конце цифра 5.
3. `IntroTaskSameDigits` Дано число, проверить, верно ли, что у него на конце две одинаковые цифры.
4. `IntroTaskLeap` Дан год, определить, високосный или нет. Обязательно прочитайте в википедии, что такое високосный год.
5. `IntroTaskCat` Дано целое число. Верните строку, в которой к этому числу приписано существительное "кот"
   в правильной форме. Например, "1 кот", "2 кота", "5 котов".
6. `IntroTaskQuadraticEquation` Даны коэффициенты квадратного уравнения, целые числа a, b, c: \\(ax^2+bx+c = 0\\) Решите квадратное уравнение.
   Разберите все случаи, включая \\(a = 0\\). Верните ответ в виде одной из следующих строк: «no solution», «one solution x = ...»,
   «two solutions x1 = ..., x2 = ...» или «there are infinitely many solutions». Округлите ответы до двух знаков после запятой.
   Если в уравнении два корня, сначала выведите меньший корень.
7. `PrimalityTest` Дано число, проверить его на простоту.
    * можете перебрать делители числа \\(n\\) от 2 до \\(n - 1\\) и проверить, что ни один из них не подходит.
    * или можете оптимизировать, перебирая только до квадратного корня