package extensions;

import io.qameta.allure.Step;
import utilities.CommonOps;

import java.sql.SQLException;
import java.util.*;

public class DBActions extends CommonOps {

        @Step("Get Credentials from Database")
        public static List<String> getCredentials(String query){
            List<String> credentials = new ArrayList<>();
            try {
                rs = stmt.executeQuery(query);
                rs.next();
                credentials.add(rs.getString(1));
                credentials.add(rs.getString(2));

            } catch (Exception e) {
                System.out.println("Error Occurred while Printing table Data, see Details: " + e);
            }
            return credentials;
        }
}
