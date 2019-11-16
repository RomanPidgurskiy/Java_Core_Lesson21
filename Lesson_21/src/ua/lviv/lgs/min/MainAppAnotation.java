package ua.lviv.lgs.min;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class MainAppAnotation {

	public static void main(String[] args) throws Exception {
		getAnnotatedFieldsAndValues(Books.class);

	}

	public static void getAnnotatedFieldsAndValues(Class<?> customClass) throws Exception {
		Field[] fields =customClass.getDeclaredFields();
		
		File files = new File("FileAnnotation.txt");
		OutputStream File_Out_Stream = new FileOutputStream(files);
		ObjectOutputStream Object_Out_Stream = new ObjectOutputStream(File_Out_Stream);
	
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(BookAnotation.class) instanceof BookAnotation) {
				String str=field.getType().getSimpleName()+"  "+field.getName()+"  Annotation = "+field.getAnnotation(BookAnotation.class).value();
				Object_Out_Stream.writeUTF(str);
			}
		}
		Object_Out_Stream.close();
		File_Out_Stream.close();
	}
	
	
	
}
