public class Book {
    private String name, isbn,  category, publish, totalpage;
    private Float price;

    public Book(String name1, String isbn1, Float price1, String category1, String publish1, String totalpage1) {
        this.setName(name1);
        this.setIsbn(isbn1);
        this.setPrice(price1);
        this.setCategory(category1);
        this.setPublish(publish1);
        this.setTotalpage(totalpage1);


        if (isbn.length()==13){
            isbn=isbn1;
        }else {
            System.out.println("------------------------------警告!!!!!!!輸入字串少於13碼-------------------------------------");
        }
        if (price<0){
            System.out.println("-----------------------------工讀生，要付的錢由你的薪水支付-----------------------------------");
        }else {price=price1;}
    }
    //get
    public String getName() { return name; }

    public String getIsbn() { return isbn; }

    public float getPrice() { return price; }

    public String getCategory() { return category; }

    public String getPublish() { return publish; }

    public String getTotalpage() { return totalpage; }
    //set
    public void setName(String name2) { name=name2; }

    public void setIsbn(String isbn2) { isbn=isbn2; }

    public void setPrice(float price2) { price=price2; }

    public void setCategory(String category2) { category=category2; }

    public void setPublish(String publish2) { publish=publish2; }

    public void setTotalpage(String totalpage2) { totalpage=totalpage2; }

    public void showAll() {
        System.out.println("---------------我是分隔線--------------");
        System.out.println("Name(書名):" + this.getName());
        System.out.println("Isbn:" + this.getIsbn());
        System.out.println("Price(價格):" + this.getPrice());
        System.out.println("Category(類型):" + this.getCategory());
        System.out.println("Publish(出版社):" + this.getPublish());
        System.out.println("Totalpage(總頁數):" + this.getTotalpage());
        System.out.println("---------------我是分隔線--------------");
    }

}