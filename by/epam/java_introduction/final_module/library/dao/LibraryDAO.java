package by.epam.java_introduction.final_module.library.dao;


import by.epam.java_introduction.final_module.library.bean.Library;

public interface LibraryDAO {
	
	
	void saveLibraryInFile(Library library);		
	Library loadLibraryFromFile();

}