class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean equals(SimpleDate object){
        int cmp = object.year - this.year;
        if(cmp == 0){
            cmp = object.month - this.month;
            if(cmp == 0){
                cmp = object.day - this.day;
                if(cmp == 0)
                    return true;
            }
        }

        return false;
    }

    public static void main(String args[]){
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
