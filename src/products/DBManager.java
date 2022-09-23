package products;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

/**
 * @author Giuseppe Corrao
 * @version 1.0
 * start the first time to get Table on local
 */
public class DBManager {
    public static void main(String[] args) {

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb","developer","developer");

            Statement statement = connection.createStatement();


            statement.execute("CREATE TABLE IF NOT EXISTS Product (\n" +
                    "product_id INTEGER(100) NOT NULL AUTO_INCREMENT,\n" +
                    "product_name VARCHAR(30),\n" +
                    "product_price FLOAT,\n" +
                    "product_color CHAR(30),\n" +
                    "product_description VARCHAR(255),\n" +
                    "product_quantity INTEGER(100),\n" +
                    "product_brand ENUM('ACER','HP','ASUS','PANASONIC','LENOVO','SAMSUNG','APPLE','XIAOMI','REDMI','RAZER','LG','HUAWEI','NOKIA','SONY','MICROSOFT'),\n" +
                    "PRIMARY KEY (product_id)\n" +
                    ");");

            statement.execute("CREATE TABLE IF NOT EXISTS User (\n" +
                    "User_id INTEGER(100) NOT NULL AUTO_INCREMENT,\n" +
                    "User_name VARCHAR(30),\n" +
                    "User_surname INTEGER(255),\n" +
                    "User_age INTEGER(120),\n" +
                    "User_birthday DATE,\n" +
                    "User_sex ENUM('male','female'),\n" +
                    "User_email VARCHAR(50),\n" +
                    "User_password VARCHAR(20),\n" +
                    "PRIMARY KEY (User_id)\n" +
                    ");");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
