class Boolean_type {
  public static void main(String[] args) {
    // ブーリアン型
    // True（真）もしくはFale（偽）のどちらかの値を持つ

    int var_a = 10;
    int var_b = 1;
    boolean var_bool;

    var_bool = (var_a < var_b);
    
    // 10 > 1は真なので、変数var_boolの中身はTrue
    System.out.println(var_bool);
  }
}