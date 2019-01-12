import AraayList.AraayList;

import java.io.File;
import java.util.Date;

public class Chat {
    String nazvanie;
    String author;
    Date dataSozdanie;
    Date dataPoslobnov;
    AraayList<Soobsch> soobschenie;
    File chatFile;

    public Chat() {
    }



    public Chat(String nazvanie) {
        this.nazvanie = nazvanie;
        chatFile = new File("Z:\\chats\\"+nazvanie);
        //Если чат существует то открываем его и выводим сообщение
        if((chatFile.exists())&&(!chatFile.isDirectory())){
            ///todo
        }else{
            //Иначе, создаем пстой массив сообщений и устанавлеваем дату создания
            dataSozdanie= new Date();
            author= "А.Ф.Я";
        }
    }

    public void obnovitChat(){

    }


    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDataSozdanie() {
        return dataSozdanie;
    }

    public void setDataSozdanie(Date dataSozdanie) {
        this.dataSozdanie = dataSozdanie;
    }

    public Date getDataPoslobnov() {
        return dataPoslobnov;
    }

    public void setDataPoslobnov(Date dataPoslobnov) {
        this.dataPoslobnov = dataPoslobnov;
    }

    public AraayList<Soobsch> getSoobschenie() {
        return soobschenie;
    }

    public void setSoobschenie(AraayList<Soobsch> soobschenie) {
        this.soobschenie = soobschenie;
    }


}
