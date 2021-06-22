class IncrementoDecremento {

    public static void main(String[] args) {
        int count = 0;
        count--;
        count--;
        System.out.println(--count); //Este tambien incrementa mediante el ++
        count-=5; //esto es igual a count=count-5, eso tambien funciona con +,*,/
        System.out.println(count);
    }
}
