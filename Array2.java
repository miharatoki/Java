// 2.宣言と代入を同時に行う
// データ型[] 配列変数名 = {データ1, データ2, データ3...};


class Array2 {
  public static void main(String[] args) {
    String[] arr = {"Sato", "Suzuki", "Takahashi"};

    // 配列の要素は後から再代入が可能
    arr[1] = "Tanaka";

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
  }
}