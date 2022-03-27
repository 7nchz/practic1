//В области K районов. Известны количество жителей (в тыс. чел.) и плотность населения
// (тыс. чел./км2)
// каждого района. Определить самый густонаселённый район области. 104 задание

public class four {
    ArrayList list = new ArrayList();
list.add(100);
list.add(-666);
list.add(666);
    int min = list.get(0);
    int max = list.get(0);
for (Integer i: list) {
        if(i < min) min = i; if(i > max)
            max = i;
    }
System.out.println("Самый малонаселенный район: " + min);
System.out.println("Самый густонаселенный район: " + max);
}
