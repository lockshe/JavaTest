package Exam2;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        QueryDao queryDao = new QueryDao();
        //queryDao.getFilmByCustomerID(1);
        //queryDao.getCityIDAndName(1);

//        try {
//            SAXReader reader = new SAXReader();
//            File file = new File("src/main/java/Exam2/jdbc.xml");
//            Document document = reader.read(file);
//            System.out.println("fdsf");
//            Element drivername = (Element) document.selectSingleNode("/jdbc/url");
//            System.out.println(drivername.getStringValue());
//        }catch (Exception e){
//            System.out.println(e);
//        }


    }
}
