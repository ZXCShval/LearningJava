#2. Условия

##Условная конструкция if-else
~~Любимый оператор YandereDev'a~~ Одна из наиболее распространенных базовых конструкций в коде. Описывает опциональную часть программы, выполнение которой определяется **условием**. Условие выражается логической переменной типа `boolean` вместе с остальной конструкцией следующим образом: 
```
if(<условие>) {
    <блок кода,  который выполнится, если <условие> истинно>
}
```
Данный оператор может обрести весьма причудливую форму при использовании нескольких ступеней `if` и необязательной ветви `else`. По какому пути пойдет программа в таком случае? Зависит от логических значений, вычисляемых для каждого условия в ходе выполнения: 
```
if(<условие_1>) {
    <выполнится, если <условие_1> истинно>
}
else if(<условие_2>) {
    <выполнится, если <условие_1> ложно и <условие_2> истинно>
}
else {
    <выполнится, если оба условия оказались ложными>
}
```
Разберем простой пример:
```
boolean flag = true;
if(flag) {
    System.out.println(1);
}
else {
    System.out.println(2);
}
```
В результате работы такого кода на экране отобразится `1`, потому что значение
логической переменной `flag`, использованной в качестве условия - истина.
Однако, если переменной `flag` присвоить `false`, в конце мы увидим `2`,
поскольку управление после проверки условия будет передано блоку `else`.

##Условные операторы
Условия могут состоять из нескольких частей, которые
описываются различными **логическими операторами**:

| Оператор | Название | Вариант применения | Результат |
|----------|----------|----------------------|---------|
|`!`       | Не        | `!true` |`false` |
|      | | `!false`  |`true`|
|`&`       | И        | `true & true` |`true` |
| | | `true & false` |`false`|
| | | `false & true` | `false`|   
| | | `false & false` | `false` |
|`⏐`       | Или        | `true ⏐ true` | `true` |
| | | `true ⏐ false` |`true` |
| | | `false ⏐ true` | `true` |   
| | | `false ⏐ false` | `false` |
| `==` | Равно | `true == true` | `true` |
| | | `true == false` | `false` |
| | | `false == true` | `false` |
| | | `false == false` | `true` |
| `!=` | Не равно | `true != true` | `false` |
| | | `true != false` | `true` |
| | | `false != true` | `true` |
| | | `false != false` | `false` |

Комплексные условия, формируемые благодаря им, приобретают вид `<простое_условие_1> <логический_оператор> <простое_условие_2> ...` 

Также есть операторы, возвращающие истину или ложь в результате сравнения чисел: `>` (больше), `>=` (больше либо равно),
`<` (меньше), `<=` (меньше либо равно). Их применение весьма тривиально:
```
if(6 > 8 & 4 <= 8 / 2) {
    // Условие 1: 6 > 8 - ложь
    // Условие 2: 4 <= 8 / 2 - истина
    // Результат: ложь и истина - ложь
    System.out.println("Блок 'if' не сработает")
}
```
И, напоследок, стоит отметить следующее: операторы `&` и `|` имеют более оптимизированные версии `&&` и `||` соответственно.
Благодаря им вычисление результата прекращается, когда он уже ясен из левой части выражения. Если в примере выше вместо `&` использовать `&&`,
то проверка условия прекратится как раз при достижении `&&` внутри выражения. Все потому, что выражение `false & x` всегда ложно, чем бы ни было `x`.

##Задачи
>**1.** Описать класс `Conditionals` с методом `public static void main(String[] args) { }`, который автоматически станет точкой входа в программу. _Добавить в Git_. Внутри метода завести целочисленную переменную `myFavNumber`, значение которой будет равно вашему любимому числу. Сравнить значение переменной с `42`. Если ваше число больше, отнять от него `42`. Если меньше, удвоить значение `myFavNumber`, а если равно - утроить. Вывести результат на экран. _Закоммитить и запушить_

>**2.** Ниже, в том же методе, завести переменную `dayOfWeek`, используя следующий код:
```
int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();
```
> На строчке 1 должен появиться `import java.time.LocalDate;`. Описать конструкцию `switch-case`, где, в зависимости от номера дня недели, на экран выводится его название. Вместо _"Суббота"_ и _"Воскресенье"_ вывести _"Выходные"_.  _Закоммитить и запушить_