class Array{
    public static void main(String[] args){
        int[] matte = new int[]{ 3, 10, 5, 7, 9, 12};
        int cnt = 0;
        for(var v: matte){
            cnt += 1;
            if(v % 2 == 0 ){
                System.out.println("num pari");
            }else{
            System.out.println("num dispari");}
        }
        System.out.println("lughezza totale: " + matte.length);
        System.out.println("lughezza for: " + cnt);
    }
}
