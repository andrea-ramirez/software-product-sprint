package com.google.sps.servlets;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/** Handles requests sent to the /randomMessage URL. */
@WebServlet("/randomQuote")
public class RandomQuote extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> messages = new ArrayList<String>();
    messages.add("When in doubt, go to the library. -Ron");
    messages.add("Fear of a name only increases fear of the thing itself. - Hermione");
    messages.add("Wit beyond measure is man's greatest treasure. -Luna");

    //Convert messages to JSON
    String json = convertToJsonUsingGson(messages);

    //Send json as a response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

    /**
   * Converts a ServerStats instance into a JSON string using the Gson library. Note: We first added
   * the Gson library dependency to pom.xml.
   */
  private String convertToJsonUsingGson(ArrayList<String> randomMessages) {
    Gson gson = new Gson();
    String json = gson.toJson(randomMessages);
    return json;
  }
}
