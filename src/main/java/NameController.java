import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class NameController {


    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
        staticFileLocation("/public");

        Name name = new Name();

        get("/one", (req, res) -> {
            String result = name.returnName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            return new ModelAndView(model, "name.vtl");
        }, velocityTemplateEngine);

        get("/two", (req, res) -> {
            String result = name.returnNamePair();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name_pair", result);
            return new ModelAndView(model, "name_pair.vtl");
        }, velocityTemplateEngine);
    }

}
