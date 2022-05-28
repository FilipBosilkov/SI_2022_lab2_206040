Филип Босилков 206040

2. public class SILab2 {
    public static List function(List list) {
        if (list.size() <= 0) {   A
            throw new IllegalArgumentException("List length should be greater than 0");   B
        }
        int n = list.size();   C
        int rootOfN = (int) Math.sqrt(n);   D
        if (rootOfN * rootOfN  != n) {   E
            throw new IllegalArgumentException("List length should be a perfect square"); F
        }
        List numMines = new ArrayList<>();   G
        for (int i = 0; i < n; i++) {   H
            if (!list.get(i).equals("#")) {   I
                int num = 0; J
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) {    K
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){  L
                        num += 2; M
                    }
                    else { N
                        num  += 1; O
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ P
                    num++; Q
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ R
                    num++; S
                }
                numMines.add(String.valueOf(num)); T
            }
            else { U
                numMines.add(list.get(i)); V
            }
        }
        return numMines; W
    }
}

Означени се сите редови на код со нивните соодветни имиња. Го графот се дадени нивните соодветни врски. 

3. Цикломатската комплкесност на овој код ќе биде 5. Одредена е според бројот на региони - односно просторот каде што имаме циклус. 

4. Според Every-statement критериумот, имаме три тест случаи. 
Првиот е, доколку внесеме празна листа. Тогаш, ќе се извршат само редовите А и В, бидејќи ќе биде фрлен исклучок, и останатиот дел од кодот нема да се изврши.
Вториот е, доколку внесеме произволна листа, во нашиот случај, [0,0,0,#,0,#,0,0,#]. Во овој случај, ги добиваме сите можни случаи, освен B & F,
а ова е бидејќи тие се наменети за фрлање исклучок. 
Со третиот тест случај, овозможуваме фрлање на исклуокот на линијата F, со тоа што внесуваме листа со должина која што неможе да се коренува.

5. Според Every-branch критериумот, имаме четири тест случаи. Првиот и третиот коишто ги имаме наведено во табелата, се наменети да предизвикаат исклучок, поради
истите причини кои што ги наведов погоре. Но ќе имаме два тест случаи за да се искористат сите врски, бидејќи со користење на [0,0,0,#,0,#,0,0,#], не е доволно
да се изврши последната врска, која што е T-H, односно, да заврши циклусот после извршување на Т. Со користење на [0,0,0,#,0,#,#,0,0] како влез, ќе заврши циклусот кај линијата Т, наместо else случајот кај UV.

