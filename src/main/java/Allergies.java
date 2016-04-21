import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Allergies {
  public static void main(String[] arg) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/home.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/results", (request,response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/results.vtl");
//
//       String input = request.queryParams("input");
//       Integer integerInput = Integer.parseInt(input);
//       String changeBack = changeBack(integerInput);
// // change these
//       model.put("integerInput", integerInput);
//       model.put("changeBack", changeBack);
//       model.put("input", request.queryParams("input"));
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
  }
    public static ArrayList<Object> allergies(Integer input) {
      ArrayList<Object> allergiesList = new ArrayList<Object>();
      String finalAllergies = "";

      while (input > 0) {
        if (input >= 128) {
          input -= 128;
          allergiesList.add("cats");
        } else if (input >= 64) {
          input -= 64;
          allergiesList.add("pollen");
        } else if ( input >= 32) {
          input -= 32;
          allergiesList.add("chocolate");
        } else if ( input >= 16) {
          input -= 16;
          allergiesList.add("tomatoes");
        } else if ( input >= 8) {
          input -= 8;
          allergiesList.add("strawberries");
        } else if ( input >= 4) {
          input -= 4;
          allergiesList.add("shellfish");
        } else if ( input >= 2) {
          input -= 2;
          allergiesList.add("peanuts");
        } else if ( input >= 1) {
          input -= 1;
          allergiesList.add("eggs");
        } else {
          allergiesList.add("");
        }
      }
      return allergiesList;
    }
    // change these
}
