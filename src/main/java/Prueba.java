import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class Prueba {

    @Test
    public void User(){

        RestAssured.baseURI = "https://reqres.in/api";

        String body = RestAssured.
                given().
                when().get("/users").
                then().extract().body().asString();

        System.out.println(body);

    }

    @Test
    public void Usuario(){
        RestAssured.baseURI = "https://reqres.in/api";

        String body = RestAssured.
                given().
                when()
                .get("/users").
                then().
                body("data[1].first_name",equalTo("Janet")).
                extract().asString();

        System.out.println(body);




    }
}
