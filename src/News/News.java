package News;

import java.util.Scanner;

public class News implements INews{
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    float AverageRate;

    public News() {
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
        AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void Calculate(){
        Scanner sc = new Scanner(System.in);
        int[] RateList = new int[3];
        for(int i=0; i<RateList.length;i++){
            System.out.println("Enter rate list["+i+1+"]:");
            RateList[i] = sc.nextInt();
        }
        int sum = 0;
        float Avg = 0;
        for(int i=0; i<RateList.length;i++){
            sum += RateList[i];
            Avg = (float)sum/RateList.length;
        }
        AverageRate = Avg;
    }

    @Override
    public void display() {
        System.out.println("Title: "+getTitle()+" Publish Date: "+PublishDate+" Content: "+getContent()+ " Author: "+getAuthor() +" Average Rate: "+getAverageRate());
    }
}
