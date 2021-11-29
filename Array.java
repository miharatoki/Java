// 配列を扱う変数を、配列変数
// 配列変数の名前を、配列変数名

// 配列のつくれり方は2種類

// 1.宣言と代入を同時に行う
// データ型[] 配列変数名;
// 配列変数名　= new データ型[要素数];
class Array {
  public static void main(String[] args) {
    String[] arr;
    arr = new String[3];

    arr[0] = "Sato";
    arr[1] = "Suzuki";
    arr[2] = "Takahashi";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}