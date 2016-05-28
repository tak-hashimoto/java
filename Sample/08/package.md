### 第１７章 パッケージ（要点）
* ** パッケージ **
 ** 名前の衝突を防ぐために用意されたグループ訳の仕組み。
 クラスの名前が同じであってもパッケージが異なっている限り、異なるクラスとして扱われる。 **

 _ 今まで記述していたpublicなクラスは、パッケージの外からも利用できる。また、publicと宣言していないクラスはパッケージの中でしか使うことができない。 _

>パッケージ名.クラス名
>例）java.util.Random　(java.utilがパッケージ名、Randomはクラス名）


* ** import **
 ** パッケージの取り込みを明示するもの。**
 明示することで、パッケージ内のすべてのpublicなクラスとインターフェースをとりこむことができる。

>import パッケージ名.＊;
>例)import java.util.＊; 　(java.utilがパッケージ名、*は"このパッケージ内のクラスとインターフェースに合致"という意味。"このパッケージ何のサブパッケージに合致" という意味ではない)



#### アクセス制御に関して覚えること!!

##### アクセス制御とは
パッケージの外からどのクラスが使えるか、またクラスの外からどのメソッドが使えるのかを制御すること(決めること）





#### ↓これは覚えておこう↓
|修飾子 |　機能|
|:-----|-----------:|
| private| 自分のクラス内だけに見せる|
| protected| パッケージだけでなくサブクラスにも見せる|
| public| みんなに見せる |
| なし | 自分のパッケージに見せる|

#### イメージ
 ![図](/Users/tak-hashimoto/Documents/workspace/java/Sample/08/package.gif)