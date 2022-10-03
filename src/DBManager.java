 import com.sun.jdi.Value;
 import entities.User;

 import java.sql.*;
 import java.time.LocalDate;
 import java.time.Month;

 import static java.sql.JDBCType.DATE;


 /**
  * @author Giuseppe Corrao
  * @version 1.0
  * start the first time to get Table on local
  */
public class DBManager {
    public static void main(String[] args) {

        /**
         * @Author Giuseppe Corrao
         * before run this program create a DATABASE called flowOpenDev
         * before run this program grant all privileges for this new DB
         */

        try{

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flowOpenDev","developer","developer");

            Statement statement = connection.createStatement();



            statement.execute("CREATE TABLE IF NOT EXISTS Product (\n" +
                    "product_id INTEGER(100) NOT NULL AUTO_INCREMENT,\n" +
                    "product_name VARCHAR(30),\n" +
                    "product_price FLOAT,\n" +
                    "product_color CHAR(30),\n" +
                    "product_description VARCHAR(255),\n" +
                    "product_quantity INTEGER(100),\n" +
                    "product_brand VARCHAR(20) NOT NULL CHECK (product_brand IN('ACER','HP','ASUS','PANASONIC','LENOVO','SAMSUNG','APPLE','XIAOMI','REDMI','RAZER','LG','HUAWEI','NOKIA','SONY','MICROSOFT')),\n" +
                    "PRIMARY KEY (product_id)\n" +
                    ");");

            statement.execute("CREATE TABLE IF NOT EXISTS User (\n" +
                    "User_id INTEGER(100) NOT NULL AUTO_INCREMENT,\n" +
                    "User_name VARCHAR(30),\n" +
                    "User_surname VARCHAR(255),\n" +
                    "User_age INTEGER(120),\n" +
                    "User_birthday DATE,\n" +
                    "User_sex ENUM('male','female'),\n" +
                    "User_email VARCHAR(50),\n" +
                    "User_password VARCHAR(30),\n" +
                    "PRIMARY KEY (User_id)\n" +
                    ");");

            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }



    }

}


