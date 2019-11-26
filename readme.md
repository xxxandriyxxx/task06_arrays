## Tasks

###1
1. Write your generic class – container with units. You can put and get units from container. 
Try to implement it using wildcards.
2. Write your PriorityQueue class using generics.
3. Try how you can add string into List<Integers>.

###2
1. Logical tasks for arrays (see an additional file).
2. Create a container that encapsulates an array of String, and that only adds Strings and gets Strings, 
so that there are no casting issues during use. If the internal array isn’t big enough for the next add, 
your container should automatically resize it. In main( ), compare the performance of your container with 
an ArrayList holding Strings.
3. Create a class containing two String objects and make it Comparable so that the comparison only cares 
about the first String. Fill an array and an ArrayList with objects of your class by using a custom generator 
(eg, which generates pairs of Country-Capital). Demonstrate that sorting works properly. Now make a Comparator 
that only cares about the second String and demonstrate that sorting works properly. Also perform a binary 
search using your Comparator.
4. Сreate a Deque class and test it.

###2.1
A. Дано два масиви. Сформувати третій масив, що складається з тих елементів, які: а) присутні в обох масивах; 
б) присутні тільки в одному з масивів.

B. Видалити в масиві всі числа, які повторюються більше двох разів.

C. Знайти в масиві всі серії однакових елементів, які йдуть підряд, і видалити з них всі елементи крім одного.

D. Герой комп'ютерної гри, що володіє силою в 25 балів, знаходиться в круглому залі, з якого ведуть 10 закритих дверей. 
За кожними дверима героя чекає або магічний артефакт, що дарує силу від 10 до 80 балів, або монстр, який має силу 
від 5 до 100 балів, з яким герою потрібно битися. Битву виграє персонаж, що володіє найбільшою силою; якщо сили рівні, 
перемагає герой.
1. Організувати введення інформації про те, що знаходиться за дверима, або заповнити її, використовуючи генератор 
випадкових чисел.
2. Вивести цю саму інформацію на екран в зрозумілому табличному вигляді.
3. Порахувати, за скількома дверима героя чекає смерть. Рекурсивно.
4. Вивести номери дверей в тому порядку, в якому слід їх відкривати герою, щоб залишитися в живих, якщо таке можливо.


