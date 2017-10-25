package test;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	static class PersonData {
	    int age;
	    String surname;
	    public String toString() {
	        return "[age = " + age + ", surname = " + surname + "]";
	    }
	}

	public static void main(String[] args) {
	    String json = "{\"Andy\": {\"age\": 25,\"surname\": \"Miller\"}}";
	    System.out.println(json);
	    Gson gson = new Gson();
	    Map<String, PersonData> decoded = gson.fromJson(json, new TypeToken<Map<String, PersonData>>(){}.getType());
	    System.out.println(decoded);
	}
}
