# Втора лабораториска вежба по Софтверско инженерство
## Филип Босилков, бр. на индекс 206040

### Control Flow Graph

<img src="/CFG.png" alt="CFG"/>

### Цикломатска комплексност

Цикломатската комплкесност на овој код ќе биде 9. Одредена е според бројот на региони 8+1.

### Тест случаи според критериумот Every statement

<img src="/everystatement.png" alt="Every statement"/>

### Тест случаи според критериумот Every path

<img src="/everybranch.png " alt="Every Branch"/>

### Објаснување на напишаните unit tests

Според Every-statement критериумот, имаме три тест случаи. 
Првиот е, доколку внесеме празна листа. Тогаш, ќе се извршат само редовите А и В, бидејќи ќе биде фрлен исклучок, и останатиот дел од кодот нема да се изврши.
Вториот е, доколку внесеме произволна листа, во нашиот случај, [0,0,0,#,0,#,0,0,#]. Во овој случај, ги добиваме сите можни случаи, освен B & F,
а ова е бидејќи тие се наменети за фрлање исклучок. 
Со третиот тест случај, овозможуваме фрлање на исклуокот на линијата F, со тоа што внесуваме листа со должина која што неможе да се коренува.

Според Every-branch критериумот, имаме четири тест случаи. Првиот и третиот коишто ги имаме наведено во табелата, се наменети да предизвикаат исклучок, поради
истите причини кои што ги наведов погоре. Но ќе имаме два тест случаи за да се искористат сите врски, бидејќи со користење на [0,0,0,#,0,#,0,0,#], не е доволно
да се изврши последната врска, која што е T-H, односно, да заврши циклусот после извршување на Т. Со користење на [0,0,0,#,0,#,#,0,0] како влез, ќе заврши циклусот кај линијата Т, наместо else случајот кај UV.

