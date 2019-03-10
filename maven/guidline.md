Title         : Welcome
Author        : me
Logo          : True

[TITLE]


#A User Guideline for my program 
*这个程序的源代码由两个文件组成，由一个类Pair.class和问题的解决类Solution.class组成
*该程序使用了广度优先遍历来求解WORD LADDER问题，将单词看作图中的节点，求起始单词到结束单*词之间的过程即求他们之间的最短路径。<br>
<br>*定义了一个数据结构Pair作为图中的节点。<br>
>public class Pair {<br>
	   String word;<br>
    int step;<br>
    Pair father;<br>
    ...<br>
}<br>
<br>

*word为该节点对应的单词名，step为起始点到这点的距离，father表示该节点的上一个位置是哪个节点。<br>
*接下来在Solution中，用了队列的数据结构，将访问到的节点加入其中而后继续访问与其相邻的节点，使用BFS，直到抵达结束的节点。<br>
Enjoy!

[reference manual]: http://research.microsoft.com/en-us/um/people/daan/madoko/doc/reference.html  "Madoko reference manual"
