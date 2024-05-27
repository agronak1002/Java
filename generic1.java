class generic1 {
     <T> void display(T e)
    {
        System.out.println(e);
    }
    public static void main(String[] args)
    {
		generic1 obj = new generic1();
        obj.display(11);
        obj.display("Hello");
        obj.display(1.0);
    }
}