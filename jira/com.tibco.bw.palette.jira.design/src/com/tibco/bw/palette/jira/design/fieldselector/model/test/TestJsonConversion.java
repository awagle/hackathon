package com.tibco.bw.palette.jira.design.fieldselector.model.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tibco.bw.palette.jira.design.fieldselector.model.CustomField;

public class TestJsonConversion {

	public static void main(String[] args) throws IOException {

		Gson gson = new Gson();
		FileReader reader = new FileReader(new File("/Users/awagle/Desktop/results.json"));
		BufferedReader bf = new BufferedReader(reader);

		String line = null;
		StringBuffer buffer = new StringBuffer();
		while((line = bf.readLine()) != null) {
			buffer.append(line);
		}   
		Type collectionType = new TypeToken<ArrayList<CustomField>>(){}.getType();
		Object obj = gson.fromJson(buffer.toString(), collectionType);

		System.out.println(obj.getClass());

		System.out.println(gson.toJson(obj, collectionType));
	}

}
