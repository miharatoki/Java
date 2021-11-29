// 多重配列の作り方

class Array3 {
  public static void main(String[] args) {
    String[][] arr;
    arr = new String[2][2];

    // 宣言と代入を同時に行う場合
    // String[][] arr = {{"Sato", "Suzuki"}, {"Takahashi", "Tanaka"}};

    arr[0][0] = "Sato";
    arr[0][1] = "Suzuki";
    arr[1][0] = "Takahashi";
    arr[1][1] = "Tanaka";

    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
  }
}