//Найти двузначное число,равное квадрату числа его единиц,сложенному с кубом числа его десятков  128 задание

public class five {
    for (var i = 10; i<= 99; i++){
        if (i == Math.pow(i%10,2)+Math.pow(i/10,2)*(i/10)) WScript.echo(Math.floor(i));
    }
}
