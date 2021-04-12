public class Printer {
    private int tonerLevel,pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel,int pagesPrinted,boolean isDuplexPrinter) {
        this.isDuplexPrinter = isDuplexPrinter;
        this.pagesPrinted=pagesPrinted;
        this.tonerLevel=tonerLevel;
    }

    public void changeTonerLevel(int changeTonerLevel) {
        if(this.tonerLevel+changeTonerLevel<=100)
            this.tonerLevel+=changeTonerLevel;
    }

    public void printingPage(int page) {
        if(tonerLevel>0){
            pagesPrinted+=page;
            tonerLevel-=1;
        }
        else
            System.out.println("Toner is empty, please refill it.");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }
}
